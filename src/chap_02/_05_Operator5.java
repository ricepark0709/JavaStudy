package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // (조건) ? true일 때 반환하는 값 : false일 때 반환하는 값
        int x = 3;
        int y = 5;
        int max;
        max = (x>y) ? x : y;
        System.out.println(max);

        boolean b=(x!=y) ? true : false;
        System.out.println(b);

        String s = (5==3) ? "같아요" : "달라요";
        System.out.println(s);
    }
}
