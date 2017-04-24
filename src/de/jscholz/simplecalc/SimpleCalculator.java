
package de.jscholz.simplecalc;

import javax.ejb.Remote;

/**
 *
 * @author JScholz
 */
@Remote
public interface SimpleCalculator {
    public String calculate(final String expression);
}
