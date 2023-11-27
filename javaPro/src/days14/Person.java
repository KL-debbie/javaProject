package days14;

public class Person {
	
	
	// 필드
	private String name;
	private int age;
	private boolean gender;
	
	// Alt + Shift + s - context menu
	
	// getter-가져올때 setter-바꿀때 선언

	public Person() {
		
	}
	
	public Person(boolean b) {
	gender=b;
	}

	public void setAge(int n) {
		if (  0<=n && n <=130) {
			age = n;
			
		} else {
			// 강제 오류 발생
			//[예외처리]-강제로 예외 던지기
			throw new RuntimeException("Person.age 0~100 실행오류");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// gender 필드는 읽기전용으로만 사용
	public boolean isGender() {
		return gender;
	}

	/*
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	*/

	public int getAge() {
		return age;
	}
	
}//class
