public class return_arguments {
    public static void main(String args[]){
        String nme=greet("srinivas");
        System.out.println(nme);

        System.out.println(greet("padhu"));
    }
    static String greet(String name){
        return("hello myname is "+name);

    }
}
