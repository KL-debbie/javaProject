package days27;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      //============ 세트 선택 ===============
      
      int sets = selectSet();

      //============ 단복식 선택, 팀원선택 ===============
      
      int teamA, teamB, teamA1, teamA2, teamB1, teamB2;
      String player1Name;
      String player2Name;
      String[] playerList = {"박민석", "유희진", "고경림", "임경재", "이지현" , "김정주", "김호영"};

      System.out.printf("단식(1) 복식(2)");
      int isSingle = scanner.nextInt();
      if (isSingle == 1) {
         System.out.printf("팀원 선택: (1)박민석, (2)유희진, (3)고경림, (4)임경재, (5)이지현 , (6)김정주, (7)김호영\n");
         teamA = scanner.nextInt();
         System.out.printf("팀원 선택: (1)박민석, (2)유희진, (3)고경림, (4)임경재, (5)이지현 , (6)김정주, (7)김호영\n");
         teamB = scanner.nextInt();
         player1Name = String.format("%s", playerList[teamA]);
         player2Name = String.format("%s", playerList[teamB]);
      }else {
         System.out.printf("팀원 선택: (1)박민석, (2)유희진, (3)고경림, (4)임경재, (5)이지현 , (6)김정주, (7)김호영\n");
         teamA1 = scanner.nextInt();
         teamA2 = scanner.nextInt();
         System.out.printf("팀원 선택: (1)박민석, (2)유희진, (3)고경림, (4)임경재, (5)이지현 , (6)김정주, (7)김호영\n");
         teamB1 = scanner.nextInt();
         teamB2 = scanner.nextInt();
         player1Name = String.format("(%s) (%s)", playerList[teamA1], playerList[teamA2]);
         player2Name = String.format("(%s) (%s)", playerList[teamB1], playerList[teamB2]);
      }

      // =============== 객체 생성 ===============
      TennisScoreCounter scoreCounter = new TennisScoreCounter(sets, player1Name, player2Name); // 매개변수 세트수, A팀 이름, B팀 이름
      
      // =============== 점수 자동 입력 ===========
      int half =(sets/2)+1; // 세트 과반수
      try {
         while (true) {
            scoreCounter.dispScoreBoard(); //dispScoreBoad메소드 호출
            System.out.print("============== 테니스 점수표 ===============\n");

            int point = (int) (Math.random()*2 +1); // 1 or 2
            
            if (scoreCounter.getSets() == scoreCounter.getCurrentGame() || half == scoreCounter.getPlayer1SetsWon()
                  || half == scoreCounter.getPlayer2SetsWon()) {  // 정한 세트 수와 진행된 세트수가 같을때 || 한쪽이 이긴 세트수가 과반이 됐을때 break문 실행
               break;
            } //if
            if (point == 0) { //0점 나오면 종료 (나중에 승패 직접 입력할 시 써먹을 코드)
               break;
            } else if (point == 1 || point == 2) { // point가 1, 2점이면 pointWinner 메소드 호출 (매개변수 point)
               scoreCounter.pointWinner(point);
            } else {
               System.out.println("입력 값 오류");
            }

            try {
               Thread.sleep(100);
            } catch (Exception e) {
               e.printStackTrace();
            }
         } //while

      }
      catch (Exception e) {
         e.printStackTrace();
      }
      
      scoreCounter.dispScoreBoard(); // 전체 결과 한번더 출력
      System.out.println("Game End.");
      scoreCounter.resultFileWrite(); // txt파일로 출력
      System.out.println("텍스트 파일 출력 완료 ");
   }
   private static int selectSet() { // 세트수 return하는 메소드
      Scanner scanner = new Scanner(System.in);
      boolean flag = true;
      
      while (flag) {
         System.out.print("세트 선택 (3 or 5): ");
         int m = scanner.nextInt();
         if (m == 3 || m ==5) {
            return m;
         }
         System.out.printf("입력 오류) 3, 5만 입력해주세요\n");
      }
      return -1;
   } // selectSet
} // Main

class TennisScoreCounter {

   // =================TennisTennisScoreCounter 멤버 변수=====================
   private int sets; //세트
   private String player1Name; // 플레이어 이름 A
   private String player2Name; // 플레이어 이름 B
   private int player1SetsWon; // A팀 세트 이긴횟수
   private int player2SetsWon; // B팀 세트 이긴횟수
   private int[] player1Games; // A팀 게임 이긴 횟수
   private int[] player2Games; // B팀 게임 이긴 횟수
   private int currentSet;    // 진행된 세트
   private int[] currentGamePoints; // A팀과 B팀의 현재 점수 비교하는 배열 -->생성자로인해 객체 생성시 크기2로 초기화


   // =================TennisTennisScoreCounter 생성자=====================
   public TennisScoreCounter(int sets, String player1Name, String player2Name) {
      this.sets = sets; 
      this.player1Name = player1Name; 
      this.player2Name = player2Name; 
      this.player1SetsWon = 0; 
      this.player2SetsWon = 0; 
      this.player1Games = new int[sets]; 
      this.player2Games = new int[sets];
      this.currentSet = 0; 
      this.currentGamePoints = new int[2];
   }
   
   // ======================Getter Setter====================
   public int getSets() {
      return sets;
   }

   public void setSets(int sets) {
      this.sets = sets;
   }

   public int getCurrentGame() {
      return currentSet;
   }

   public void setCurrentGame(int currentGame) {
      this.currentSet = currentGame;
   }

   public int getPlayer1SetsWon() {
      return player1SetsWon;
   }

   public void setPlayer1SetsWon(int player1SetsWon) {
      this.player1SetsWon = player1SetsWon;
   }

   public int getPlayer2SetsWon() {
      return player2SetsWon;
   }

   public void setPlayer2SetsWon(int player2SetsWon) {
      this.player2SetsWon = player2SetsWon;
   }

   // =================TennisTennisScoreCounter 메소드=====================
   public void pointWinner(int point) {
      if (point == 1) {
         currentGamePoints[0]++; //point가 1점이 들어올시 currentGamePoints[0] + 1점 (A팀 승리)
      } else if (point == 2) {
         currentGamePoints[1]++; //point가 1점이 들어올시 currentGamePoints[1] + 1점 (B팀 승리)
      }

      if (currentGamePoints[0] >= 4 && currentGamePoints[0] - currentGamePoints[1] >= 2) { // A팀의 점수가 4점이상이고 B팀과의 점수차이가 2점이상일때
         player1Games[currentSet]++;                                                                   // A팀의 현재게임(game)++ ex) player1Games[0]++
         resetCurrentGamePoints();                                                                         // 둘의 점수를 초기화 하는 메소드
      } else if (currentGamePoints[1] >= 4 && currentGamePoints[1] - currentGamePoints[0] >= 2) {
         player2Games[currentSet]++;                                                                   // B팀의 현재게임(game)++ ex) player2Games[0]++
         resetCurrentGamePoints();
      } //if, else if

      if (player1Games[currentSet] >= 6 && player1Games[currentSet] - player2Games[currentSet] >= 2) {
         player1SetsWon++;
         currentSet++;
         resetCurrentGamePoints();
      } else if (player2Games[currentSet] >= 6 && player2Games[currentSet] - player1Games[currentSet] >= 2) {
         player2SetsWon++;
         currentSet++;
         resetCurrentGamePoints();
      } //if, else if

   } // pointWinner

   private void resetCurrentGamePoints() { // 현재 게임 점수 초기화 하는 메소드
      currentGamePoints[0] = 0;
      currentGamePoints[1] = 0;
   } //resetCurrentGamePoints

   public void dispScoreBoard() { // 화면에 출력하는 메소드
      //       System.out.println("=====================================");
      System.out.println("총 세트 스코어: " + player1Name + " " + player1SetsWon + " - " + player2SetsWon + " " + player2Name);
      System.out.println("-------------------------------------");

      for (int i = 0; i < currentSet; i++) {
         System.out.println( (i + 1) + "세트 게임 스코어 " + ": " + player1Games[i] + " - " + player2Games[i]);
      }

      if (currentSet < sets) {
         System.out.println("게임 스코어: " + player1Games[currentSet] + " - " + player2Games[currentSet]);
         System.out.println("포인트 스코어: " + player1Name + " " + getPointText(currentGamePoints[0]) +
               " - " + getPointText(currentGamePoints[1]) + " " + player2Name);
      } else {
         System.out.println("모든 세트 완료");
      }

      System.out.println("=====================================");
   } // dispScoreBoard

   private String getPointText(int points) { //점수를 String(0,15,30,40,40A)으로 반환하는 메소드 
      switch (points) {
      case 0:
         return "0";
      case 1:
         return "15";
      case 2:
         return "30";
      case 3:
         return "40";
      default:
         return "40A";
      } //switch
   } // getPointText
    // ==================텍스트 파일에 출력 ================
   public void resultFileWrite() {
      String fileName = ".\\src\\days27\\TennisGameResult.txt";
      //초기화 하는 파일의 확장자 : ini
      try ( PrintStream printStream = new PrintStream(new FileOutputStream(fileName))) {
         dispScoreBoard(printStream);
      } catch (Exception e) {
         e.printStackTrace();
      } //try-catch
   } //resultFileWrite()

   private void dispScoreBoard(PrintStream sysout) {
      if (sysout !=null) {
         System.setOut(sysout);
      } //if

      System.out.println("총 세트 스코어: " + player1Name + " " + player1SetsWon + " - " + player2SetsWon + " " + player2Name);
      System.out.println("-------------------------------------");

      for (int i = 0; i < currentSet; i++) {
         System.out.println( (i + 1) + "세트 게임 스코어 " + ": " + player1Games[i] + " - " + player2Games[i]);
      }

      if (currentSet < sets) {
         System.out.println("게임 스코어: " + player1Games[currentSet] + " - " + player2Games[currentSet]);
         System.out.println("포인트 스코어: " + player1Name + " " + getPointText(currentGamePoints[0]) +
               " - " + getPointText(currentGamePoints[1]) + " " + player2Name);
      } else {
         System.out.println("모든 세트 완료");
      }

      System.out.println("=====================================");
   } //dispScoreBoard

} // class TennisScoreCounter