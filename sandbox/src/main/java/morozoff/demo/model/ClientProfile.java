package morozoff.demo.model;

public class ClientProfile {

    private String companyName = "ООО Кондитер";
    private String territoryName = "Москва и МО";
    private String productArea = "кондитерские изделия, бакалея, кофе, чай";
    private int saleTeam = 30;
    private int networks = 50;
    private int wholesales = 150;
    private int retials = 1500;
    private boolean isSelfDelivery = true;

    public String getCompanyName() {
        return companyName;
    }

    public ClientProfile withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getTerritoryName() {
        return territoryName;
    }

    public ClientProfile withTerritoryName(String territoryName) {
        this.territoryName = territoryName;
        return this;
    }

    public String getProductArea() {
        return productArea;
    }

    public ClientProfile withProductArea(String productArea) {
        this.productArea = productArea;
        return this;
    }

    public int getSaleTeam() {
        return saleTeam;
    }

    public ClientProfile withSaleTeam(int saleTeam) {
        this.saleTeam = saleTeam;
        return this;
    }

    public int getNetworks() {
        return networks;
    }

    public ClientProfile withNetworks(int networks) {
        this.networks = networks;
        return this;
    }

    public int getWholesales() {
        return wholesales;
    }

    public ClientProfile withWholesales(int wholesales) {
        this.wholesales = wholesales;
        return this;
    }

    public int getRetials() {
        return retials;
    }

    public ClientProfile withRetials(int retials) {
        this.retials = retials;
        return this;
    }

    public boolean isSelfDelivery() {
        return isSelfDelivery;
    }

    public ClientProfile setSelfDelivery(boolean selfDelivery) {
        isSelfDelivery = selfDelivery;
        return this;
    }
}
