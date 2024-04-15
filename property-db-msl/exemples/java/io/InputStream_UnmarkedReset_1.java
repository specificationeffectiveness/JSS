package mop;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.LineNumberInputStream;
import java.io.StringBufferInputStream;

public class InputStream_UnmarkedReset_1 {
	
//	public static void main(String[] args) throws Exception {
//		DataInputStream stream = new DataInputStream(new StringBufferInputStream("1234567890"));
//		stream.reset();
//		int c = stream.read();
//	}
	

//	public static void main(String[] args) throws Exception {
//		BufferedInputStream stream = new BufferedInputStream(new StringBufferInputStream("1234567890"));
//		stream.reset();
//		int c = stream.read();
//	}
	
	public static void main(String[] args) throws Exception {
		LineNumberInputStream stream = new LineNumberInputStream(new StringBufferInputStream("1234567890"));
		stream.reset();
		stream.mark(1);
		int c = stream.read();
	}
	
}
