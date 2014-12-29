/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

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
    public static void main(String[] args) {
        // TODO code application logic here
    } 
}
