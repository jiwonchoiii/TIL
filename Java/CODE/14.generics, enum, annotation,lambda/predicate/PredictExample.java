package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PredictExample {

	private static List<Student> list = Arrays.asList(
			new Student("yoseph","남자",90),
			new Student("trinity","여자",90),
			new Student("john","남자",95),
			new Student("jiwon","여자",91)
			); // ArrayList 객체를 만들어 대입
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		
		// 리스트의 모든 요소 순회(traverse)
		for(Student student: list) {
			//조건 검사(test)
			if(predicate.test(student)) {
				count++;
				
				sum+=student.getScore();
			} // if
		} // enhanced for
		
		return (double)sum/count;  //  산술평균구해서 반환 
	} //avg 
	
	public static void main(String[] args) {
		double maleAvg = avg( t -> t.getSex().equals("남자"));
		log.info("남자 평균 점수: " + maleAvg);
		
		double femaleAvg = avg( t -> t.getSex().equals("여자"));
		log.info("여자 평균 점수: " + femaleAvg);
	} // main
	
} // end class
	
