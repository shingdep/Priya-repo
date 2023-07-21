package Constructor;

public class Solution1 
{
  int a,b,c,d,e; // global variables//
  
  public static void main(String[] args) 
  {
	Solution1 obj=new Solution1();
	
	/* 5 calls for assigning the values*/
	
	obj.a=11; //call2
	obj.b=22; //call2
	obj.c=33; //call3
	obj.d=44; //call4
	obj.e=55; //call5
	
	// 5 for printing the values//
	// 10 calss for 1 object//
	
	System.out.println(" Value of a"+obj.a);
	System.out.println(" Value of b"+obj.b);
	System.out.println(" Value of c"+obj.c);
	System.out.println(" Value of d"+obj.b);
	System.out.println(" Value of e"+obj.e);
}
  
}
