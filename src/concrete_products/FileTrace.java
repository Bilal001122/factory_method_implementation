package concrete_products;

import product.Trace;
import java.io.FileWriter;
import java.io.IOException;

public class FileTrace implements Trace {
    private boolean debug;
    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if (debug) {
            try {
                FileWriter fw = new FileWriter("log.txt",true);
                fw.write("Debug: " + message + "\n");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void error(String message) {
        try {
            FileWriter fw = new FileWriter("log.txt",true);
            fw.write("Error: " + message + "\n");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
