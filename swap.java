import java.util.Scanner;

public class swap {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println(d(a,b));

    }
    static int d(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        return (a);
    }
    
}
