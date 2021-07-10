class MyTarget implements Runnable
{
public void run(){
for(int i=1;i<=10;i++)
{
System.out.println("x");
}
}
}
public class Printx
{
public static void main(String args[])
{
MyTarget target = new MyTarget();
Thread t = new Thread(target);
t.start();
System.out.println("y");
}
}
