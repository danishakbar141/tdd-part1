/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

/**
 *
 * @author Danish Akbar
 */
public class Sum implements Expression {

    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }
    @Override
    public Money reduce(Bank bank, String to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
