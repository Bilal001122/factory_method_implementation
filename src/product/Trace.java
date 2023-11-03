package product;

public interface Trace {
    // turn on/off debugging
    public void setDebug(boolean debug);
    // write out a debug message
    public void debug(String message);
    // write out an error message
    public void error(String message);
}
