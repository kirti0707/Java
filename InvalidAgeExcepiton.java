
import java.util.Scanner;
public class InvalidAgeExcepiton extends Exception
{ 
   public InvalidAgeExcepiton(String str)
{
    super(str); 
}

class Test
{ 
static void status(int age)throws InvalidAgeExcepiton
{ 
if (age>25)
{ System.out.println("eligible for mrg");
}
else
{
	throw new InvalidAgeExcepiton("not eligible try after some time");
}
}

public static void main(String[] args)throws InvalidAgeExcepiton
{ Scanner s = new Scanner(System.in);
System.out.println("enter u r age");
int age = s.nextInt();
Test.status(age);
}
}