package myapp;

import java.util.Arrays;

import lombok.extern.log4j.Log4j;

@Log4j
//원시적인 배열 복사 방법
public class ArrayCopyByForExample {
	public static void main(String... args) {
				
		int[] oldIntArray = { 1, 2, 3 }; // 1차원 배열 선언(소스배열)
		int[] newIntArray = new int[5]; // 1차원 배열 선언(타겟 배열, 공간확보)

		// 소스배열을 traverse(순회)하면서, 타겟배열의 동일한 인덱스 위치에
		// 소스배열의 요소값을 넣어줌(대입). 빈 자리는 자바컴파일러가 기본값으로 초기화 
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		} // for

		
		oldIntArray[0]= 100; //깊은 복사를 했기 때문에 원본배열이 변경되어도 타겟 배열에 영향이 없다. 
		
		log.info("원본배열: "+Arrays.toString(oldIntArray));
		log.info("타겟배열: "+Arrays.toString(newIntArray));

	} // main
} // end of class
