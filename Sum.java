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

    Expression augend;
    Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount+ addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
