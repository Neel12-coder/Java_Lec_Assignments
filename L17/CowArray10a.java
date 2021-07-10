import java.util.*;
import java.util.concurrent.*;
public class CowArray10a extends Thread{
static List<Integer> myList = new CopyOnWriteArrayList<Integer>();
public static void main(String args[])
{
myList.add(11);
myList.add(22);
myList.add(33);
myList.add(44);
new CowArray10a().start();
for(Integer i: myList){
System.out.print(" "+i);
}
}
public void run()
{
myList.add(77);
}
}