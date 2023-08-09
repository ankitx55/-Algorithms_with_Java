public class recursion {
    public static void main(String[] args) {
        System.out.println("hello");
        int n=1;
        print_function(n);

    }
    static void print_function(int n){
        if(n==5){
            System.out.println(5);
            return;

        }
        System.out.println(n);
        print_function(n+1);

    }
}
