package inheritanceProgram;

public class MultilevelLast extends MultilevelNext

{
   public void lastMethod()
   {
	 System.out.println("LAST");
   }
   public static void main(String args[])
   {
	   MultilevelLast ml=new MultilevelLast();
	   ml.lastMethod();
	   ml.methodFirst();
	   methodNext();
   }
}

