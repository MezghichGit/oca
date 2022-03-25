package chapter2;

public class LesStatements {

	public static void main(String[] args) {
		
		int [][] tab = {{10,2},{5,8,9,5},{10,15,3}};
		/*System.out.println(tab.length);
		System.out.println(tab[0].length);
		System.out.println(tab[1].length);
		System.out.println(tab[2].length);*/
		
		// première méthode foreach
		System.out.println("Boucle for enhanced");
		for(int t[] : tab)
		{
			for(int e : t)
				{
				System.out.print(e+"\t");
				}
			System.out.println();
		}
		
		// deuxième méthode : boucle for classique
		System.out.println("Boucle for classique");
		for(int i=0; i<tab.length;i++)
		{
			for(int j=0; j<tab[i].length;j++)
				{
				  System.out.print(tab[i][j]+"\t");
				}
			System.out.println();
		}
		
		/*
		int x = 6;
		final int y = 10;
		switch (x) {

		case 1:
			System.out.println("Janvier");
			break;
		case y:
			System.out.println("Février");
			break;
		case 3:
			System.out.println("Mars");
			break;
		case 4:
			System.out.println("Avril");
			break;
		case 5:
		case 6:
		case 7:
			System.out.println("Ete");
			break;
		default:
			System.out.println("Une autre valeur");
		}*/

	}

}
