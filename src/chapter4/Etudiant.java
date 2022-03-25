package chapter4;

public class Etudiant {
	
	public Etudiant() {   //constructeur par défaut
		this("abc",20);
		System.out.println("constructeur par défaut");
		
	}
	
	
	public Etudiant(int age) {   //constructeur avec paramètre age
		System.out.println("constructeur avec paramètre age");
	}
	
	public Etudiant(String nom) {   //constructeur avec paramètre nom
		
	}
	
	public Etudiant(String nom, int age) {   //constructeur avec paramètre 2 paramètres
		//this("abc");
		System.out.println("constructeur avec 2 paramètres");
	}
	
	
	private int age;
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age>0 && age<100)
		    this.age = age;
		else
			System.out.println("Age invalide");
	}


	String nom;  //package private
	
	protected double moy;
	public String prenom;
	public void info()
	{
		System.out.println(this.age);
		System.out.println(this.nom);
		System.out.println(this.moy);
		System.out.println(this.prenom);
	}

}
