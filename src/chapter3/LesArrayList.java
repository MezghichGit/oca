package chapter3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LesArrayList {

	public static void main(String[] args) {
		
		
		List<String> l = new ArrayList<>();
		
		ArrayList<String> l3 = new ArrayList<>();
	
		//List<String> l2 = new LinkedList<>();
		
		
		ArrayList<String> names = new ArrayList<>();
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		names.add("amine");
		names.add("salah");
		names.add("mourad");
		names.add("mourad");
		names.add("alya");
		names.add(1,"ali");
		
		System.out.println(names);
		for(int i=0; i<names.size();i++)
		{
			if(names.get(i).equals("mourad"))
				
			   {names.remove(i);}
		}
		System.out.println(names);
		//System.out.println(names);
		//names.add(true);
		//names.add(18);
		/*
		for(Object o : names)
		{
			String ch = (String)o;
		}*/
		
		//System.out.println(names);
		//names.remove("salah");
		//System.out.println(names.isEmpty());
		//System.out.println(names.size());
		//System.out.println(names);
		//System.out.println(names.toString());
		/*
		ArrayList<Byte> numbers = new ArrayList<>();
		numbers.add((byte)0);
		numbers.add(new Byte((byte)2));
		numbers.add((byte)4);
		numbers.add(new Byte((byte)3));
		System.out.println(numbers);
		
		if(numbers.remove(new Byte((byte)2))) {
			boolean res = numbers.remove(new Byte((byte)20));
			System.out.println("res = " + res);
		}
			
		System.out.println(numbers);
		*/
	}

}
