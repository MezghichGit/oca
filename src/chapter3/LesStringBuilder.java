package chapter3;

public class LesStringBuilder {

	public static void main(String[] args) {
		//StringBuilder sb = new StringBuilder();
		//StringBuilder sb = new StringBuilder(8);
		/*
		String formation="oca";
		StringBuilder sb = new StringBuilder(formation);
		
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//sb.append("abcabcabcabcabcdtabcabcabcabcabcdtr");
		System.out.println(sb.length());
		System.out.println(sb.capacity());*/
		
		String x = "Hello World";
		String z = " Hello World".trim();
		System.out.println(x==z);
		System.out.println(x.equals(z));
		StringBuilder sb = new StringBuilder("abc");
		if(x == sb.toString())
		{}

	}

}
