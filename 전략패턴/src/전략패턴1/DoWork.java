package 전략패턴1;

public class DoWork implements DoSomething {

	@Override
	public void doSomething() {
		System.out.println("소 같이 일한다.");
	}
	
}
