package Constructor;

public class This 
{
	public This()
	   {
		   System.out.println(" Default constructor");
	   }
	   public This(int a)
	   {
		   System.out.println(" one parameterized constructor");
	   }
	   public This(int a, int b)
	   {
		   this(44);
		   System.out.println(" Two parameterized constructor");
	   }
	   public static void main(String[] args) 
	   {
		This y=new This(11,22); // control will go 2 parameterized//
	   }
	}
	
