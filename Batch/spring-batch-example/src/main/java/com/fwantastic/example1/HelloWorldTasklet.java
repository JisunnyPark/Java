package com.fwantastic.example1;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/*
 * 두개의 메세지만 출력하고 끝나는 단순한 tasklet
 */
public class HelloWorldTasklet implements Tasklet {

//	execute 메소드가 null을 반환하면 RepeatStatus.FINISHED 를 반환하는 것과 같은 의미를 가진다. 
//	한마디로 반복 없이 한 번만 실행된다는 소리다.
//	HelloWorldTasklet은 tasklet 인터페이스의 구현체다. 
//	step이 실행되면 배치 프레임워크가 알아서 execute 메소드를 찾아 실행한다. 
//	그럼  작업 시작... 과  작업 완료!  메세지를 출력하고 끝난다.
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) 
			throws Exception {
		System.out.println("작업 시작...");
		
		// 원하는 작업을 여기에서 할 수 있다.
		
		System.out.println("작업 완료");
		return null;
	}

}
