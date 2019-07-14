public class lesson{
  public static void main(String[] args){
    System.out.println("Hello World");
    System.out.println(5);
    /*
    THE TWO TYPES OF VARIABLES IN JAVA:
    Primitive Types:
      - integer (int)
      - decimals (double)
      - booleans (boolean) -> True/False
      - characters (char)
      - ....

      Object Types:
      -Strings (String)
      */
      //Store an integer in a value.
      //Create a value named var and give it a value of 7.
      int var = 7;
      // One equal sign means assignment. The thing to its left is being assigned the value to its right.
      System.out.println(var);
      //Create a variable named dec and give it a value of 9.3
      double dec = 9.3;
      System.out.println(dec);
      boolean flag = true;
      System.out.println(flag);
      char character = 's';
      System.out.println(character);
      String str = "this is a test";
      System.out.println(str);
      //When calling or creating objects, we always have to captalize the first character.
      double a = 10;
      int b = 3;
      double c = a / b;
      System.out.println(c);
      //+ - / *
      int d = 10;
      int e = 2;
      System.out.println (d%e);
      //% <- modular arith (remainder when I divide the first number by the second)
      String newstr = "this is a new string";
      newstr += " this is an add on!";
      //shorthand way of writing newstr = newstr + "this is an add on!";
      System.out.println(newstr);

      //looping in JAVA
      //two types of loops in JAVA
      // for loop
      // while loop

      for(int i = 0; i <= 10; i++){
        System.out.println(i);
        //first part is the assignment
        //second part is the condition
        //third part is the increment
        //i++ is the same as i += 1 which is the same as i = i+1
        //<= less than equal to
        //>= greater than equal to
      }
  }
}
// This is a comment.
/* <- Start of Multi Line Comment
This is a multiple comment.
It allows me to type on multiple lines.
End of Mulit Line Comment-> */
//Do not forget the semi - colen!
//Always save!
