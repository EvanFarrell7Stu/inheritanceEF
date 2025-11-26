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
    }
}
