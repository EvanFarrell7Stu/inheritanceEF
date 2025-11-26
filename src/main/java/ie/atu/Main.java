package ie.atu;

public class Main{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAddress("123 Street");
        person1.setPhoneNumber("123456789");

        System.out.println(person1.toString());

        Customer part1Customer = new Customer();
        part1Customer.setName("Alice");
        part1Customer.setAddress("123 Street");
        part1Customer.setPhoneNumber("123456789");
        part1Customer.setCustomerNumber(1001);
        part1Customer.setMailingList(true);

        System.out.println(part1Customer.toString());

        Customer part2Customer = new Customer();
        part2Customer.setName("Bob Jones");
        part2Customer.setAddress("2 Low Streety");
        part2Customer.setPhoneNumber("123456789");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);

        System.out.println(part2Customer.toString());

        PreferredCustomer preferredCustomer1 = new PreferredCustomer();
        preferredCustomer1.setName("John");
        preferredCustomer1.setAddress("123 Street");
        preferredCustomer1.setPhoneNumber("123456789");
        preferredCustomer1.setCustomerNumber(1001);
        preferredCustomer1.setMailingList(true);
        preferredCustomer1.setDiscountLevel(0.5);
        preferredCustomer1.setLoyaltyPoints(15);

        System.out.println(preferredCustomer1.toString());
    }
}
