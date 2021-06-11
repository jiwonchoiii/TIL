package myapp;

import java.util.Arrays;

import lombok.extern.log4j.Log4j;

@Log4j
public class ArraysCopyExample {

	public static void main(String[] args) {

		int[] sourceArray = { 1, 2, 3 };
		//int[] targetArray = new int[5];  Arrays.copyOf()메소드를 실행할 때 배열 생성하므로 필요없는 코드

		int[] targetArray = Arrays.copyOf(sourceArray, sourceArray.length);
		
		sourceArray[0] = 100;
		
		log.info("원본배열: "+Arrays.toString(sourceArray));
		log.info("타겟배열: "+Arrays.toString(targetArray));
		
		//thin copy 
//		int[] sourceArray = { 1, 2, 3 };
//		int[] targetArray = sourceArray;
//		
//		sourceArray[0] = 100;
//		
//		log.info("원본배열: "+Arrays.toString(sourceArray));
//		log.info("타겟배열: "+Arrays.toString(targetArray));

	}
}
