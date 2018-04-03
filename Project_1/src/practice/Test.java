package practice;

public class Test extends Thread
{
   public void run()
   {
	   
	  System.out.println("Hi");
//	  System.out.println("Hello");
//      for(;;);
   }

   public static void main(String args[]) throws InterruptedException
   {
      System.out.println("Starting main");
      Test t1 = new Test();
//      Test t2 = new Test();
      t1.start();
//      t1.join();
//      t2.start();
      System.out.println("Main returns");
      System.out.println("Main returns");
      System.out.println("Main returns");
      System.out.println("Main returns");
      System.out.println("Main returns");
      System.out.println("Main returns");
      System.out.println("Main returns");
      System.out.println("Main returns");
      System.out.println("Main returns");
      System.out.println("Main returns");
      System.out.println("Main returns");
      for(int i =0; i<3; i++){
    	  System.out.println("returns");
      }
   }

}
