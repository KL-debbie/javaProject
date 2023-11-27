package days15;

// [ 정규직 ] 사원클래스
public class Regular extends Employee {

	//[ Object ] 멤버들도 상속
	//[ Employee ]
	//필드 -name, addr, tel, hiredate
	// 생성자 - 상속 X
	
	// 메서드 - dispEmpInfo(), @(오버라이드)toString()
	
	private int basePay; //기본급


	public Regular() {
		super(); //부모객체 디폴트생성자 먼저 호출, 생략해도 컴파일러가 자동생성 
		System.out.println(">Regular 디폴트 생성자 호출됨");
	}

	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
			// The field Employee.name is not visible
		// (은닉화 - 접근지정자) 상속이 됬지만 private로 선언되어 Employee 클래스 내에서만 사용 가능
		// this.name = name;  		X
		// this.setName(name);   O
		super(name, addr, tel, hiredate);  // 부모 상속된 필드 초기화
		// this용도처럼 디폴트생성자 호출
		this.basePay = basePay;
		System.out.println(">Regular 5 생성자 호출됨");
	}
	
		// getter setter
	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	@Override
	public void dispEmpInfo() {
		/*
		super.dispEmpInfo(); //부모의 멤버들을 가리킴의 super -> 입사일자까지만 찍음
		System.out.printf(", 기본급 : %d\n",this.basePay);
		*/
		
		System.out.printf("사원명:%s, 주소 :%s, 연락처:%S, 입사일자:%s, 기본급 :%d\n", this.getName(), this.getAddr(), this.getTel(), this.getHiredate(), this.basePay);
	}

	@Override
	public String toString() {
		return super.toString() + String.format(", 기본급 : %d\n",this.basePay);		
	}
	
	public int getPay() {
		return this.basePay;
	}
	
	
}//regul class
