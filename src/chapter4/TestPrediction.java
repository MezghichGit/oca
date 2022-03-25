package chapter4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPrediction {

	public static void main(String[] args) {
		Prediction p = (String s)-> {return s.length()>=6;};
		
		Prediction p1 = s->  s.length()>=6;
		
		Prediction p2 = (String s)-> {return s.contains("oc");};
		
		String ch = "ocaocp";
		
		System.out.println(p.test(ch));
		System.out.println(p2.test(ch));
		
		Operation op1 = (double x1, double x2)->{return x1+x2;};
		System.out.println(op1.ops(10, 20));
		//Predicate <String>pr = (String s)->{return s.contains("a");};
		//Predicate <String>pr = s->s.contains("a");
		ArrayList<String> names = new ArrayList<>();
		names.add("aa");
		names.add("ba");
		names.add("cc");
		names.add("ae");
		System.out.println(names);
		names.removeIf(s->s.contains("a"));
		System.out.println(names);

	}

}
