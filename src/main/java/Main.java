import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //숫자
        int number = 5;
        System.out.println(number);

        //문자열
        String sparta = "Hello Sparta";
        System.out.println(sparta);

        //상수 final(접근제어자)
        final int finalNumber = 1;
        System.out.println(finalNumber);

        // **기본 자료형
        //정수
        short s = 1;
        System.out.println(s);

        int a = 3;
        System.out.println(a);

        long b = 4;
        System.out.println(b);

        //실수
        float f = 5.5f;
        System.out.println(f);

        double d = 5.5;
        System.out.println(d);

        //표현할 수 있는 최대값과 최소값
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);

        //문자 자료형
        char c = 'A'; //글자 하나만
        System.out.println(c);

        //논리 자료형
        boolean fact = true;
        fact = false;
        System.out.println(fact);

        byte data = 'd';
        System.out.println(data);

        //**참조 자료형
        //
        String sparta1 = "Hello sparta";
        System.out.println(sparta1);

        //int배열 (int를 여러가지 담을 수 있는 배열), 선언과 동시에 초기화 (사이즈 지정X)
        int[] intArray = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(intArray));

        //아무것도 할당하지 않은 배열 (사이즈만 지정)
        //int의 default 값 = 0
        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        //String의 defualt 값 - null
        String[] stringEmptyArray = new String[5];
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] season = new String[]{"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));

        //배열이 가지고 있는 길이 리턴
        System.out.println(season[season.length -1]);

        int[] arrayList = new int[]{10, 20, 30};
        System.out.println(arrayList[arrayList.length-1]);

        //**산술연산자
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);

        //**대입
        num1 += num2;
        System.out.println(num1); //30

        num1 -= num2;
        System.out.println(num1); //10

        num1 *= num2;
        System.out.println(num1); //200

        System.out.println(num1 > num2); //boolean 타입 결과

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 && b2); //두개 모두 참이여야 참
        System.out.println(b1 || b2); //둘중 하나라도 참이면 참
        System.out.println(!b2); //결과값을 반대로
















    }
}