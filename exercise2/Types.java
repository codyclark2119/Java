package exercise2;

class Types {
//    This class has syntax errors, that will prevent your other classes from running.  So... work on this file first to resolve the issues.
      static int number = 22;
      static int[] myArray = {3,4,5,6,76,12,2};
      static String movieA = "Harry and the Hendersons";
      static String movieB = "Star Wars";
      static char male = 'm';
      static char female = 'f';
//
//    //the above instance variables have mistakes with their data types.  Fix the data types so the main method correctly displays the value of all of the variables
//
    public static void main(String[] args) {
        System.out.println("Number: " + number );
        for (int num : myArray) {
            System.out.println(num);
        }
        System.out.println("movieA: " + movieA + "\nmovieB: " + movieB + "\nmale: " + male + "\nfemale: " + female);
    }
}