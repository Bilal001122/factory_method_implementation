import cocnrete_creator.FileTraceFactory;
import cocnrete_creator.SystemTraceFactory;
import creator.TraceFactory;

public class Main {
    public static void main(String[] args) {
        String userChoice = "file";
        TraceFactory traceFactory;
        TestTrace testTrace ;
        switch (userChoice) {
            case "file":
                traceFactory = new FileTraceFactory();
                testTrace = new TestTrace(traceFactory);
                testTrace.division(10, 5);
                break;
            case "system":
                traceFactory = new SystemTraceFactory();
                testTrace = new TestTrace(traceFactory);
                testTrace.division(10, 0);
                break;
            default:
                throw new RuntimeException("Unknown TraceFactory: " + userChoice);
        }
    }
}
