package week02$functional.mrefs;

/******************************************************************
 * Week-01 Lab
 * This refers to a question in the lab quiz.
 * Section : Method References
 * Fill in the correct code for test.setOnAction1(__________)
 * below using the interface F1 indicated.
 ******************************************************************/

public class Test01 {
    public static void main(String[] args) {
        Test01 test = new Test01();
        //FIXME: Update arguments with interface F1
        //test.setOnAction1();
    }

    public void setOnAction1(F1 f) {
        f.function();
    }

}

//TODO: What is the argument for setOnAction1 for this interface?
interface F1 {
  void function();
}

//This is a class with a static method
class Model {
	public static void apply(){}

}
