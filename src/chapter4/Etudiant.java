package chapter4;

public class Etudiant {
	
	public Etudiant() {   //constructeur par d�faut
		this("abc",20);
		System.out.println("constructeur par d�faut");
		
	}
	
	
	public Etudiant(int age) {   //constructeur avec param�tre age
		System.out.println("constructeur avec param�tre age");
	}
	
	public Etudiant(String nom) {   //constructeur avec param�tre nom
		
	}
	
	public Etudiant(String nom, int age) {   //constructeur avec param�tre 2 param�tres
		//this("abc");
		System.out.println("constructeur avec 2 param�tres");
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
