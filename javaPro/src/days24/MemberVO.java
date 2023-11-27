package days24;

/**
 * @author KL
 * @date 2023. 8. 16. - 오전 10:12:40
 * @subject Ex01 클래스 선언
 * @content
 */

// ~VO : Value Object
// DTO, DAO , VO
//		값 저장 -> 읽기/쓰기 객체
public class MemberVO {//이름,직위
	private String name;
	private String position;//팀장,팀원
	
	public MemberVO() {
		super();
		
	}

	public MemberVO(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", position=" + position + "]";
	}
	
	
	

}//cls
