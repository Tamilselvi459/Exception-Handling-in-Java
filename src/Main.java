import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
      String s = null;

        try{
            for(int i=0;i<arr.length;i++) {
//                if(i==6) System.out.println(arr[i]/0);
//                else System.out.print(arr[i]+" ");
                System.out.print(arr[0]);
            }
            int b = 10/a;  // In the try block it check for only try and execute that;
            System.out.println(s.length());

        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception is handled here "+e.getMessage());

        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("arrayoutofbound error"+ex.getMessage());
        } catch(Exception e){
            System.out.println("Custom exception "+e.getMessage());
        }finally {
            System.out.println("final block");
        }
        System.out.println("last line");

    }
}