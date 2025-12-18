package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 제육볶음 = false;
        boolean 김치찌개 = true;
        boolean 계란말이 = true;

        System.out.println(제육볶음 || 김치찌개 || 계란말이); // ||은 or에 해당
        System.out.println(제육볶음 && 김치찌개 && 계란말이); // &&은 and에 해당

        System.out.println((5>3)||(6<=2));
        System.out.println((5>3)&&(6<=2));

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5==5)); // false
        System.out.println(!(5!=5)); // true
    }
}
