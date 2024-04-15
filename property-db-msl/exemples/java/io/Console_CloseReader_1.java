package mop;

import java.io.Console;
import java.io.IOException;
import java.io.Reader;

public class Console_CloseReader_1 {
    public static void main(String[] args) throws IOException {

    	Console cons = System.console();
		Reader reader = cons.reader();
		// Invoking close() on the reader from the console will not close the
		// underlying stream.
		reader.close();
    }
}
