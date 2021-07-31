package input_output;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {
		// 파일 시스템상에 존재하는 파일이나 디렉토리를 모델링해서 만든 클래스 --> File
		// File 객체를 만들 때는 생성자의 매개변수로 경로(path)를 지정해준다
		// 내가 지정해준 경로가 실제 존재하든 말든 상관없다.
//		File dir = new File("C:/temp/dir"); // 존재하지 않는 경로
//
//		File file1 = new File("C:/temp/file1.txt"); // 존재하지 않는 경로
//		File file2 = new File("C:/temp/file2.txt"); // 존재하지 않는 경로

		// HTTP 규약에 따라, 로컬PC에 있는 자원(파일)을 지정할 때에는, URL형식으로 지정하되
		// 반드시 file:// 로 시작해야 한다.
		
		//**java.net.URI, java.net.URL 클래스가 있음. 그래서 URL/URI의 차이점을 잘 알아야 한다. 
//		File file3 = new File(new URI("file:///C:/temp/file3.txt"));  // root folder 지정(/)

		// ----------------------------------------//

//		if (dir.exists() == false) { 
//			dir.mkdirs();
//		}
//		if (file1.exists() == false) {
//			file1.createNewFile();
//		}
//		if (file2.exists() == false) {
//			file2.createNewFile();
//		}
//		if (file3.exists() == false) {
//			file3.createNewFile();
//		}
		
		//----------------------------------------//
		
		// 1.지정된 폴더에 대한 파일객체 생성
		File temp = new File("C:/temp");
		
		// 2. 날짜와 시간정보를 가지고 있는 Date객체를 문자열로 formatting할 때 필요한 객체
		//   DateFormat타입의 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");
		
		// 3. File.listFiles() 메소드를 통해, 지정된 폴더 밑에 있는 모든 파일/폴더들의 목록을 획득
		File[] contents = temp.listFiles();

		// 4. 콘솔 출력 formatting
		System.out.println("날짜           시간         형태                크기        이름");
		System.out.println("-------------------------------------------------------------");
		
		// 5. 위 3에서 얻은 File[] 배열의 모든 원소를 순회
		for(File file : contents) {
			System.out.print(
					sdf.format(new Date(file.lastModified()) // 각 file객체의 최종수정시간을 반환하는 메소드
							)
					);
			
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			} // if-else
			
			System.out.println();
		} // enhanced-for
	} // main
} // end class