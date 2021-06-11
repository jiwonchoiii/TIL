package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class ArrayInArrayExample {

	public static void main(String... args) {
//		int[][] mathScores = new int[2][3]; // 2차원 배열: 2x3
//
//		// 2차원 배열의 각 요소를 traverse(순회)하자
//		for (int i = 0; i < mathScores.length; i++) {
//			for (int k = 0; k < mathScores[i].length; k++) {
//				log.info("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
//			} // inner for
//		} // outer for
//		
//		int[][] mathScores = { { 1, 2, 3 }, { 4, 5, 6 } };
////		int i = 0, k =0; // 절대 이렇게 하지않기. 변수 하나당 실행문장 하나 만든다.
//
//		int i = 0; // 바깥쪽 배열의 인덱스
//		for (int[] score : mathScores) {
//			int k = 0; // 안쪽 요소배열의 인덱스
//			for (int number : score) {
//				String s = String.format("mathscores[%d][%d]=", i, k++);
//				log.info(s + number);
//			}
//			++i;
//		} // enhanced for
//
//		log.info("");
		
		int[][] englishScores = new int[2][]; // 요소가 2개인 배열 객체 생성
		
		englishScores[0]= new int[2]; // 앞에서 요소 배열의 크기가 정해지지 않았기 때문에 여기서 요소 배열 객체를 생성
		englishScores[1]= new int[3];
		
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				log.info("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
				
			} //inner for
		} // outer for
		log.info("");
	} //main
} // end of class