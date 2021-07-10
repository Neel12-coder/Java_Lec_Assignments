import java.util.*;
class A implements Runnable
{
public void run()
{
System.out.println("A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("B");
}
}
class Test
{
public static void main(String args[])
{
A r1 = new A();
Thread t1 = new Thread(r1);
t1.start();

B r2 = new B();
Thread t2 = new Thread(r2);
t2.start();
 
Runnable r = new Runnable()
{
public void run()
{System.out.println("Implementation of anonymous ");
}};
Thread t3 = new Thread(r);
t3.start();

Runnable y = () -> { 
for(int i=0;i<5;i++)
 System.out.println(i);
 };
Thread t4 = new Thread(y);
t4.start( );
}
}