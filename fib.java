import java.util.Scanner;

public class fib {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int a=0;
        int b=1;
        int num=input.nextInt();
        int c=0;
        for(int i=0;i<num-1;i++){
            c=a+b;
            // System.out.println(c);
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
