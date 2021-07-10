import java.util.*;
public class Ass8
{
public static void main(String args[])
{
String[] colors={"violet" ,"yellow" ,"orangle","blue"};
Arrays.sort(colors);
System.out.println(Arrays.binarySearch(colors,"black"));
System.out.println(Arrays.binarySearch(colors,"white"));
}
}
