package AJ_QAP2_CreditCard_GeraldBartlett;

public class Money {
    private long dollars;
    private long cents;

    public Money(double amount)

    {
        if (amount < 0) {
            System.out.println(
                    "Error negative number");
            System.exit(0);
        } else {
            long allCents = Math.round(amount * 100);
            dollars = allCents / 100;
            cents = allCents % 100;
        }
    }

    // money object
    public Money(Money otherObject) {
        dollars = otherObject.dollars;
        cents = otherObject.cents;
    }

    // method that will charge to the credit card by adding the amount of Money in
    // the parameter to the balance if it will not exceed the credit limit
    public Money add(Money otherAmount) {
        Money sum = new Money(0);
        sum.cents = this.cents + otherAmount.cents;
        long carryDollars = sum.cents / 100;
        sum.cents = sum.cents % 100;
        sum.dollars = this.dollars + otherAmount.dollars + carryDollars;
        return sum;
    }

    // have a method that will make a payment on the credit card by subtracting the
    // amount of Money in the parameter from the balance
    public Money subtract(Money amount) {
        Money difference = new Money(0);
        if (this.cents < amount.cents) {
            this.dollars = this.dollars - 1;
            this.cents = this.cents + 100;
        }
        difference.dollars = this.dollars - amount.dollars;
        difference.cents = this.cents - amount.cents;
        return difference;
    }

    // compareto money
    public int compareTo(Money amount) {
        int value;
        if (this.dollars < amount.dollars) {
            value = -1;
        } else if (this.dollars > amount.dollars) {
            value = 1;
        } else if (this.cents < amount.cents) {
            value = -1;
        } else if (this.cents > amount.cents) {
            value = 1;
        } else {
            value = 0;
        }
        return value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money anotherMoney = (Money) obj;
            if (anotherMoney.dollars == this.dollars && anotherMoney.cents == this.cents) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        double centsToDollar = this.cents / 100.0;
        return String.format("$%.2f", (this.dollars + centsToDollar));
    }
}
