public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() { return telcoName; }
    public double getPromoPrice() { return promoPrice; }
    public boolean getUnliCallText() { return unliCallText; }
    public int getDataAllowance() { return dataAllowance; }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(this.telcoName, price);
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(this.telcoName, unliCallText);
    }
}

