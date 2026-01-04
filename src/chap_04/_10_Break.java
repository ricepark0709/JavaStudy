package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break

        // For문
        int max = 20;
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == max) {
                System.out.println("재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        // While문
        int customer = 1;
        while (customer <= 20) {
            System.out.println(customer + "번 손님, 주문하신 치킨 나왔습니다.");
            if (customer == max) {
                System.out.println("재료가 모두 소진되었습니다.");
                break;
            }
            customer++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
