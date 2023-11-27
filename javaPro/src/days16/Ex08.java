package days16;

public class Ex08 {
	
	public static void main(String[] args) {
		
	} // main

}// class


// 자바 ~~able 인터페이스 많음
interface Movable{
	
	// 1. 상수
	// 2. 추상메서드
	// 3. default 메서드
	// 4. static 메서드
	
	void move(int x, int y) ;  // public abstract
}

interface Attackable{
	
	void attack(Unit unit);
}

// 인터페이스끼리 상속 가능, 다중 상속도 가능
interface Fightable extends Attackable, Movable{
	
	// 추상메서드
}


abstract class Unit{
	int currentHP; //현재 유닛의 체력
	int x;				// 유닛의 위치(x좌표값)
	int y;				// 유닛의 위치(y좌표값)
	
}

// 하늘 유닛
class AirUnit extends Unit{

	
}

// 땅 유닛
class GroundUnit extends Unit{
	
}

// 군인
class Fighter implements Fightable {  //move() ,attack()

	@Override
	public void attack(Unit unit) {
		// 총, 칼 공격 등등..

	}

	@Override
	public void move(int x, int y) {
		// 걷기
		
	}
	
}

// 수리가능한 유닛
// 상수 X, 추상메서드 X, 멤버 X
interface Repairable{}


class Tank extends GroundUnit implements Fightable, Repairable{

	@Override
	public void attack(Unit unit) {
		// 대포 공격
		
	}

	@Override
	public void move(int x, int y) {
		// 탱크 움직이는 코딩
		
	}
	
}

// SCV 
// 수리 가능 : Repairable 인터페이스를 구현한 클래스, Tank, SCV
// 수리 불가능 : Fighter 구현 X
class SCV extends GroundUnit implements Repairable{
	
	SCV(){}
	
	// 건물 짓는 메서드
	// 다른 유닛 수리하는 메서드
	//void repair(수리 가능 유닛) {
	void repair(Repairable unit) {

		if (unit instanceof Tank) {
			// Tank 수리코딩
		} else if( unit instanceof SCV) {
			// SCV 수리코딩
		} else if( unit instanceof DropShip) {
			// DropShip 수리코딩
		}

	}
}

//수송선,수송기
class DropShip extends AirUnit implements Fightable, Repairable{

	@Override
	public void attack(Unit unit) {
		
	}

	@Override
	public void move(int x, int y) {
		
	}
	
}
