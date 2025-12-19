package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        System.out.println(s.length()); // 길이 출력
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        System.out.println(s.contains("Java")); // 포함되었는지 확인
        System.out.println(s.indexOf("Java")); // 문자열이 시작되는 위치
        System.out.println(s.lastIndexOf("and")); // 마지막으로 문자열이 시작되는 위치
        System.out.println(s.startsWith("I like")); // 특정 문자열로 시작되는지 여부
        System.out.println(s.endsWith(".")); // 특정 문자열로 끝나는지 여부
        System.out.println(s.endsWith("t")); // false
    }
}
