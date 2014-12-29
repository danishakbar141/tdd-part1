/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example5;

/**
 *
 * @author Danish Akbar
 */
public class pkrRupee extends Money{
private int amount;

public pkrRupee(int amount) {
        this.amount = amount;
    }

    @Override
    Money times(int multiply) {
       return new pkrRupee(amount*multiply);
    }
@Override
    public boolean  equals(Object obj){
    pkrRupee pk=(pkrRupee)obj;
    return amount==pk.amount;
    }
}
