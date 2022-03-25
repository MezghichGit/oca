package chapter1;

public class Etudiant extends Object{
	
	public void Etudiant()  // une m�thode
	{
		System.out.println("Une m�thode");
	}
	
	public  Etudiant()  // Un constructeur par defaut
	{
		System.out.println("Un constructeur par d�faut");
	}
	
	{
		System.out.println("Bloc d'initialisation d'instance");
	}
	
	static{
		System.out.println("Bloc d'initialisation de classe");
	}
	
	
	public  Etudiant(String nom)  // Un constructeur avec param�tre
	{
		System.out.println("Un constructeur avec param�tre");
	}
	//attributs d'instance
	String nom;
	int age;
	
	//attribut de classe
	static int nbr;
	
	@Override
	  public String toString() {
        return "Un �tudiant";
    }

	@Override
	 public boolean equals(Object obj) {
        Etudiant temp = (Etudiant)obj;
		return this.age == temp.age;
    }
}
