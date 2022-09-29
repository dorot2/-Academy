package sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	// 큐 자료구조 : FIFO(First Input First Output)
	public static void main(String[] args) {
		// 제네릭 사용의미.
		// 전체적인 기억장소의 데이터를 관리하는 방식은 Queue인터페이스를 사용하겠다라는 의미.
		// 그안에 실질적인 데이타는 Message클래스로 사용함을 의미한다.
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // 데이터를 꺼내오는 작업
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}

	}

}
