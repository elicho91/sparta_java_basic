public class Main2 {
    public static void main(String[] args){

        //조건문 if
        int check = 100;
        int num1 = 150;

        if(num1 > 100){
            System.out.println("100보다 큰 수 입니다.");
        }else{
            System.out.println("100보다 작은 수 입니다.");
        }

        //조건문 switch
        char score = 'A';
        switch (score){
            case 'A':
                System.out.println("A등급입니다.");
                break;
            case 'B':
                System.out.println("B등급입니다.");
                break;
            case 'C':
                System.out.println("C등급입니다.");
                break;
            default:
                System.out.println("낙제입니다.");

        }

        //삼항연산자
        int a = 5;
        String result = (a < 10) ? "10보다 작습니다" : "10보다 큽니다."; // 참이면 왼쪽, 거짓이면 오른쪽
        System.out.println(result);

    }
}
