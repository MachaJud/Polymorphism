import java.util.Scanner;
public class SAT
{
void area(int l, int w)
{
System.out.println(" Area of a rectangle=: " +(l*w));
}
void area(double b, double h)
{
System.out.println(" Area of a rhombus=: " +(b*h));
}
public static void main(String[] args)
{
SAT calc = new SAT();
Scanner value=new Scanner (System.in);
int l,w;
double b,h;
System.out.println("Enter the length of a rectangle=:");
l=value.nextInt();
System.out.println("Enter the width of a rectangle=:");
w=value.nextInt();
System.out.println("Enter the base of Rhombus=:");
b=value.nextDouble();
System.out.println("Enter the Height of Rhombus=:");
h=value.nextDouble();
calc.area(l, w);
calc.area(b, h);
}
}
