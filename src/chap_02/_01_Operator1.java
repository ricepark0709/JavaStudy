package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 일반 연산
        System.out.println(4+2);
        System.out.println(4-3);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(4%3); // 나머지
        System.out.println(1/2); // 소수점 이하 버림
        // 우선 순위 연산
        System.out.println((4+2)*2);
        System.out.println(4+2*2);
        // 변수 이용 연산
        int a = 10;
        int b = 20;
        int c;
        c = a+b;
        System.out.println(c);
        c = a*b;
        System.out.println(c);
        // 증감 연산
        int value=10;
        System.out.println(++value); // 11

        value = 10;

        System.out.println(value++); // 10
        System.out.println(value); // 11

        System.out.println(value--);
        System.out.println(value);
    }
}
