package ��������0;

public class Employee extends Person {
	// ������ : ��ü ���� ������, Ÿ�� ������
	// ��ü ���� ������ : IoC �����ν� Ż�� ����
	// Ÿ�� ������ : Interface Ȱ�������ν� ������ �������ν� �ؼ� ����
	private DoWork work;
	private EatWellStory wellStory = new EatWellStory();
	// �����ڿ� ��ü�� �־��ָ� Constructor Injection
	public Employee(DoWork work) {
		this.work = work;
	}
	
	// �����ڿ� ��ü�� �־��ָ� Property Injection / Setter Injection
	public void setEatWellStory(EatWellStory wellstory) {
		this.wellStory = wellStory;
	}
	@Override
	public void doSomething() {
		work.doSomething();
		wellStory.doSomething();
	}

}
