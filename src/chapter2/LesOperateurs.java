package chapter2;

public class LesOperateurs {

	public static void main(String[] args) {
		
		// Exemple d'opérateur unaire(pre- et post- increment ou decrement)
		/*
		int x = 10;
		//int y = ++x;
		int y = x++;
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		
		//Test ternaire
		/*
		int a = 100, b=20;
		int res = (a<b)?1:-1;
		System.out.println("res = "+res);
		System.out.println((a<b)?true:"abc");
		
		*/
		
		/*
		int x = 10, y = 20;
		
		int z = ++x + --y +2 * ++x -2 * y--;
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("z= "+z);
		*/
		
		// Les opérateurs binaires logiques
		/*int x =10, y=20, z=30;
		boolean res = (x<y)&&(++y<z);
		System.out.println(res);
		System.out.println(y);*/
		/*
		short x = 10;
		short y = 3;
		
		float z = (float) x/y;
		System.out.println(z);*/
		long x = 10;
		int y = 5;
		y *= x;

	}

}
