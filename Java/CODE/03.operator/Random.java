package myapp;


import java.util.Scanner;


import lombok.extern.log4j.Log4j;

@Log4j
public class Random {

	public static void main(String[] args) {
		// N<=x <M 범위의 무작위 수 생성
		Scanner sc = new Scanner(System.in);

		int min = sc.nextInt();
		int max = sc.nextInt();

		int random = (int) (Math.random() * (max - min)) + min;
		log.info(random);

		sc.close();
	} // main
} // end of class
