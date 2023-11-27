package days25;

import days24.MemberVO;

public class TeamVO {//이름,직위
	private String name; // 팀명 1조2조3조
	private int totalNumber; // 팀 인원수
	private String leaderName; //팀장명
	//private MemberVO leader;
	
	public TeamVO() {
		super();
	}

	public TeamVO(String name, int totalNumber, String leaderName) {
		super();
		this.name = name;
		this.totalNumber = totalNumber;
		this.leaderName = leaderName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	@Override
	public String toString() {
		return String.format("[%s(%d명) : %s]", this.name, this.totalNumber, this.leaderName);
	}
	
	@Override
	public int hashCode() {

		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		TeamVO vo = (TeamVO) obj;
		return this.name.equals(vo.name);
	}//팀명이 같으면 같은 객체로 인식

}//cls
