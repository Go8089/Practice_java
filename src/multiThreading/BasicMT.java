package multiThreading;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BasicMT extends Thread 
{
	public static BasicMT b;
	 int count = 0;
 @Override
 public void run()
 {
	 char[] arr = {'4','5','6','7'};
	 BufferedWriter wrt = new BufferedWriter(new OutputStreamWriter(System.out));
	 for(int i = 0; i<100; i++)
		 {
		 System.out.println(++count + Thread.currentThread().getName()); 
		    try{
			     wrt.write(arr);
			     wrt.newLine();
			     System.out.println(++count); 
			     wrt.flush();
		       } catch (IOException e)
		       {
			     e.printStackTrace();
		       }
		    System.out.println(count++); 
		 }
	 try { 
		wrt.close();
	} catch (IOException e) {
		e.printStackTrace();
	} 
}
 
 void main()
 {
	 b = new BasicMT();
	 b.start();
	 BasicMT b2 = new BasicMT();
	 b2.start();
	 BasicMT b3 = new BasicMT();
	 b3.start();
 }
}
