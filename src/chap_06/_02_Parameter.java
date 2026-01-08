package chap_06;

public class _02_Parameter {
    // 전달값이 있는 메소드
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        power(16);
    }
}
