public class Test {
    public static void main(String[] args) {
        CheckingAccount person = new CheckingAccount();
        person.setFirstName("Bhavik");
        person.setLastName("Diwani");
        person.setAccountID(123);
        person.deposit(500);
        person.withdrawal(100);
        person.displayAccount();

    }
}

