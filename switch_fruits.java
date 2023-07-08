import java.util.Scanner;

public class switch_fruits {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String word=input.next();
        switch(word){
            case "mango":
            System.out.println("king");
            break;
            // if we dont give a break it exeute till it sees break statements
            case "grapes":
            System.out.println("small");
            break;
            default:
            System.out.println("wrong entry");
        }
    }
    
}

// public class switch_fruits{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         int a=input.nextInt();
//         int b=input.nextInt();
//         String v=input.next();
//         switch(v){
//             case "+":
//             System.out.println("addition" + (a+b));
//             break;
//             case "-":
//             System.out.println("subtractions"+" " +(a-b));
//             break;
//             default:
//             System.out.println("invalid");
//         }
//     }
// }

// public class switch_fruits{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         switch(n){
//             case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
//             default -> System.out.println("weekdays");

//         }
//     }
// }