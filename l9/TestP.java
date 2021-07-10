interface MU
{
void fyc();
void syc();
void tyc();
void byc();
default public void all()
{
System.out.println("MU won't do all xchecking");
log();
}
static public void Check()
{
System.out.println("This is just checking of static");
}
private void log()                         // go in java 12 and compile as this method is available from java 9....
{
System.out.println("THis is log private method");
}
}

class VESIT implements MU
{
 public void fyc()
{
System.out.println("CHECKING........");
}

public void syc()
{
System.out.println("CHECKING........");
}

public void tyc()
{
System.out.println("CHECKING........");
}

public void byc()
{
System.out.println("CHECKING........");
}
}

class TestP
{
public static void main(String args[])
{
MU ref=new VESIT();     //polymorphic reference....
VESIT r=(VESIT)ref;     // this is specialization/down casting so type casting is necessary....
ref.fyc();
ref.syc();
ref.tyc();
ref.byc();
ref.all();
MU.Check();     // static is of interface...
}
}
