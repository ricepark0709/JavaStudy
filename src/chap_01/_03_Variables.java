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
    }
}
