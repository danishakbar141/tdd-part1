/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example6;


/**
 *
 * @author Danish Akbar
 */
public class Dollar extends Money{
private int amount;
public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    Money times(int multiply) {
       return new Dollar(amount*multiply);
    }
    public boolean equals(Object obj){
    Dollar dollar=(Dollar)obj;
    return amount==dollar.amount;
    }
    
}
