// Every JAVA file is a CLASS

public class Main {


// main method is the entry way to the program
   public static void main(String []args) {
      System.out.println("Welcome to Java");
      System.out.println("hiiii");

      // 1. DECLARE a new VARIABLE
      int score; 
      // 2 .ASSIGN a value to the variable
      score = 72;
      // 1+2. Intialize combines declaring and assigning
      String pokemon = "Matthew";
      double healthPercent = 0.67;
      boolean isAlive = true;

      // Use te plus sign to concatenate(combine) Strings
      String greeting = "Hello " + "World";
      System.out.println(greeting);
      // Quotes contain string literals

      // OutPut: difference between .print and .println
      System.out.print("hi");
      System.out.println("there");
      System.out.print("!");
      // .println displays the message THEN goes to next line
      //ESCAPE: use \ backslash - to include special characters, use \n for line break
      String message = "\n I woke up and said, \"HELLO WORLD\" ";
      System.out.println(message);
   }
}
 