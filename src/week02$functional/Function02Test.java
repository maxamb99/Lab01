package week02$functional;

public class Function02Test {

    public static double add(int x, int y){
        return x + y;
    }

    public static double divide(int x, int y){
        if (x == 0)
            throw new IllegalArgumentException("Cannot Divide by Zero!");

        return (double) y / x;
    }

    public static double multiply(int x, int y){
        return x * y;
    }

    public static double subtract(int x, int y){
        return x - y;
    }


    public static void main(String[] args) {
        //TODO: How would you test these functions?
    }


}