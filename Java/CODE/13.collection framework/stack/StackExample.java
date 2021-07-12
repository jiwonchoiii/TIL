package stack;

import java.util.Stack;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();

		// 새로운 동전을 넣는다
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		// 동전통이 비워질 때까지 동전을 꺼내서 무엇인가를 하자
		while (!coinBox.isEmpty()) {  
			Coin coin = coinBox.pop(); // 동전통에서 하나씩 동전을 꺼냄
			log.info("꺼내온 동전: " + coin.getValue() + "원");
		} // while
	} // main
} // end class
