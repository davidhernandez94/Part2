public class CreditCard {
    private Money balance = new Money(1000);
    private Money creditLimit = new Money(2000);
    private Person owner = new Person("A", "B",
            new Address("a", "a", "a", "a"));

    public CreditCard (Money limit, Person newCardHolder) {
        creditLimit = limit;
        owner = newCardHolder;
        balance = new Money(0);
    }
}
