package chapter6;

public class Test {
	
	public static void main(String args[])
	{
		int x = 10, y =0;
		String ch=null;
		try {
		//System.out.println(ch.length());
		System.out.println(x/y);
		}
		
		catch(ArithmeticException e)
		{
			//System.out.println("Un problème de division par zéro");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			//System.out.println("Un problème de division par zéro");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}
		finally {
		System.out.println("Suite du programme");
		}
	}

}
