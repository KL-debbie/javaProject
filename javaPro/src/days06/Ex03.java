package days06;

/**
 * @author KL
 * @date 2023. 7. 20. - 오전 11:16:46
 * @subject 복습 4번
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		//4. 알파벳(대,소문자) 코드 및 문자를 출력하는  코딩을 하세요.
		// ( 조건 : 한 라인에 10개씩 출력 )

		// 대문자 출력
		// for (int i = 'A', count=1;  i <='z'; i++, count++) { // 91~96 제외했는데 카운트됨
		for (int i = 'A', count=1,lineNumber= 1;  i <='z'; i++ ) { 
			if (i> 'Z' && i<'a') continue;
			
			if(count %10 ==1) System.out.printf("%d:", lineNumber++);
			System.out.printf(" %1$c(%1$03d)",i );
			if(count++%10==0) System.out.println();
			if( i =='Z') { 
				System.out.println();
				count=1;
			}			
		} // for

		/*1: A(065) B(066) C(067) D(068) E(069) F(070) G(071) H(072) I(073) J(074)
           2: K(075) L(076) M(077) N(078) O(079) P(080) Q(081) R(082) S(083) T(084)
           계속 하려면 아무키나 누르세요
           3: U(085) V(086) W(087) X(088) Y(089) Z(090)
           4: a(097) b(098) c(099) d(100) e(101) f(102) g(103) h(104) i(105) j(106) 
           5: k(107) l(108) m(109) n(110) o(111) p(112) q(113) r(114) s(115) t(116)
           6: u(117) v(118) w(119) x(120) y(121) z(122)
           계속 하려면 아무키나 누르세요
           -> 종료*/

	}//main

}//class
