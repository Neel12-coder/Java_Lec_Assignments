class Dog
{
protected String bark()
{
return "woof";
}
}
class Beagle extends Dog
{
public String bark()
{
return "arf";
}
}
class  TestDog{
public static void main(String args[])
{
Dog[] dogs={new Dog(),new Beagle()};
for(Dog d:dogs)
System.out.println(d.bark());
}
}