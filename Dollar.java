/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exmp1;

/**
 *
 * @author Danish Akbar
 */
public class Dollar {
private int amount;
Dollar(int amount){
this.amount=amount;
}
public void times(int multiplier){
amount *=multiplier;
}
public int getamount(){
return amount;
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
