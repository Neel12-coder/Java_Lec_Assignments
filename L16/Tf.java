public enum TrafficLight
{
RED("stop"),YELLOW("Caution"),GREEN("Go");
private String action;
TrafficLight(String action)
{
this.action= action;
}
public static void main(String args[])
{
TrafficLight green = TrafficLight.GREEN;
System.out.println(GREEN.equals(green));
}
}