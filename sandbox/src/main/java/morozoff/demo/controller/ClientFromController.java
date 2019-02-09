package morozoff.demo.controller;

import morozoff.demo.model.AdminProfile;
import morozoff.demo.model.ClientProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ClientFromController {

    @RequestMapping(value="/greeting", method= RequestMethod.GET)
    public String clientForm(Model model) {
        model.addAttribute("clientProfile", new ClientProfile());
        return "greeting";
    }

    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String clientFormSubmit(@ModelAttribute ClientProfile clientProfile, Model model) {
        model.addAttribute("clientProfile", clientProfile);
        AdminProfile ap = new AdminProfile();
        calculateTMA(clientProfile, ap);
        calculateBonus(clientProfile, ap);
        calculateIncome(clientProfile, ap);
        return "greeting";
    }

    public int volumeIn(ClientProfile cp) {
        return cp.getNetworks()*6 + cp.getWholesales()*1500 + cp.getRetails()*12;
    }

    public void refineProfile(ClientProfile cp, AdminProfile ap) {
        if (cp.getNetworks() >= 0 & cp.getNetworks() < 5 &
                cp.getWholesales() >= 15 & cp.getWholesales() < 30 &
                cp.getRetails() >= 30 & cp.getRetails() < 100 &
                cp.getSaleTeam() <= 5) {
            cp.withInterest(ap.getFa()).withPrice(ap.getPriceA());
        }
        else if (cp.getNetworks() >= 5 & cp.getNetworks() < 20 &
                cp.getWholesales() >= 30 & cp.getWholesales() < 50 &
                cp.getRetails() >= 100 & cp.getRetails() < 300) {
            cp.withInterest(ap.getFb()).withPrice(ap.getPriceB());
        }
        else if (cp.getNetworks() >= 20 &
                cp.getWholesales() >= 50 & cp.getWholesales() < 100 &
                cp.getRetails() >= 300 & cp.getRetails() < 1000) {
            cp.withInterest(ap.getFс()).withPrice(ap.getPriceC());
        }
        else if ((cp.getNetworks() >= 5 & cp.getNetworks() >= 20 &
                cp.getWholesales() >= 100 & cp.getRetails() >= 100) || cp.getSaleTeam() > 5) {
            cp.withInterest(ap.getFd()).withPrice(ap.getPriceD());
        }
    }

    public void calculateTMA(ClientProfile cp, AdminProfile ap) {
        int vin = volumeIn(cp);
        refineProfile(cp, ap);
        cp.withTma((int) Math.round(vin * cp.getPrice() * cp.getInterest() / 100));
    }

    public void calculateBonus(ClientProfile cp, AdminProfile ap) {
        int vin = volumeIn(cp);
        refineProfile(cp, ap);
        int delivery = 0;
        if (cp.getDelivery() == "EXW") {
            delivery = 3;
        }
        cp.withBonus((int) Math.round(vin * cp.getPrice() * 0.8 * (ap.getBonusGraph() + ap.getBonusPlan() + ap.getBonusQuarter()) / 100));
    }

    public void calculateIncome(ClientProfile cp, AdminProfile ap) {
        refineProfile(cp, ap);
        int vin = volumeIn(cp);
        cp.withIncome((int) Math.round((cp.getNetworks() * cp.getPrice() * (100 + ap.getExtraNetwork()) / 100 * 0.7)
                + (cp.getRetails() * cp.getPrice() * (100 + ap.getExtraRetial()) / 100 * 0.7)
                + (cp.getWholesales() * cp.getPrice() * (100 + ap.getExtraWholesale()) / 100 * 0.7)));
    }
}
