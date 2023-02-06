package inheritanceProgram;

public class SingleInheritanceChild extends SingleInheritance
{
	public void childDispaly()
	{
		System.out.println("CHILD CLASS");
	}

	public static void main(String args[])
	{
		SingleInheritanceChild si= new SingleInheritanceChild();
		si.childDispaly();
		si.printMethod();
	}
}