import concrete_products.FileTrace;
import creator.TraceFactory;
import product.Trace;

public class TestTrace {
    private final Trace trace ;

    public TestTrace(TraceFactory traceFactory) {
        this.trace = traceFactory.createTrace();
    }

    public int division(int a, int b) {
        trace.setDebug(true);
        try {
            trace.debug("Division started");
            return a / b;
        } catch (ArithmeticException e) {
            trace.error("Division by zero");
            return 0;
        } finally {
            trace.debug("Division ended");
            trace.setDebug(false);
        }
    }
}
