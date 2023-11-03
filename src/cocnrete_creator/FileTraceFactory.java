package cocnrete_creator;

import concrete_products.FileTrace;
import creator.TraceFactory;
import product.Trace;

public class FileTraceFactory implements TraceFactory {
    @Override
    public Trace createTrace() {
        return new FileTrace();
    }
}
