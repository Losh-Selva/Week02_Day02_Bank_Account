import java.time.LocalDate;

public class Customer {
    public static void main(String[] args) {
         Account one = new Account("Harry", "Potter", 2435, 0,LocalDate.of(2022,11,11), "Business");
         Account two = new Account("Fleur", "Delacour", 2201, 20, LocalDate.of(2022,10,11), "Standard");

         one.setSurname("Isabelle");
        two.setSurname("Potter");
         //System.out.println(one.balance); BEFORE SETTER AND GETTER
        //System.out.println(two.dateOfBirth); BEFORE SETTER AND GETTER
        System.out.println(two.getName());
        System.out.println(one.getSurname());
        System.out.println(two.getSurname());

        one.deposit(35);
        one.deposit(10);
        one.payInterest();

        two.withdrawal(50);
        two.deposit(150);
        two.payInterest();


    }

    }
