package myapp;


import lombok.extern.log4j.Log4j;


@Log4j
public class MultiDimensionalArray {

	
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6 }; // 1차원 배열
		log.info(intArray[0]); //1
		
		//2차원 배열의 요소는 배열이다. 각 요소의 크기는 다를 수 있다. 
		int[][] intArray2 = { { 1, 2, 3 }, { 4, 5, 6 },{7,8}};// 2차원 배열	
		log.info(intArray2[0]); //1차원 배열의 레퍼런스
		log.info(intArray2[0][0]); //1
		log.info(intArray2[1][1]);
		log.info(intArray2[2][1]);
		
		
		int[][][] intArray3 = {{{1},{2},{3}},{{4},{5},{6}}}; //3차원 배열
		log.info(intArray3[0]);  
		log.info(intArray3[0][0]);
		log.info(intArray3[0][0][0]); //1
		
		//값의 목록이 없을 때 배열 객체를 생성
		// 1차원 배열 
		int[]arr1 = new int[5];
		// 2차원 배열
		int[][]arr2 = new int[2][4]; // 2x4(8개의 cell이 생성)구조의 2차원 배열
		int[][]arr3 = new int[2][]; // 가장 바깥쪽 배열의 크기만 지정해도 된다. 
									// 안쪽 배열의 크기를 지정하는 순간, 다 똑같은 크기를 가져야한다.
		// 3차원 배열
		int[][][]arr4 = new int[2][][]; // 안쪽 요소 배열의 크기는 내맘대로
		


	} // main
	
} // end of class
