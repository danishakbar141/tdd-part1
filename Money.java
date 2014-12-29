/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChnageMadeByMe;


/**
 *
 * @author Danish Akbar
 */
abstract class Money {

    protected int amount;

    abstract Money times(int multiplier);
    

    static Money pkrRupee(int amount) {
        return new PkrRupee(amount);
    }

    static Money dollar(int amount) {
        return new Dollar(amount);
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
}
