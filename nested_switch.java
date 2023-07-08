import java.util.Scanner;

public class nested_switch {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        switch(n){
            case 1:
            System.out.println("1st case is running");
            String nw=input.next();
            switch(nw){
                case "morning":
                System.out.println("morning");
                break;
                case "afternoon":
                System.out.println("afternoon");
                break;
                default:
                System.out.println("bye");
                break;
            }
            break;
            case 2:
            System.out.println("case 2 is running");
            break;
            default:
            System.out.println("default is running");
            
            
        }

    }
    
}
