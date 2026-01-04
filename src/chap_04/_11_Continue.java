package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == noShow){
                System.out.println(i + "번 손님, 주문이 취소되었습니다.");
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("준비된 재료가 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        sold = 0;
        int index = 1;
        while (true) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index == noShow) {
                System.out.println(index + "번 손님, 주문이 취소되었습니다.");
                index++;
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
