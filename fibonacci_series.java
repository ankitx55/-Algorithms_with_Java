public class fibonacci_series {
//    Fibonacci series is a series in which first two terms are 0 and 1 respectively
//    and each term is the sum of first two preceding elements in the series
//    For example, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 65...
//    If the starting two terms are given as a & b then the nth element after the first two terms are given by:
//    t(1) = a+b
//    t(2) = t(1)+b
//    t(3) = t(2) + t(1)
//    similarly, t(n) = t(n-1) + t(n-2)

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib_series(n));
    }
    static int fib_series(int n){
        if(n<2) {
            return n;
        }
        return fib_series(n-1)+ fib_series(n-2);
    }


}
