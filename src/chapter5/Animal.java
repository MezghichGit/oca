package chapter5;

public class Animal {

	String nom = "Un Animal";
	public Animal()
	{
		System.out.println("Animal");
	}
	
	public Animal(int age)
	{
		System.out.println("Animal avec age");
	}
	
	protected void affichage()
	{
		System.out.println("Affichage de Animal");
	}
	
	public Animal getAnimal()
	{
		return new Animal();
	}
}
