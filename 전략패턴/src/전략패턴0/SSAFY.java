package 전략패턴0;

public class SSAFY extends Person {
	private DoStudy study = new DoStudy();
	private EatWellStory wellStory = new EatWellStory();
	@Override
	public void doSomething() {
		study.doSomething();
		wellStory.doSomething();
	}

}
