import java.sql.Array;

public class example4 extends Throwable {
    public static void main(String[] args){
        try{
            func(10);

        }
        catch(ArithmeticException ex){
            System.out.println("This is arithmetic exception "+ex.getMessage());
       }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("This is arrayindexoutofbound exception "+ex.getMessage());
        }
        catch(RuntimeException ex){
            System.out.println("Runtime "+ex.getMessage());
        } catch (Exception ex){
            System.out.println("Exception "+ex.getMessage());

        } finally{
            System.out.println("Final block of exception");
        }
        System.out.println("Last line of program");

    }
    public static void func(int age) throws example5 {
        if(age<15) throw new example5("U are under age");
        int a = 10;
        int b = a/9;
        int[]arr = {1,2,3};
        System.out.println(arr[26]);
    }
}
