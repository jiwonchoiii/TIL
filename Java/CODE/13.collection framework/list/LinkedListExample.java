package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LinkedListExample {

	public static void main(String[] args) {
		// ArrayList 컬렉션 생성
		List<String> list1 = new ArrayList<String>();
		
		// LinkedList 컬렉션 생성
		List<String> list2 = new LinkedList<String>();

		//------------------------------------------------//
		
		long startTime;  // 소요시간측정을 위한 시작 시간 보관 변수선언
		long endTime;	 // 소요시간측정을 위한 종료 시간 보관 변수선언

		//nano seconds: 10억분의 1초 = 1ns
		//milli seconds: 1000분의 1초 = 1ms
		startTime = System.nanoTime();	// 시작 시간측정 변수 초기화
			for (int i = 0; i < 10000000; i++) {
				list1.add(0, String.valueOf(i));  //  계속 밀리는 현상 발생 
			} // classical for
		
		endTime = System.nanoTime(); // 종료 시간측정 변수 초기화
		log.info("ArrayList 걸린시간: " + (endTime-startTime) + "ns");

		
		startTime = System.nanoTime();	// 시작 시간측정 변수 초기화
			for (int i = 0; i < 10000000; i++) {
				list2.add(0, String.valueOf(i));  //  계속 밀리는 현상 발생 
			} // classical for
		
		endTime = System.nanoTime(); // 종료 시간측정 변수 초기화
		log.info("LinkedList 걸린시간: " + (endTime-startTime) + "ns");
	} // main

} // end class 