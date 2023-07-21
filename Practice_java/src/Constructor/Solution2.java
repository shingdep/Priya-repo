package Constructor;



public class Solution2 
{
 int a,b,c,d,e;
 public void M1(int a1,int b1,int c1,int d1,int e1)
 {
	 // assigning the values//
	 a=a1;
	 b=b1;
	 c=c1;
	 d=d1;
	 e=e1;
 }
 public static void main(String[] args) 
 {
	Solution2 obj=new Solution2();
	// only 1 call for one object for assigning the values//
	
	obj.M1(110, 220, 330, 440, 550);  // Only one call for method
	 
	System.out.println(" Value of a"+obj.a);
	System.out.println(" Value of b"+obj.b);
	System.out.println(" Value of c"+obj.c);
	System.out.println(" Value of d"+obj.b);
	System.out.println(" Value of e"+obj.e);
}
}
