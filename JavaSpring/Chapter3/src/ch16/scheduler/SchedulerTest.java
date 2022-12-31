package ch16.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� ���켱 ���õ� ���� ����");
		
		int ch = System.in.read();
		Scheduler shceduler = null;
		
		if(ch == 'R'  || ch == 'r') {
			shceduler = new RoundRobin();
		} else if(ch == 'L' || ch == 'l') {
			shceduler = new LeastJob();
		} else if(ch == 'P' || ch == 'p') {
			shceduler = new PriorityAllocation();
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		shceduler.getNextCall();
		shceduler.sendCallToAgent();;
	}
}
