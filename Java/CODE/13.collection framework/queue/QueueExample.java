package queue;

import java.util.LinkedList;
import java.util.Queue;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();

		messageQueue.offer(new Message("sendMail", "amy"));
		messageQueue.offer(new Message("sendSMS", "chloe"));
		messageQueue.offer(new Message("sendKakaotalk", "mike"));

		// Queue가 비워질 때까지, 하나씩 빼서 사용
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();

			switch (message.command) {
			case "sendMail":
				log.info(message.to + "님에게 메일을 보냅니다.");

				break;
			case "sendSMS":
				log.info(message.to + "님에게 SMS을 보냅니다.");

				break;
			case "sendKakaotalk":
				log.info(message.to + "님에게 카카오톡을 보냅니다.");

				break;
			} // switch
			
		} // while

	} // main
	
} // end class
