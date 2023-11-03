package concrete_products;

import product.Trace;

public class SystemTrace implements Trace {
    private boolean debug;
    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if (debug) {
            System.out.println("Debug: " + message);
        }
    }

    @Override
    public void error(String message) {
        System.out.println("Error: " + message);
    }
}
