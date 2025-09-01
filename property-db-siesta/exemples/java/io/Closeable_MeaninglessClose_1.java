package mop;

import java.io.IOException;
import java.io.*;

public class Closeable_MeaninglessClose_1 {
	
	/**
	 * test closeable - ByteArrayInputStream
	 * @param args
	 * @throws IOException
	 */
//	public static void main(String[] args) throws IOException {
//		byte[] buffer = { 1, 2, 3, 4, 5};
//		InputStream input = new ByteArrayInputStream(buffer);
//
//		// close() has no effect.
//		input.close();
//	}
//	
	/**
	 * test closeable - ByteArrayOutputStream
	 * @param args
	 * @throws IOException
	 */
//	public static void main(String[] args) throws IOException {
//		OutputStream output = new ByteArrayOutputStream();
//
//		// close() has no effect.
//		output.close();
//	}
	
	/**
	 * test Closeable - StringWriter
	 * @param args
	 * @throws IOException
	 */
//	public static void main(String[] args) throws IOException {
//		Writer writer = new StringWriter();
//
//		// close() has no effect.
//		writer.close();
//	}

	/**
	 * test closeable - CharArrayWriter
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Writer writer = new CharArrayWriter();

		// close() has no effect.
		writer.close();
	}
}
