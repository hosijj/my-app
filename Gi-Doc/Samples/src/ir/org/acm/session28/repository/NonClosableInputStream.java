package ir.org.acm.session28.repository;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class NonClosableInputStream extends FilterInputStream {

    public NonClosableInputStream(InputStream in) {
        super(in);
    }
    
    @Override
    public void close() {} // ignore close
    
    public void realClose() throws IOException {
        super.close();
    }
    
}
