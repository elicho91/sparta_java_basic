import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 90){
            System.out.println("A등급입니다.");
        }else if(score >= 80){
            System.out.println("B등급입니다.");
        }else if(score >= 70){
            System.out.println("C등급입니다.");
        }else{
            System.out.println("F등급입니다.");
        }
    }
}
