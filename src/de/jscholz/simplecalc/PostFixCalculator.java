
package de.jscholz.simplecalc;

import javax.ejb.Remote;

/**
 *
 * @author JScholz
 */
@Remote
public interface PostFixCalculator {
    public String calculate(final String expression);
}
