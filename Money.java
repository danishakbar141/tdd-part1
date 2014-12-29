/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

/**
 *
 * @author Danish Akbar
 */
abstract class Money {

    protected int amount;
    protected String currency;

    abstract Money times(int multiplier);

    String currency() {

        return currency;

    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money pkrRupee(int amount) {
        return new PkrRupee(amount, "pkrRupee");
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
    @Override
    public String toString() {
   return amount + " " + currency;
}
}
