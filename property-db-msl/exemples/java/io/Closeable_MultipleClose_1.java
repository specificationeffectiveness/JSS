package mop;

import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;

public class Closeable_MultipleClose_1 {
	public static void main(String[] args) throws IOException {
		CharArrayWriter writer = new CharArrayWriter();
		writer.write(100);
		
//		writer.close();
		// Closing a previously closed stream has no effect.
//		writer.close();
//		InputStream in = new ByteArrayInputStream(null);
//		in.close();
//		maisClose();
		loadZoneData("1");
	}
	
	private static void maisClose() {
//		CharArrayWriter writer = new CharArrayWriter();
//		writer.flush();
//
//		writer.close();
	}
	
	 private static InputStream loadZoneData(String id) {
	        InputStream in = null;
	        try {
//	         
	            return in;
	        } finally {
	            try {
	                if (in != null) {
	                    in.close();
	                }
	            } catch (IOException ex) {
	            }
	        }
	    }
}