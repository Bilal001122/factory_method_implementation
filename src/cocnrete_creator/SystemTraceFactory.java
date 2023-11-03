package cocnrete_creator;

import concrete_products.SystemTrace;
import creator.TraceFactory;
import product.Trace;

public class SystemTraceFactory implements TraceFactory {
    @Override
    public Trace createTrace() {
        return new SystemTrace();
    }
}
