/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

/**
 *
 * @author Danish Akbar
 */
public class PkrRupee extends Money {

    private int amount;
    private String currency;

    @Override
    Money times(int multiplier) {
        return new PkrRupee(amount * multiplier,currency);
    }

    public PkrRupee(int amount,String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return currency;
    }

   
}
