package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.

    private static String glue = "Epoxy";
    public static String jello = "Jello";

    public static void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    public static String getGlue(){
        return glue;
    }


    public static void stubborn() {
        moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }

    public static void explain() {
        stubborn();
        System.out.println(glue);
        System.out.println("Static in both languages makes the method or variable globally accessible but in Java it doesn't need to be instanced to be called while in JS you have to call the class itself to run the method.");
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
    }

    public static void main(String[] args){
        moveAndShake();
        stubborn();
        explain();

        System.out.println(getGlue());
        System.out.println(jello);
    }

}
