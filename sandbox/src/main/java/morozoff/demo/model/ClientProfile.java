package morozoff.demo.model;

public class ClientProfile {

    private String companyName = "ООО Кондитер";
    private String territoryName = "Москва и МО";
    private String productArea = "кондитерские изделия, бакалея, кофе, чай";
    private int saleTeam = 30;
    private int networks = 50;
    private int wholesales = 150;
    private int retails = 1500;
    private String delivery;
    private int interest;
    private double price;
    private int tma;
    private int bonus;
    private int income;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTerritoryName() {
        return territoryName;
    }

    public void setTerritoryName(String territoryName) {
        this.territoryName = territoryName;
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

    public void setSaleTeam(int saleTeam) {
        this.saleTeam = saleTeam;
    }

    public int getNetworks() {
        return networks;
    }

    public void setNetworks(int networks) {
        this.networks = networks;
    }

    public int getWholesales() {
        return wholesales;
    }

    public void setWholesales(int wholesales) {
        this.wholesales = wholesales;
    }

    public int getRetails() {
        return retails;
    }

    public void setRetails(int retails) {
        this.retails = retails;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public int getInterest() {
        return interest;
    }

    public ClientProfile withInterest(int interest) {
        this.interest = interest;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public ClientProfile withPrice(double price) {
        this.price = price;
        return this;
    }

    public int getTma() {
        return tma;
    }

    public ClientProfile withTma(int tma) {
        this.tma = tma;
        return this;
    }

    public int getBonus() {
        return bonus;
    }

    public ClientProfile withBonus(int bonus) {
        this.bonus = bonus;
        return this;
    }

    public int getIncome() {
        return income;
    }

    public ClientProfile withIncome(int income) {
        this.income = income;
        return this;
    }

}
