package chapter6;

public class LesExceptions {

	public static void info() throws Exception  //Checked
	{
		 //throw new Exception();
	}
	
	public static void affichage() throws RuntimeException //UnChecked
	{
		 throw new RuntimeException();
	}
	public static void main(String[] args) {
		
		try {
		info();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Un probl�me de la m�thode info");
		}
		
		affichage();
		System.out.println("Suite du programme");
	}

}
