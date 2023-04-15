import java.util.Scanner;
public class example2 {
    public static void checkNum(int a){
        if(a==1) throw new RuntimeException("Number is 1 here");
        else{
            System.out.println(a+" number is > than 1");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        example2 obj = new example2(){
          example2.checkNum(num);
        }

    }

