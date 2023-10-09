import java.util.*;
public class JavaExample
{
  public static void main(String args[])
  {
    int sumSquareDigits=0, num;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    //Reading user input and storing into variable num
    num = scanner.nextInt();
    scanner.close();
    int square = num * num;
    //Finding the sum of digits of square
    while(square != 0)
    {
      //getting last digit of square
      int lastDigit = square % 10;
      //adding the last digit to the sumSquareDigits
      sumSquareDigits = sumSquareDigits + lastDigit;
     //removing last digit from square to repeat the process
      //for second last digit and so on
      square = square / 10;
    }
    //comparing the number with sum of digits of square
    if(num == sumSquareDigits)
      System.out.println(num + " is a Neon Number.");
    else
      System.out.println(num + " is not a Neon Number.");
  }
}  
