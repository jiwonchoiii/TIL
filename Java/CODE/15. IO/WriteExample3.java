package input_output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:temp/test.txt");

		byte[] data = "ABC".getBytes();

		os.write(data, 1, 2);

		os.flush();
		os.close();
	} // main

} // end class