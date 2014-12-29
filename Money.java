/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example6;


/**
 *
 * @author Danish Akbar
 */
abstract class Money {
    abstract Money times(int multiply);
    protected int amount;
    public boolean equals(Object obj){
    Money money=(Money)obj;
    return amount==money.amount && getClass().equals(money.getClass());
    }
}
