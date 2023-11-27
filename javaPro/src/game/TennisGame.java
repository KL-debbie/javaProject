package game;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 게임옵션 입력받아 게임 실행하는 클래스
public class TennisGame {
	public static void main(String[] args) throws InterruptedException {
		DispFiglet.tennisStart();
		
		// 게임 옵션 입력받기
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		String input="";
		
		System.out.println("=".repeat(80) + "\n\n  [게임 옵션 선택]");
		// 세트 선택      
		// 3set : true / 5set : false
		flag = false;
		do {
			if(flag) System.out.println("   << 잘못 선택하셨습니다. (1 또는 2 입력)");
			System.out.print("    > 1. 3set\t2. 5set\t선택 : ");
			input = scanner.next();
		} while (flag = !(input.matches("[1-2]")));
		boolean is3Set = input.equals("1");
		
		// 단식 복식 선택      
		// 단식 : true / 복식 : false
		do {
			if(flag) System.out.println("   << 잘못 선택하셨습니다. (1 또는 2 입력)");
			System.out.print("    > 1. 단식\t2. 복식\t선택 : ");
			input = scanner.next();
		} while (flag = !(input.matches("[1-2]")));
		boolean isSingle = input.equals("1");

		// 선수 선택
		Team teamA, teamB;
		ArrayList<String> teamAPlayer = new ArrayList<>();
		ArrayList<String> teamBPlayer = new ArrayList<>();

		System.out.println("\n  [선수 입력]");
		if (isSingle) {
			System.out.print("    > A Team Player\t입력 : ");
			teamAPlayer.add( scanner.next() );
			System.out.print("    > B Team Player\t입력 : ");
			teamBPlayer.add( scanner.next() );
		} else {
			System.out.print("    > A Team Player1\t입력 : ");
			teamAPlayer.add( scanner.next() );
			System.out.print("    > A Team Player2\t입력 : ");
			teamAPlayer.add( scanner.next() );
			System.out.print("    > B Team Player1\t입력 : ");
			teamBPlayer.add( scanner.next() );
			System.out.print("    > B Team Player2\t입력 : ");
			teamBPlayer.add( scanner.next() );
		}

		teamA = new Team(teamAPlayer);
		teamB = new Team(teamBPlayer);

		
		System.out.println("=".repeat(80));
		//단/복식 입력, 세트 수 입력, 이름 입력 받기
		
		
		//
		
		// 게임 인스턴스 생성
		ScoreBoard scoreBoard = new ScoreBoard(teamA, teamB, is3Set, isSingle);

		// 게임 진행
		scoreBoard.game();

		
		// 게임 결과 출력
		String fileName = System.getProperty("user.dir") + "\\TennisGameResult.txt";
		try ( PrintStream printStream = new PrintStream(new FileOutputStream(fileName))) {
			scoreBoard.dispScoreBoard(printStream);
		} catch (Exception e) {
			e.printStackTrace();
		} //try-catch

		scanner.close();
	} //main
	
	
} //class


// 점수 카운팅해서 점수판 출력하는 클래스
class ScoreBoard {

	private Team teamA;
	private Team teamB;
	private boolean is3Set;
	private boolean isSingle;
	private String[] pointScore = {"0","0"};
	private Integer[] gameScore = {0, 0};
	private Integer[] setScore = {0, 0};
	private ArrayList<String> gameWinnerList = new ArrayList<>();
	private ArrayList<String> setWinnerList = new ArrayList<>();
	private ArrayList<Integer[]> setGameScoreList = new ArrayList<>();  // gameScore 누적

	public ScoreBoard(Team teamA, Team teamB, boolean is3Set, boolean isSingle) {
		this.teamA = teamA;
		this.teamB = teamB;
		this.is3Set = is3Set;
		this.isSingle = isSingle;
	}


	public void game() throws InterruptedException {
		int setCount = is3Set? 2 : 3;
		int winnerIndex;
		String winnerScore;

		// 게임 점수 리셋
		this.setScore[0] = 0;
		this.setScore[1] = 0;
		
		while ( this.setScore[0]<setCount && this.setScore[1]<setCount ) {

			// 게임 점수 리셋
			this.gameScore[0] = 0;
			this.gameScore[1] = 0;
			
			// teamA와 teamB의 점수가 모두 5점 이하일 경우
			// teamA와 teamB의 점수가 모두 5점 이상이면서, 점수차가 2미만일 경우
			while (  (this.gameScore[0]<=5 && this.gameScore[1]<=5) || (this.gameScore[0]>=5 && this.gameScore[1]>=5 && (Math.abs(this.gameScore[0]-this.gameScore[1])<2)) ) {
				
				// 점수 리셋
				this.pointScore[0] = "0";
				this.pointScore[1] = "0";
				
				do {
					this.dispScoreBoard(null);
					
					winnerIndex = (int)(Math.random()*2);
					winnerScore = pointWinner(winnerIndex);  
				} while ( !winnerScore.equals("60") );

				this.gameWinnerList.add( winnerIndex==0? "teamA" : "teamB" );
				this.gameScore[ winnerIndex ]++;
				
			} //while

			boolean isSetWinnerTeamA = this.gameScore[0] > this.gameScore[1];
			this.setWinnerList.add( isSetWinnerTeamA? "teamA" : "teamB" );
			this.setScore[ isSetWinnerTeamA? 0 : 1 ]++;
			
			// 한 세트의 게임 점수 누적
			Integer[] gameScoreClone = this.gameScore.clone();
			this.setGameScoreList.add( gameScoreClone );
			
			this.dispScoreBoard(null);

			gameWinnerList = new ArrayList<>();

		} //while

		DispFiglet.winAB( this.setScore[0]>this.setScore[1]? "A" : "B" );

	} //game()


	// 해당 인덱스의 팀 점수 카운팅
	// 0, 15, 30, 40, 40A, 60
	public String pointWinner(int p) {
		switch (this.pointScore[p]) {
		case "0":
			this.pointScore[p] = "15";
			break;
		case "15":
			this.pointScore[p] = "30";
			break;
		case "30":
			this.pointScore[p] = "40";
			break;
		case "40":
			int loserIndex = p==0? 1 : 0;
			if (this.pointScore[ loserIndex ].equals("40")) {
				this.pointScore[p] = "40A";
			} else if (this.pointScore[ loserIndex ].equals("40A")) {
				this.pointScore[loserIndex] = "40";
			} else {
				this.pointScore[p] = "60";
			}
			break;
		case "40A":
			this.pointScore[p] = "60";
			break;
		} //switch

		return this.pointScore[p];
	} //pointWinner()


	public void dispScoreBoard(PrintStream sysout) {
		// System.out 기본값(console) 
		if (sysout != null) {
			System.setOut(sysout);
		} //if
		
		System.out.println("\n".repeat(5) + "=".repeat(80));
		System.out.println("  [Game Option]");
		System.out.printf("\tSet : %s\n", this.is3Set? "3set":"5set");
		System.out.printf("\tType : %s\n", this.isSingle? "단식":"복식");
		System.out.printf("\tA Team %s\n", this.teamA.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
		System.out.printf("\tB Team %s\n", this.teamB.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
		System.out.println("=".repeat(80));

		System.out.println("  [Score Board]\n");

		System.out.println("  -- Set Score --");
		System.out.println("\tteamA\tteamB");
		System.out.printf("\t%s\t%s\n\n", setScore[0], setScore[1]);
		System.out.println("\t< Set Winner >");
		int setSize = setWinnerList.size();
		for (int i = 0; i < setSize; i++) {
			System.out.printf("\t%dset", i+1);
		} // for
		System.out.println();
		for (int i = 0; i < setWinnerList.size(); i++) {
			System.out.printf("\t%s", setWinnerList.get(i));
		} // for
		System.out.println("\n");

		// 파일 출력시
		if (sysout != null) {
			System.out.println("  -- Game Score --");
			String teamAGameScore = "";
			String teamBGameScore = "";
			for (int i = 0; i < setGameScoreList.size(); i++) {
				teamAGameScore += (setGameScoreList.get(i)[0] + "\t");
				teamBGameScore += (setGameScoreList.get(i)[1] + "\t");
			} // for
			System.out.printf("\tteamA\t%s\n", teamAGameScore);
			System.out.printf("\tteamB\t%s\n", teamBGameScore);
			System.out.println("=".repeat(80));
			return;
		} //if
		
		System.out.println("  -- Game Score --");
		System.out.println("\tteamA\tteamB");
		System.out.printf("\t%s\t%s\n\n", gameScore[0], gameScore[1]);
		System.out.println("\t< Game Winner >");
		int gameSize = gameWinnerList.size();
		for (int i = 0; i < gameSize; i++) {
			System.out.printf("\t%dgame", i+1);
		} // for
		System.out.println();
		for (int i = 0; i < gameSize; i++) {
			System.out.printf("\t%s", gameWinnerList.get(i));
		} // for
		System.out.println("\n");
		
		System.out.println("  --Point Score--");
		System.out.println("\tteamA\tteamB");
		System.out.printf("\t%s\t%s\n", pointScore[0], pointScore[1]);

		System.out.println("=".repeat(80));
		System.out.println();
		
		try {					
			System.out.println("> 엔터를 누르세요.");
			System.in.read();
			System.in.skip(System.in.available());			       		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	} //dispScoreBoard()
}
