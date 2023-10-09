import java.util.Scanner;
public class JavaExample {
  // Returns true if the num is a Duck number else it
  //returns false
  public static boolean checkDuckNumber(int num) {
    //check every digit of num starting from the last
    //digit, at every step remove the last digit after checking
    while(num != 0) {
      if(num%10 == 0)
        return true;
      num = num / 10;
    }
    //if the whole number is processed but the method
    //didn't return true then it is not a Duck number
    return false;
  }
  public static void main(String args[])
  {
    int n;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    n = scan.nextInt();

    if (checkDuckNumber(n))
      System.out.println(n+" is a Duck number.");
    else
      System.out.println(n+" is not a Duck number.");
  }
}
