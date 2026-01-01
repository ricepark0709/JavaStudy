package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        for (int i=0; i < 10; i++){
            System.out.println("환영합니다." + i);
        }

        // 짝수만 출력
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        // 홀수만 출력
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }

        // 거꾸로 숫자
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // 1~10까지의 수들의 합
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("총 " + sum + "입니다.");
    }
}
