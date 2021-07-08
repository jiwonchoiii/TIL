package list;

import java.util.List;
import java.util.Vector;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class VectorExample {

	// (1) 순서를 보장 (2) 중복을 허용 ===> List의 성질을 잊지말자
	//----------------------------------------------
	// ArrayList와 Vector는 요소를 중간에서 넣고/빼고하게 되면, "밀고/당기는 현상"이 발생하므로 주의한다.
	// Vector의 내부 구현은 99% ArrayList와 동일
	// 단지 멀티쓰레드 환경에서, 요소객체에 대한 조작을 안전하게 할 수 있도록 추가구현
	// 그래서 실무에서는 Thread-safe한 Vector객체를 더 많이 사용	
	public static void main(String[] args) {
		// 1. Thread-safe한 Vector객체 생성
		List<Board> list = new Vector<Board>();		 //타입 추론
		
		// 2. Board 객체를 생성해서, 리스트의 요소로 추가(append)
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		// 3. 인덱스 번호를 이용해서 삭제를 수행
		list.remove(2);
		list.remove(3);
		
		// 4. 리스트 순회하면서 전체 요소 출력
//		for (Board board : list) {
//			log.info(board);
//		} // enhanced for		
//		list.forEach(board -> log.info(board)); 
		list.forEach(log::info);
			
	} // main 
} // end class
