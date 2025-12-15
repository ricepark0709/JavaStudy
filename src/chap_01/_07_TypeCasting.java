package chap_01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // int --> long --> float --> double 순서로 자동 형변환, 반대로는 오류남
        int a = 64;
        System.out.println((long)a);
        System.out.println((float)a);
        System.out.println((double)a);

        a = (int) 98.8;
        System.out.println(a);

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        double d = Double.parseDouble("98.8");
        System.out.println(i);
        System.out.println(d);
    }

}
