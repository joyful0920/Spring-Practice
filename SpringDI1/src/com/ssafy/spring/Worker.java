package com.ssafy.spring;

public class Worker {
	private Computer computer;
	public Worker() {
//		computer = new Desktop();
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	public void doWork() {
		System.out.println(this.computer.getInfo() + "�� ���� �մϴ�." + this.age);
	}
	
	private int age;
	public void setHong(int value) {
		this.age = value;
	}
}
