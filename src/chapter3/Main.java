package chapter3;

public class Main {

	public static void main(String[] args) {
		/*
		String formation="OCA";
		
		//System.out.println(formation.concat("-OCP"));
		
		//formation=formation.concat("-OCP");
		formation.concat("-OCP");
		System.out.println(formation);
		
		StringBuilder sb = new StringBuilder("OCA");
		sb.append("-OCP");
		System.out.println(sb);*/
		
		String ch1 = "OCA";
		String ch2 = new String("OCA");
		String ch3 = "OCA";
		
		System.out.println(ch1 == ch2);
		System.out.println(ch1 == ch3);
		
		System.out.println(ch1.equals(ch2));
		System.out.println(ch1.equals(ch3));
		
		StringBuilder sb1 = new StringBuilder("OCA");
		StringBuilder sb2 = new StringBuilder("OCA");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant();
		
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));

		System.out.println("a" + "b" + 3+5); 
	}

}
