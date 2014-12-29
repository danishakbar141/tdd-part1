/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exmp4;

/**
 *
 * @author Danish Akbar
 */
public class pkrRupee {
private int amount;
pkrRupee(int amount){
this.amount=amount;
}
public pkrRupee times(int multiplier){
return new pkrRupee(amount*multiplier);
}
public int getamount(){
return amount;
}
@Override
public boolean equals(Object obj){
    pkrRupee dol=(pkrRupee)obj;
    return amount==dol.amount;
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
