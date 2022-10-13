class outer
{
class inner
{
public void show()
{
System.out.println("In a nested class method");
}
}
}
class wrapper
{
public static void main(String args[])
{
outer.inner in=new outer().new inner();
in.show();
}
}