package days15;


//임시직 사원 클래스
public class Temp extends Employee{
	
	//필드 -name addr tel hiredate
	
	//상속자
	
	
	// 메서드- dispEmpInfo() @toString(), getter, setter
	private int days; 		 //근무일수
	private int payOfDay;	 //하루일당

	
	public Temp() {
		super();
		System.out.println(">Temp 디폴트 생성자 호출됨");
	}
	
	public Temp(String name, String addr, String tel, String hiredate, int days, int payOfDay) {
		super(name, addr, tel, hiredate);
		this.days=days;
		this.payOfDay = payOfDay;
		System.out.println(">Temp 6 생성자 호출됨");
	}
	
	@Override
	//어노테이션 붙일 시 컴파일러가 확인하므로 붙이는 것이 좋음
	public int getPay() {
	return this.days* this.payOfDay;
	}
	
	// 해당 사원들의 정보를 출력하는 메서드
	@Override
		public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소 :%s, 연락처:%s, 입사일자:%s, 근무일수:%d, 하루일당:%d\n",
				this.getName(), this.getAddr(), this.getTel(), this.getHiredate(), this.days, this.payOfDay);	
		}

}

