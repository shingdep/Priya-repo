//second use of this keyword//
package Constructor;

public class This2 
{
 public void m1()
 {
	 System.out.println(" m1");
 }
 public void m2()
 {
	 System.out.println(" m2");
 }
 public void m3()
 {
	 this.m1();
	 System.out.println(" m3");
	 this.m2();
 }
 public static void main(String[] args) 
 {
	This2 r=new This2();
	r.m3(); // control will go to m3//
}
}
