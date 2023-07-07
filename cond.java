import java.util.Scanner;

public class cond{
    public static void main(String args[]){
        System.out.println("enter the salary");
        Scanner input=new Scanner(System.in);
        int sal =input.nextInt();
        if (sal > 10000){
            sal=sal+2000;
            System.out.println(sal);
        }
        else{
            sal=sal+1000;
            System.out.println("the salary is "+ " " +sal);
        }

    }
}