package map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class HashTableExample {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<>();

		// Map 컬렉션에 요소 추가(키/값 쌍)
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner sc = new Scanner(System.in);
		
		try(sc;){
			while (true) {
				log.info("아이디와 비밀번호를 입력해주세요.");
				System.out.print("아이디: ");
				String id = sc.nextLine();

				System.out.print("비밀번호: ");
				String password = sc.nextLine();
				log.info("");

				if (map.containsKey(id)) {
					if (map.get(id).equals(password)) {
						log.info("로그인 되었습니다");

						break;
					} else {
						log.info("비밀번호가 일치하지 않습니다.");
					}
				} else {
					log.info("입력하신 아이디가 존재하지 않습니다.");
				} // if-else

			} // while
			
		} catch (Exception e) {
			
			
		} // try-with-resources



			
//		Objects.requireNonNull(sc);
//		sc.close();

	} // main

} // end class
