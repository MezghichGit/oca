package chapter1;

public class Etudiant extends Object{
	
	public void Etudiant()  // une méthode
	{
		System.out.println("Une méthode");
	}
	
	public  Etudiant()  // Un constructeur par defaut
	{
		System.out.println("Un constructeur par défaut");
	}
	
	{
		System.out.println("Bloc d'initialisation d'instance");
	}
	
	static{
		System.out.println("Bloc d'initialisation de classe");
	}
	
	
	public  Etudiant(String nom)  // Un constructeur avec paramètre
	{
		System.out.println("Un constructeur avec paramètre");
	}
	//attributs d'instance
	String nom;
	int age;
	
	//attribut de classe
	static int nbr;
	
	@Override
	  public String toString() {
        return "Un étudiant";
    }

	@Override
	 public boolean equals(Object obj) {
        Etudiant temp = (Etudiant)obj;
		return this.age == temp.age;
    }
}
