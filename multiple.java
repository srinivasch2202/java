import java.util.Scanner;

public class multiple {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int sal=input.nextInt();
        if(sal <5000){
            System.out.println("no bonus ");
        }
        else if(sal<10000 && sal>5000 ){
            System.out.println("1000 bouns");
            
        }
        else{
            System.out.println("2000 bonus");
        }
    }
}
