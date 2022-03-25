package chapter1;

import java.time.LocalDate;
import java.time.Month;
/*
import chapter2.A;
import chapter2.B;
import chapter2.C;
*/


//wildcard
import chapter2.*;
import chapter3.*;


 enum Jour{
	LUNDI, MARDI
}
public class App {

	public static void main(String[] args) {
		
		
	//final int x=10;
	//System.out.println(x);
		//Jour j = Jour.LUNDI;
		//byte x=10;
		/*System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);*/
		/*System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		long a = 9_223_372_036_854L;
		
		float k = 12.5F;*/
		
		//byte x = (byte)131;
		/*int x = 0x12fE;  // nombre dans la base hexadecimal
		int y = 0123;  // nombre dans la base octal
		int z = 0B111;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);*/
	/*	
	LocalDate ld = LocalDate.now();
	System.out.println(ld);
	
	System.out.println(ld.plusYears(2));
	
	LocalDate ld2 = LocalDate.of(1992,Month.AUGUST,8);
	System.out.println(ld2);
	String ch = "formation";
	System.out.println(ch.length());
	int x = 20;*/
		
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant();
		/*
		e1.nom="amine";
		e1.age= 37;
		e2.nom="amine";
		e2.age= 36;
		System.out.println(e1);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
		
		
		//System.out.println(e1.toString());
		/*System.out.println(e2);
		e1=e2;*/
		/*System.out.println(e1.nom);
		System.out.println(e1.age);
		System.out.println(Etudiant.nbr);*/
		//e1.
		//System.out.println(e1.nbr);
		/*************** Les package ***********/
		
		A a = new A();
		B b = new B();
		chapter2.C c = new chapter2.C();
		
		D d = new D();
		E e = new E();
	
	}

}
