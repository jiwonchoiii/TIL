package singleton;

import lombok.extern.log4j.Log4j;

@Log4j
public class SingletonExample {
	
	public static void main(String[] args) {
		
		/*
		 * Singleton obj1 = new Singleton(); //������ ����
		 * Singleton obj2 = new Singleton(); //������ ����
		 */
		
//		//�̱��� ��ü�� ���۷����� ����
//		Singleton obj1 = Singleton.getInstance();
//		Singleton obj2 = Singleton.getInstance();
//		
//		
//		if(obj1==obj2) {
//			log.info("���� Singleton ��ü�Դϴ�.");
//		} else {
//			log.info("�ٸ� Singleton ��ü�Դϴ�.");
//		} //if-else
		
		
		for(int i = 1 ; i <=10; i++) {
			Singleton obj = Singleton.getInstance();
			
			log.info(String.format("[%d] obj: [%s]", i , obj));
		}// for
		
	} //main

} //end class
