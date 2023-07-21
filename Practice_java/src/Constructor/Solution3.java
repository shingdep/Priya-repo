package Constructor;

public class Solution3 
{
  int a,b,c,d,e;
  public Solution3(int a1,int b1,int c1,int d1,int e1)
  {
	  a=a1;
	  b=b1;
	  c=c1;
	  d=d1;
	  e=e1;
  }
  public static void main(String[] args)
  {
	Solution3 obj1=new Solution3( 111,222,333,444,555); // no call here//
	
	System.out.println(" Value of a"+obj1.a);
	System.out.println(" Value of b"+obj1.b);
	System.out.println(" Value of c"+obj1.c);
	System.out.println(" Value of d"+obj1.b);
	System.out.println(" Value of e"+obj1.e);
	
}
}
