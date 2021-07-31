package input_output;

import java.io.InputStream;
import java.util.Arrays;

public class SystemInExample2 {

	// 사용자가 키보드에서 입력한 문자들(한글같은 다국어 문자도 포함해서)을 제대로
	// 표시해보자
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		
		byte[] datas = new byte[20]; // 바가지(크기: 100바이트)
		
		System.out.print("이름: "); // 이름을 입력하라는 prompt 메시지 출력
		
		int nameBytes = is.read(datas); // 바가지 채로 바이트들 읽어냄
		
		System.out.println(Arrays.toString(datas));
		
		// *************바가지 안에 있는 모든 바이트들을 문자열로 변환(다국어 문자들도 제대로 문자로서 구성)
		String name = new String(datas,0,nameBytes-2); // 2를빼는 이유: 엔터키 입력값을 제외하려고 (맥은 -1)
		System.out.println("입력한 이름: " + name);

//		System.out.print("하고 싶은말: ");
//		int commentBytes = is.read(datas);
//		String comment = new String(datas,0,commentBytes-2);
//		
//		System.out.println("하고 싶은말: " + comment);
		
	} // main

} // end class 