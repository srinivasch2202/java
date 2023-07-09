public class shadowing {
    static int a=10;//this will be shadowed at line 5
    public static void main(String args[]){
        System.out.println(a);
        int a=23;//here we are showding the a variable 
        System.out.println(a);
        prin();
    }
    static void prin(){
        System.out.println(a);
    }
}
