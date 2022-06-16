package AJ_QAP2_CreditCard_GeraldBartlett;

public class CreditCard {

    // Instance variables:
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor:
    public CreditCard(Person newCardHolder, Money lIMIT) {
        this.owner = newCardHolder;
        this.creditLimit = lIMIT;
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    // accessor methods to get the balance and the available credit
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // accessor method to get the information about the owner
    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        // checks the credit card balance and limit
        if (balance.add(amount).compareTo(creditLimit) < 0) {
            System.out.println("Charge : " + amount);
            balance = balance.add(amount);
        } else
            System.out.println("Exceeds Credit Limit");

        return;
    }

    // payment
    public void payment(Money amount) {
        System.out.println("Payment: " + amount);
        balance = balance.subtract(amount);
    }

}
