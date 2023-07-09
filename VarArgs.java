import java.util.Arrays;

public class VarArgs {
    public static void main(String args[]){
        arguments(1,2,3,4,5,6);
        arguments();
    }
    static void arguments(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
