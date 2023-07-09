import java.util.Scanner;

public class return_func {
    public static void main(String arg[]){
        // int a=0;
        // int b=0;  it is printing zeros how to acces from one scope to other
        System.out.println("the sum of "+" and " + " is " +sum());

    }
    static int sum(){
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        return(a+b);
    }
    
}
