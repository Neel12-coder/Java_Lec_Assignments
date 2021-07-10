class Snoochy
{
Boochy booch;
public Snoochy()
{
booch = new Boochy(this);
}
}
class Boochy
{
static int count=0;
Snoochy snooch;
public Boochy(Snoochy s)
{
snooch=s;
}
public void finalize()
{
count++;
}
}
class OCJP
{
public static void main(String args[])
{
Snoochy snoog =new Snoochy();
snoog = null;
System.gc();
System.out.println(Boochy.count);
}
}
