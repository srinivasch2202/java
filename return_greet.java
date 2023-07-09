import java.util.Scanner;

public class return_greet {
    public static void main(String args[]){
        String note=greet();
        System.out.println(note+"\t"+greet());

    }
    static String greet(){
        Scanner input=new Scanner(System.in);
        String name=input.next();
        return("hello good morning "+name);
    }
}
