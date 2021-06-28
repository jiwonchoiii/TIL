package runtime_exception;


import lombok.extern.log4j.Log4j2;


@Log4j2
public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		// --------------//

		Cat cat = new Cat();
		changeDog(cat);
		
		NullPointerException e;
		
	} // main

	public static void changeDog(Animal animal /* 매개변수의 다형성-1 */ ) {
		log.debug("change(animal) invoked.");
		log.info("\t+ animal: " + animal);

		if(animal instanceof Dog) {
		// 다형성-1에 의해, 부모타입의 참조변수에 대입된,
		// 자식객체를 부모품에서 다시 강제로 빼낼 때, 강제형변환 필요.

		Dog dog = (Dog) animal; // ClassCastException 발생 가능
		 } // if

	} // changeDog
	
} // end class

//Dummy class(mock class)
class Animal {;;} // end class
class Dog extends Animal {;;} // end class
class Cat extends Animal {;;} // end class
