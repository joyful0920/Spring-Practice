package ��������1;

public class Test {

	public static void main(String[] args) {
		DoWork work = new DoWork();
		DoStudy study = new DoStudy();
		EatWellStory wellStory = new EatWellStory();
		EatCafeteria cafeteria = new EatCafeteria();
		
		//Employee
		Person employee = new Person();
		employee.setDoSeomething(work);
		employee.setEating(wellStory);
		
		// Student
		Person student = new Person();
		student.setDoSeomething(study);
		student.setEating(cafeteria);
		
		// SSAFY
		Person ssafy = new Person();
		ssafy.setDoSeomething(study);
		ssafy.setEating(wellStory);
	}

}
