package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace(); // ������� �� �̷��� ���°� �� ����. 
		}

	}

}
