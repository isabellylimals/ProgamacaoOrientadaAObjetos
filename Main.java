public class CA {
int val=0;
public void op1(int x)
{
val+=x;
}
public void op2(int x, int y)
{
val-=x+y;
}
int getVal()
{
return val;
}
}
public class CB extends CA {
public void op1(int x)
{
val-=x;
}
public void op2(int x, int y)
{
try
{
val+=x/y;
}
catch (Exception e)
{
val=10;
}
finally
{
val++;
}
}
}
public class Main {
	public static void main(String[] args) {
		CA obj = new CB();
		obj.op1(10);
		obj.op2(5, 8);
		System.out.printf("%d\n", obj.getVal());
	}
}