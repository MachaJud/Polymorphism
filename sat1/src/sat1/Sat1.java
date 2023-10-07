import java.util.Scanner;
public class sat1
{
void registration(String uc1,int cw1_30,int es1_70)
{
System.out.println("****UNIT ONE DETAILS****");
System.out.println("UNIT ONE CODE="+uc1);
System.out.println("Coursework / 30 ="+cw1_30);
System.out.println("Exam / 70 ="+es1_70);
System.out.println("overall score / 100 ="+(cw1_30+es1_70));
}
void registration(int cw2_30,String uc2,int es2_70)
{
System.out.println("****UNIT TWO DETAILS****");
System.out.println("UNIT TWO CODE="+uc2);
System.out.println("Coursework / 30 ="+cw2_30);
System.out.println("Exam / 70 ="+es2_70);
System.out.println("overall score / 100 ="+(cw2_30+es2_70));
}
public static void main(String[] args)
{
sat1 unit = new sat1();
Scanner value=new Scanner (System.in);
String uc1,uc2;
int cw1_30, es1_70 ,cw2_30,es2_70;
System.out.println("Enter Unit1 code=:");
uc1=value.nextLine();
System.out.println("Enter Unit2 code=:");
uc2=value.nextLine();
System.out.println("Enter unit one course work /30=:");
cw1_30=value.nextInt();
System.out.println("Enter unit two course work /30=:");
cw2_30=value.nextInt();
System.out.println("Enter unit one Exam score /70=:");
es1_70=value.nextInt();
System.out.println("Enter unit two Exam score /70=:");
es2_70=value.nextInt();
unit.registration(uc1, cw1_30, es1_70);
unit.registration(cw2_30, uc2, es2_70);
}
}
