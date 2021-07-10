import java.util.concurrent.*;
class CallerThread implements Callable<String>
{
String str;
public CallerThread(String s)
{
this.str = s;
}
public String call() throws Exception{
return str.concat(" Call");
}
public static void main(String...args) throws InterruptedException, ExecutionException
{
ExecutorService es = Executors.newFixedThreadPool(4);
Future f1 = es.submit(new CallerThread("call"));
String s= f1.get().toString();
System.out.println(s);
es.shutdown();  // missing tha...
}
}