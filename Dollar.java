/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

/**
 *
 * @author Danish Akbar
 */
public class Dollar extends Money{
private  int amount;
String currency;
    @Override
   Money times(int multiplier) {
      return new Dollar(amount * multiplier,currency);
}
    public Dollar(int amount,String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return currency;
    }
    
    
}
