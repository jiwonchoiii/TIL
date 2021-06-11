package myapp;


import java.util.Arrays;


import lombok.extern.log4j.Log4j;


@Log4j
public class ArrayCopyExample {

	
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		// 두번째 배열복사의 방법: System.arraycopy()메소드 이용

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		oldStrArray[0] = "Yoseph";

		log.info(Arrays.toString(oldStrArray));
		log.info(Arrays.toString(newStrArray));
	}
}