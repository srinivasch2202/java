import java.util.Scanner;

public class reverse {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        int rev=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
