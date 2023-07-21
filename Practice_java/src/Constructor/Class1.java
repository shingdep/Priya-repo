// Constructor and types default and parameterized//

package Constructor;

public class Class1 
{
   public Class1()
   {
	   System.out.println(" Default constructor");
   }
   public Class1(int a)
   {
	   System.out.println(" one parameterized constructor");
   }
   public Class1(int a, int b)
   {
	   System.out.println(" Two parameterized constructor");
   }
   public static void main(String[] args) 
   {
	Class1 y=new Class1();
}
}
