import java.util.Scanner;
public class example3  {
    public static void method(int s)throws ArithmeticException {

          int div = 10/s;

        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        try{
        example3.method(s);
        }catch(ArithmeticException ex){
            System.out.println("a");
        }
        }
}
