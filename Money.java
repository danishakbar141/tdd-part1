/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

/**
 *
 * @author Danish Akbar
 */
public  class Money implements Expression{

    protected int amount;
    protected String currency;

   public  Money times(int multiplier){
         return new Money(amount*multiplier, currency) ;        
    }

    String currency() {

        return currency;

    }
   public Expression plus(Money Add){
       return new Sum(this,Add);
   }
   public  Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money pkrRupee(int amount) {
        return new Money(amount, "pkrRupee");
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency);
    }
    @Override
    public String toString() {
   return amount + " " + currency;
}

    @Override
    public Money reduce(String to) {
        return this;
    }
}
