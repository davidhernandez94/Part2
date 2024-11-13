public class CreditCard {
    private Money balance = new Money(0);
    private Money creditLimit = new Money(1000);
    private Person owner = new Person("A", "B",
            new Address("a", "a", "a", "a"));

    public CreditCard (Person newCardHolder, Money limit) {
        this.creditLimit = limit;
        this.owner = newCardHolder;
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return new Money(this.balance);
    }

    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }

    public Money getCreditBalance() {
        return new Money(this.creditLimit);
    }

    public String getPersonals() {
        return this.owner.toString();
    }

    public void charge(Money amount) {
        Money sum = new Money(this.getBalance().add(amount));
        if (sum.compareTo(this.creditLimit) != 1) {
            this.balance = sum;
            System.out.println("Charge: " + amount); 
        }
        else {
            System.out.println("transaction failed. exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        Money difference = new Money(this.getBalance().subtract(amount));
        if (difference.compareTo(new Money(0 )) != -1) {
            this.balance = difference;
            System.out.println("Payment: " + amount);
        }
        else {
            System.out.println("transaction failed. cannot have a negative balance");
        }
    }



}
