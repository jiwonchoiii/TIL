package myapp;


import lombok.extern.log4j.Log4j;


@Log4j
public class ArrayCreateByNewExample {

	
	public static void main(String[] args) {
				
		int[] arr1 = new int[3]; // 타입별 디폴트값으로 각 요소 초기화

		for (int i = 0; i < arr1.length; i++) {
			log.info("arr[" + i + "] : " + arr1[i]);
		} // for

		// 배열의 각 원소에 값을 변경(초기화가 아님!!)
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int element1 : arr1) {
			log.info(element1);			
		} //enhanced for
		
		double[] arr2 = new double[3]; // 배열 객체부터 생성(공간부터 확보)
		
		for(double element2 : arr2) {
			log.info(element2);
		} //enhanced for
		
		String[] arr3 = new String[3];
		
		for(String element3 : arr3) {
			log.info(element3);
		} //enhanced for

	} // main

} // end of class
