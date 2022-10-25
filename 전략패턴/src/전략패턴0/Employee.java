package 전략패턴0;

public class Employee extends Person {
	// 의존성 : 객체 생성 의존성, 타입 의존성
	// 객체 생성 의존성 : IoC 함으로써 탈출 가능
	// 타입 의존성 : Interface 활용함으로써 느슨한 결합으로써 해소 가능
	private DoWork work;
	private EatWellStory wellStory = new EatWellStory();
	// 생성자에 객체를 넣어주면 Constructor Injection
	public Employee(DoWork work) {
		this.work = work;
	}
	
	// 설정자에 객체를 넣어주면 Property Injection / Setter Injection
	public void setEatWellStory(EatWellStory wellstory) {
		this.wellStory = wellStory;
	}
	@Override
	public void doSomething() {
		work.doSomething();
		wellStory.doSomething();
	}

}
