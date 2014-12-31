/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

import java.util.Hashtable;

/**
 *
 * @author Danish Akbar
 */
public class Bank {

    private Hashtable rates = new Hashtable();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        Integer rate = (Integer) rates.get(new KeyValue(from, to));
        return rate.intValue();
    }

    void addRate(String from, String to, int rate) {
        rates.put(new KeyValue(from, to), new Integer(rate));
    }
}
