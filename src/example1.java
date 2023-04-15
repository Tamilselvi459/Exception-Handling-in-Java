import java.util.*;
public class example1 {

    public static int method(){
        int a ;
        try{
            System.out.println("Inside the try block");
            return 16;

        }catch(Exception ex){
            System.out.println("catch ");
        }finally{
            System.out.println("this is a final block");
        }
        return 12;
    }
    public static void main(String[] args){
        System.out.println(example1.method());
    }
}
