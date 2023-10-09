import java.util.*;
public class JavaExample
{
  //create an array to mark all prime numbers
  //up to that range.
  static boolean arr[] = new boolean[10000];
  static void markPrime()
  {
    //At the end of the execution of this method, this array
    //will contain true for prime numbers and false for non-prime numbers.
    //for example: arr[7] will contain true as 7 is prime and arr[10] will be
    //false as 10 is not a prime number
    Arrays.fill(arr, true);
    //iterating array and marking non-prime false
    for(int i = 2; i*i < 10000; i++)
    {
      if(arr[i])
      {
        for(int j = i*2; j < 10000; j = j+i)
          arr[j] = false;
      }
    }
  }
  //Checks if the number num is Sphenic or not
  static int checkSphenic(int num)
  {
    int[] divisors = new int[8];
    int count = 0;
    int j = 0;
    for(int i = 1; i <= num; i++)
    {
      if(num%i == 0 && count < 8)
      {
        count++;
        divisors[j++] = i;
      }
    }
    if(count == 8 && (arr[divisors[0]] && arr[divisors[1]] && arr[divisors[2]]))
      return 1;
    return 0;
  }
  public static void main(String args[])
  {
    markPrime(); //find all prime numbers
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number to check: ");
    int num = scan.nextInt();
    int isSphenic = checkSphenic(num);
    if(isSphenic == 1)
      System.out.print("Entered number is Sphenic.");
    else
      System.out.print("Entered number is not Sphenic.");
  }
}
