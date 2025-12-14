package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        int hit=120;
        double OPS=0.986;

        String name = "전준우";
        char bat = 'R';

        boolean field = false;

        System.out.println("선수 이름은 " + name + ", 타석은 " + bat + "이다.");
        System.out.println("안타 갯수는 " + hit + ", OPS는 " + OPS + ".");
        System.out.println("수비 여부는 " + field);

        long salary = 3_400_000_000L;
        float f = 0.333333333333F;
        double d = 0.333333333333;
        System.out.println("FA 금액 " + salary + "원");
        System.out.println("타율 " + f);
        System.out.println("타율 " + d);
    }
}
