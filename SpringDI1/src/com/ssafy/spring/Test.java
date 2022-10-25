package com.ssafy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext
		context = new GenericXmlApplicationContext("applicationContext.xml");
		// �����̳ʷκ��� ���� ����� ��ü�� �޾ƿ´�.
//		Worker worker = (Worker) context.getBean("worker");
		Worker worker = context.getBean("worker", Worker.class);
		Computer computer = context.getBean("desktop", Computer.class);
//		worker.setComputer(computer);
		worker.doWork();
	}
}