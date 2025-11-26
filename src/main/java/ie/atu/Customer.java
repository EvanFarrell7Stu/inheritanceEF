package ie.atu;

public class Customer extends Person {
    private int customerNumber;
    private boolean mailingList;

    public Customer(int customerNumber, boolean mailingList) {
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public Customer() {
        this.customerNumber = 0;
        this.mailingList = false;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    public void setMailingList(boolean b) {
        this.mailingList = b;
    }
    public boolean getMailingList() {
        return mailingList;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "customerNumber=" + customerNumber +
                ", mailingList=" + mailingList;
    }
}
