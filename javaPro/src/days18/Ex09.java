package days18;

public class Ex09 {
	
	public static void main(String[] args) {
		
		//						StringBuffer, 	StringBuilder 클래스
		// ㄴ 멀티스레드			안전 O				안전 X
		// ㄴ 동기화처리				O					X
		// 동기화 StringBuilder > StringBuffer
		
		// 위 두 클래스 언제사용?   String -- 변경 불가능 클래스
		//  ㄴ	위 두클래스는 변경 가능 -> 문자 중간 삽입, 수정, 삭제, 추가 가능  문자열을 변경할 경우가 있을 경우 사용
		// 객체가 라인수만큼 생성되고있음 -> 좋은 코딩 X -> StringBuffer, 	StringBuilder 클래스 사용
		// 문자열 자체 수정
		
		String sql = "SELECT ";
        sql += "a.ano ";
        sql += " ";
        sql += ", a.user_id as userId ";
        sql += " ";
        sql += ", b.user_name as userName ";
        sql += " ";
        sql += ", a.rno ";
        sql += " ";
        sql += ", c.rname ";
        sql += " ";
        sql += ", DATE_FORMAT(a.sd,'%Y-%m-%d') as sd ";
        sql += " ";
        sql += ", DATE_FORMAT(a.ed,'%Y-%m-%d') as ed ";
        sql += " ";
        sql += ", DATE_FORMAT(a.rd,'%Y-%m-%d %T') as rd ";
        sql += " ";
        sql += ", DATE_FORMAT(a.check_in,'%Y-%m-%d %T') as checkIn ";
        sql += " ";
        sql += ", DATE_FORMAT(a.check_out,'%Y-%m-%d %T') as checkOut ";
        sql += " ";
        sql += "-- , a.sign_yn as signYn ";
        sql += " ";
        sql += ", d.code_name as signYn ";
        sql += " ";
        sql += "-- , a.cancel_yn as cancelYn ";
        sql += " ";
        sql += ", e.code_name as cancelYn ";
        sql += " ";
        sql += "FROM tb_reservation a left outer join tb_user b on a.user_id = b.user_id ";
        sql += " ";
        sql += "left outer join tb_rooms c on a.rno = c.rno ";
        sql += " ";
        sql += "left outer join tb_code d on a.sign_yn = d.code_cd ";
        sql += " ";
        sql += "left outer join tb_code e on a.cancel_yn = e.code_cd ";
        
        System.out.println(sql);
	} // main

}//class
