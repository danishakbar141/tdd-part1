/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

/**
 *
 * @author Danish Akbar
 */
interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
}
