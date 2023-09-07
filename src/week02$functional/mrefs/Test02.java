package week02$functional.mrefs;

/******************************************************************
 * Week-01 Lab
 * This refers to a question in the lab quiz.
 * Question : Method Reference
 * Fill in the correct code for test.setOnAction2(__________)
 * below using the interface F2 indicated.
 ******************************************************************/
public class Test02 {

    public static void main(String[] args) {
        Test02 test = new Test02();
        //FIXME: Update arguments with interface F2
        //test.setOnAction2();
    }

    public void setOnAction2(F2 f) {
        f.function(4.5);
    }

    public void apply(Double d){}

}

//TODO: What is the argument for setOnAction2 for this interface?
interface F2 {
    void function(Double d);
}
