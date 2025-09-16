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

      // ARITHMETIC expressions with ops
      System.out.println(4 + 3);
      System.out.println(4 - 1);
      System.out.println(6 * 7);
      System.out.println(5 / 3); // TRUNCATED!
      // INteger division results in TRUNCATION, basically throwing away the decimal
      System.out.println(5.0/3); //double
      //COMPOUND expressions follow pemdas
      double result = 2 + (3 * 2 - 6);
      System.out.println(result);
      // REMAINDER % op
      int remain = 23 % 2;
      System.out.println(remain);
      System.out.println(628 % 2); // 0 - even

      // u can set one variable to anothers value
      int zach_age = 16  ;
      int danny_age = zach_age;
      //both variables contain the same value


      int x = 15;
      int y = 21;
      int z = 2;
      x = y; // x now stores y value
      y = y * 2;
      z = 27;
      System.out.println(x);
      System.out.println(y);
      System.out.println(z);

      // type mismatch error
      double num1 = 3;
      double num2 = 3.14;
      num2 = 2 * num1;
      System.out.println(num2);

      int points = 0;
      points = points + 1;
      points = points - 15;
      System.out.println(points);

   }
}
 