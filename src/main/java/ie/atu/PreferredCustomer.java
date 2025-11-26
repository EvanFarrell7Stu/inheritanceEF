package ie.atu;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel; // 0.05 for 5%, etc.

    public PreferredCustomer() {
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints, double discountLevel) {
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    public void setLoyaltyPoints(int loyal) {
        this.loyaltyPoints = loyal;
        updateDiscountLevel();
    }

    public void setDiscountLevel(double d) {
        this.discountLevel = d;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
    public double getDiscountLevel() {
        return discountLevel;
    }

    private void updateDiscountLevel() {
        if(loyaltyPoints>500&&loyaltyPoints<1000) {
            discountLevel = 0.05;
        }
        else if(loyaltyPoints>1000&&loyaltyPoints<1500) {
            discountLevel = 0.06;
        }
        else if(loyaltyPoints>1500&&loyaltyPoints<2000) {
            discountLevel = 0.08;
        }
        else if(loyaltyPoints>2000) {
            discountLevel = 0.10;
        }
        }

        public void addLoyaltyPoints(int points) {
            this.loyaltyPoints += points;
            updateDiscountLevel();
        }

    }

    /*< 500 0.00 (0%)
500–999 0.05 (5%)
1000–1499 0.06 (6%)
1500–1999 0.07 (7%)
>= 2000 0.10 (10%)
*/

    @Override
    public String toString() {
        return  super.toString() +
                "loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel;
    }
}
