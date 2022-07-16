package websocket;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/*
 * 세션 : 
 * 에너테이션 : 복잡한 절차를 간단히 구현하기 위한 장치, 클라이언트의 요청이 있을 때 적절한 메서드가 실행되어 응답하기 위함
 * 
 * 
 * 
 * */

// 웹소켓 서버의 요청명 설정
@ServerEndpoint("/ChatingServer")
public class ChatServer {
	
	// 접속한 클라이언트들을 컬렉션으로 관리
	private static Set<Session> clients
			= Collections.synchronizedSet(new HashSet<Session>());
	
	@OnOpen // 클라이언트 접속 시 실행
	public void onOpen(Session session) {
		clients.add(session); // 세션 추가
		System.out.println("웹소켓 연결 : " + session.getId());
	}
	
	@OnMessage // 메시지를 받으면 실행
	public void onMessage(String message, Session session) throws IOException {
		System.out.println("메시지 전송 : " + session.getId() + " : " + message);
		synchronized (clients) {
			for (Session client : clients) { // 모든 클라이언트에 메시지 전달
				if (!client.equals(session)) { // 단, 메시지를 보낸 클라이언트는 제외하고 전달
					client.getBasicRemote().sendText(message);
				}
			}
		}
	}
	
	@OnClose // 클라이언트와의 연결이 끊기면 실행
	public void onClose(Session session) {
		clients.remove(session);
		System.out.println("웹소켓 종료 : " + session.getId());
	}

	@OnError // 에러 발생 시 실행
	public void onError(Throwable e) {
		System.out.println("에러 발생");
		e.printStackTrace();
	}
}
