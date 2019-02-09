package morozoff.demo.model;

public class AdminProfile {
    private int bonusPlan = 3;
    private int bonusGraph = 1;
    private double bonusQuarter = 0.33;
    private int Fa = 0;
    private int Fb = 4;
    private int Fс = 5;
    private int Fd = 6;
    private int extraNetwork = 35;
    private int extraWholesale = 12;
    private int extraRetial = 30;
    private double priceA = 111.65;
    private double priceB = 110.95;
    private double priceC = 116.67;
    private double priceD = 108.66;
    private int extraDelivery = 2;

    public int getBonusPlan() {
        return bonusPlan;
    }

    public AdminProfile withBonusPlan(int bonusPlan) {
        this.bonusPlan = bonusPlan;
        return this;
    }

    public int getBonusGraph() {
        return bonusGraph;
    }

    public AdminProfile withBonusGraph(int bonusGraph) {
        this.bonusGraph = bonusGraph;
        return this;
    }

    public double getBonusQuarter() {
        return bonusQuarter;
    }

    public AdminProfile withBonusQuarter(double bonusQuarter) {
        this.bonusQuarter = bonusQuarter;
        return this;
    }

    public int getFa() {
        return Fa;
    }

    public AdminProfile withFa(int fa) {
        Fa = fa;
        return this;
    }

    public int getFb() {
        return Fb;
    }

    public AdminProfile withtFb(int fb) {
        Fb = fb;
        return this;
    }

    public int getFс() {
        return Fс;
    }

    public AdminProfile withFс(int fс) {
        Fс = fс;
        return this;
    }

    public int getFd() {
        return Fd;
    }

    public AdminProfile withFd(int fd) {
        Fd = fd;
        return this;
    }

    public int getExtraNetwork() {
        return extraNetwork;
    }

    public AdminProfile withExtraNetwork(int extraNetwork) {
        this.extraNetwork = extraNetwork;
        return this;
    }

    public int getExtraWholesale() {
        return extraWholesale;
    }

    public AdminProfile withExtraWholesale(int extraWholesale) {
        this.extraWholesale = extraWholesale;
        return this;
    }

    public int getExtraRetial() {
        return extraRetial;
    }

    public AdminProfile withExtraRetial(int extraRetial) {
        this.extraRetial = extraRetial;
        return this;
    }

    public double getPriceA() {
        return priceA;
    }

    public AdminProfile withPriceA(double priceA) {
        this.priceA = priceA;
        return this;
    }

    public double getPriceB() {
        return priceB;
    }

    public AdminProfile withPriceB(double priceB) {
        this.priceB = priceB;
        return this;
    }

    public double getPriceC() {
        return priceC;
    }

    public AdminProfile withPriceC(double priceC) {
        this.priceC = priceC;
        return this;
    }

    public double getPriceD() {
        return priceD;
    }

    public AdminProfile withPriceD(double priceD) {
        this.priceD = priceD;
        return this;
    }

    public int getExtraDelivery() {
        return extraDelivery;
    }

    public AdminProfile withExtraDelivery(int extraDelivery) {
        this.extraDelivery = extraDelivery;
        return this;
    }
}
