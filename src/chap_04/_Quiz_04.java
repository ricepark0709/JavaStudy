package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10, parkingFee;
        boolean compactCar = false, disability = true;

        parkingFee = hour * 4000;
        if (parkingFee > 30000) {
            parkingFee = 30000;
        }

        if (compactCar == true || disability == true) {
            parkingFee /= 2;
        }

        System.out.println("주차 요금은 " + parkingFee + " 원입니다.");
    }
}
