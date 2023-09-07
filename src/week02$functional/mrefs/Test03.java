package week02$functional.mrefs;
/******************************************************************
 * Week-01 Lab
 * This refers to a question in the lab quiz.
 * Question : Method References
 * Fill in the correct code for test.setOnAction3(__________)
 * below using the interface F3 indicated.
 ******************************************************************/
public class Test03 {

    public static void main(String[] args) {
        Test03 test = new Test03();
        //FIXME: Update arguments with interface F3
        //System.out.println(test.setOnAction3());
    }

    public double setOnAction3(F3 f) {
        return f.function(3.5);
    }

}


//TODO: What is the argument for setOnAction3 for this interface?
interface F3 {
  double function(Double d);
}

