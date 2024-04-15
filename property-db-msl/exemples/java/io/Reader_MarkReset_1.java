package mop;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Reader_MarkReset_1 {

//	public static void main(String[] args) throws Exception {
//		File file = File.createTempFile("javamoptest1", ".tmp");
//		FileWriter writer = new FileWriter(file);
//		writer.write("0123456789");
//		writer.close();
//		file.deleteOnExit();
//
//		try{
//			FileReader reader = new FileReader(file);
//			reader.mark(1);
//			int c = reader.read();
//			reader.reset();
//			int d = reader.read();
//			reader.reset();
//			int e = reader.read();
//			if (c == d && d == e)
//				System.out.println("reset() was properly used.");
//			else 
//				throw new Exception("reset() did not preserve the value.");
//		} catch (Exception e){
//			System.err.println(e.getMessage());
//		}
//	}
	
	
	public static void main(String[] args) throws Exception {

		try{
			PipedReader reader = new PipedReader(new PipedWriter(), 1);
			reader.mark(1);
			int c = reader.read();
			reader.reset();
			int d = reader.read();
			reader.reset();
			int e = reader.read();
			if (c == d && d == e)
				System.out.println("reset() was properly used.");
			else
				throw new Exception("reset() did not preserve the value.");
		} catch (Exception e){
			System.err.println(e.getMessage());
		}

	}
	
	
//	public static void main(String[] args) throws Exception {
//
//		try{
//			Reader reader = new PushbackReader(new StringReader("1234567890"), 1);
//			reader.mark(1);
//			int c = reader.read();
//			reader.reset();
//			int d = reader.read();
//			reader.reset();
//			int e = reader.read();
//			if (c == d && d == e)
//				System.out.println("reset() was properly used.");
//			else
//				throw new Exception("reset() did not preserve the value.");
//		} catch (Exception e){
//			System.err.println(e.getMessage());
//		}
//	}
	
//	public static void main(String[] args) throws Exception {
//
//		try{
//			Reader reader = new InputStreamReader(new ByteArrayInputStream("1234567890".getBytes()));
//			reader.mark(1);
//			int c = reader.read();
//			reader.reset();
//			int d = reader.read();
//			reader.reset();
//			int e = reader.read();
//			if (c == d && d == e)
//				System.out.println("reset() was properly used.");
//			else 
//				throw new Exception("reset() did not preserve the value.");
//		} catch (Exception e){
//			System.err.println(e.getMessage());
//		}
//	}
	
}
