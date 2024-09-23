package handsalary;

public class Totalsal extends Hrpf {
int t;
public void total()
{
 t=a-b+c+h-p;
 System.out.println("total salary by hand:"+t);
 
}
public static void main(String args[])
{
	Totalsal obj=new Totalsal();
	obj.basic();
	obj.hra();
	obj.total();
}
}
