import java.util.Scanner;

public class greeting_func {
    public static void main(String arg[]){
        greet(); 
    }
    static void greet(){
        Scanner input=new Scanner(System.in);
        String name=input.next();
        System.out.println("hello"+ " "+name);
    }
    
}
