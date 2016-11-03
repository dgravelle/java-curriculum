public class Ops {

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y, int z) {
        return x * y * z;
    }

    public static int power(int x) {
        for (int i = 0; i < 1; i++) {
            x = x * x;
        }

        return x;
    }

    public static void main(String [] args) {
        int first;
        int second;
        int result;

        first = 1;
        second = 2;
        result = sum(first, second);



        System.out.println( power(2) );
    }

}
