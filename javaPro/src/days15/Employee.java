package days15;

// 사원 클래스
// 모든 사원들이 공통적으로 가져야 할 멤버(필드와 메서드)를 구현한 클래스
// 추상메서드 한개라도 가지고 있으면 불완전한 클래스
// 객체 생성할수 없음
// 추상클래스
// abstract** class
public abstract class Employee extends Object {

	// 필드
	private String name;  //사원명
	private String addr;   //주소
	private String tel;		//연락처
	private String hiredate;		// 입사일자
	
	// 생성자
	public Employee() { //extends Object 생략
	System.out.println(">Employee 디폴트 생성자 호출됨");
	}

	public Employee(String name, String addr, String tel, String hiredate) {
		
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println(">Employee 4 생성자 호출됨");
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	// 메서드
	// 해당 사원들의 정보를 출력하는 메서드
	public void dispEmpInfo() {
	System.out.printf("사원명:%s, 주소 :%s, 연락처:%s, 입사일자:%s\n",this.name, this.addr, this.tel, this.hiredate);	
	}

	//부모꺼 재정의
	
	@Override
	public String toString() {
		return String.format("사원명:%s, 주소 :%s, 연락처:%s, 입사일자:%s",this.name, this.addr, this.tel, this.hiredate);	
	
	}
	
	/*
	public int getPay() {
		return 0;  // 물려받는 자식이 재정의 해서 쓸것
	}
	*/
	
	public abstract int getPay(); 
	// This method requires a body instead of a semicolon
	// body {} 몸체가 구현이 안된 불완전 메서드
	// 추상메서드 - 한개라도 가지고 있으면 불완전 클래스
	// abstract 키워드 붙이기
	
}//class
