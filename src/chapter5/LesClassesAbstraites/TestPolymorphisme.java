package chapter5.LesClassesAbstraites;


public class TestPolymorphisme {
	
	public static void info(Animal a)  // méthode polymorphe
	{
		a.seDeplacer();
	}
	
	public static void main(String[] args) {
		
		info(new Oiseau());
		info(new Poisson());
		//Animal a = new Animal();
		Animal animals[] = new Animal[4];  // animals : Structure polymorph
		animals[0]=new Poisson();
		animals[1]=new Oiseau();
		animals[2]=new Chat();
		animals[3]=new Serpent();
		
		for(Animal a : animals)
		{
			a.seDeplacer();
		}

	}

}
