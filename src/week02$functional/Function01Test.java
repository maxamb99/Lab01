package week02$functional;

import functions.F1;
import functions.F2;
import functions.F3;

public class Function01Test {

    public static void main(String[] args) {
        //TODO: Create Method Calls using Functional Programming to
        //      1. TEST THE SQUARE OF A FUNCTION
        //      2. TEST THE MATH OPERATORS (ADD, SUBTRACT, DIVIDE, MULTIPLY)
        //      3. TEST THE VOLUME OF A BOX
        //      4. TEST THE VOLUME OF A CYLINDER
        //      5. TEST THE VOLUME OF A SPHERE
    }


    //TODO: Update To Pass Function and Radius Value
    public static void testSquareFunction(F1 f, int value){
        System.out.println();
        System.out.println("======== R E S U L T S ==========");
        System.out.println();
        System.out.printf("The Square of the value is : %s", "PLACE HOLDER");
        System.out.println();
        System.out.println("================================");
    }


    //TODO: Update To Pass Function, Operation Message, Symbol and Values
    public static void testOperators(F2 f, String msg, String op, int x, int y){

        System.out.println();
        System.out.println("============= " + msg + " =============");


        System.out.println();
        if (op.equals("/"))
            System.out.printf("%d %s %d = %.1f", y, op, x, f.f(x,y));
        else
            System.out.printf("%d %s %d = %.1f", x, op, y, f.f(x,y));

        System.out.println();
        System.out.println("==================================================");
    }


    //TODO: Update To Pass Function and Dimension Values
    public static void testVolumeOfBox(F3 f, int width, int length, int height){
        System.out.println();
        System.out.println("======== R E S U L T S==========");
        System.out.println();
        System.out.printf("The volume of the box is: %s", "PLACE HOLDER");
        System.out.println();
        System.out.println("================================");
    }


    //TODO: Update To Pass Function and Dimension Values
    public static void testVolumeOfCylinder(F2 f, int radius, int height){
        System.out.println("======== R E S U L T S==========");
        System.out.println();
        System.out.printf("Volume of cylinder is: %s ", "PLACE HOLDER");
        System.out.println();
        System.out.println("================================");
    }


    //TODO: Update To Pass Function and Radius Value
    public static void testVolumeOfSphere(F1 f, int radius){
        //TODO: Update TO PRINT result to console
        System.out.println("======== R E S U L T S ==========");
        System.out.println();
        System.out.printf("Volume of sphere is: %s", "PLACE HOLDER");
        System.out.println();
        System.out.println("==================================");
    }

}