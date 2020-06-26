package exercise2;

class Arrays {
    //Take the arrays.js file, and refactor the code into Java in this file.
    final static int[] nums = {10,23,3,4,5,2,1};
    final static String[] greetings = {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
    final static boolean[] binaries = {false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false};

    public static void printNums() {
        for (int num : nums) {
            System.out.println(num);
        }
    };
    public static void printGreetings() {
        for (String greet : greetings) {
            System.out.println(greet);
        }
    };
    public static void printBinaries() {
        for (boolean binary : binaries) {
            System.out.println(binary);
        }
    };
    public static void main(String[] args){
        printNums();
        printGreetings();
        printBinaries();
    }
}







