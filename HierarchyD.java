package inheritanceProgram;

public class HierarchyD extends HierarchyA
{

	 public void methFour()
	 {
		 System.out.println(" CLASS D");
	 }
	 public static void main(String args[])
	 {
		 HierarchyD hd=new HierarchyD();
		 HeirarchyB hb=new HeirarchyB();
		 hb.methOne();
		 hd.methFour();
		 hb.methTwo();
		 
	 }
}
