package morozoff.demo.controller;

import morozoff.demo.model.ClientProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientFromController {
    @RequestMapping(value="/greeting", method= RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new ClientProfile());
        return "greeting";
    }
}
