class Person
{
private int id;
private String name;
private String add;

public void Set(int id,String name,String add)
{
this.id=id;
this.name=name;
}
public String Get()
{
return ("Name= "+name+" Id= "+id+" Address= "+ add);
}
}
class Teacher extends Person
{
private int salary;
public void Set(int id,String name,String add,int salary)
{
super.Set(id,name,add);
this.salary=salary;
}

public String Get()
{
String a=super.Get();
return (a+" Salary="+salary);
}
}
class Test
{
public static void main(String args[])
{
Teacher t=new Teacher();
t.Set(6,"neelam","abc",100000);
Person p=new Person();
p.Set(3,"neel","Abv");
String h=p.Get();
String ans=t.Get();
System.out.println(ans);
}
}

