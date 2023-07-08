import java.util.Scanner;

public class count {
    public static void main(String arg[]){
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        int find=input.nextInt();
        int c=0;
        // System.out.println(num%10 + " "+find/10);
        while(num>0){
            // System.out.println(num);
            int r=num%10;
            if (r==find){
                c=c+1;
            }
            num=num/10;
        }
        System.out.println(c);

    }
    
}
