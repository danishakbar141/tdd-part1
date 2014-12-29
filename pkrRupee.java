/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChnageMadeByMe;


/**
 *
 * @author Danish Akbar
 */
public class PkrRupee extends Money {

    private int amount;

    @Override
    Money times(int multiplier) {
        return new PkrRupee(amount * multiplier);
    }

    public PkrRupee(int amount) {
        this.amount = amount;
        super.amount=amount; // because whn equals method compares amout from loacal amount it shoul have correct amount
    } 
}
