/**
 * 
 */
package errrors;
import java.util.Random;
/**
 * @author WINDOWS8.1
 *
 */
public class handle {
	public static void randonnbers()
	{
	int a=0, b=0, c=0;
	Random r = new Random();
	{
	for(int i=0; i<32000; i++) {
	try {
	b = r.nextInt();
	c = r.nextInt();
	a = 12345 / (b/c);
	} catch (ArithmeticException e) {
	System.out.println("Division by	zero.");
	a = 0; // set a to zero and continue
	}
	System.out.println("a: " + a);
	}
	}
	}
	public static void main(String args[])
	{
		
		handle run=new handle();
		run.randonnbers();
	}
}
