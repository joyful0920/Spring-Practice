package ��������0;

public abstract class Person {
	private String name;
	public abstract void doSomething();
	public void daily() {
		System.out.println("�Խ�üũ�� �Ѵ�.");
		doSomething();
		System.out.println("���üũ�� �Ѵ�.");
	}
}
