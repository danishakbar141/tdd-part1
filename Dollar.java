/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example3;

/**
 *
 * @author Danish Akbar
 */
public class Dollar {
private int amount;
Dollar(int amount){
this.amount=amount;
}
public Dollar times(int multiplier){
return new Dollar(amount*multiplier);
}
public int getamount(){
return amount;
}
@Override
public boolean equals(Object obj){
    Dollar dol=(Dollar)obj;
    return amount==dol.amount;
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
