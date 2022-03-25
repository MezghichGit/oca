package chapter5;

public class Oiseau extends Animal{

	String nom = "Un Oiseau";
	public Oiseau()
	{
		//super(10);
		super();
		System.out.println("Oiseau");
	}
	
	public void info()
	{
		System.out.println("Mon nom = "+this.nom+" Nom hérité = "+super.nom);
	}
	/*
	@Override
	protected void affichage()
	{
		System.out.println("Affichage de Oiseau");
	}*/
	
	@Override
	public Oiseau getAnimal()
	{
		return new Oiseau();
	}
}
