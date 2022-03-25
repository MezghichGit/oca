package chapter3;

import java.util.Arrays;
import java.util.Comparator;

public class LesTableaux {

	public static void main(String[] args) {
		/*
		int [] tab= {10,5,88};
		System.out.println(tab.length);
		int t[] = new int[4];
		t[0]=21;
		t[1]=22;
		t[2]=23;
		t[3]=24;
		System.out.println(t[2]);
		System.out.println(t.length);
		System.out.println("******************");
		for(int e : t)
		{
			System.out.print(e+"\t");
		}*/
		/*
		int tab[] = {5,22,8,4};
		System.out.println("tab avant tri");
		for(int e : tab)
		{
			System.out.print(e+"\t");
		}
		Arrays.sort(tab);
		System.out.println();
		System.out.println("tab après tri");
		for(int e : tab)
		{
			System.out.print(e+"\t");
		}
		System.out.println("************");
		/*
		String names[] = {"cc","aa","ee","bb"};
		Arrays.sort(names);
		
		for(String e : names)
		{
			System.out.print(e+"\t");
		}*/
		
		Student s1 = new Student("bb",18);
		Student s2 = new Student("aa",15);
		Student s3 = new Student("cc",19);
		Student sts[] = {s1,s2,s3};
		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		//System.out.println(students);
		//System.out.println(students[1]);
		//Arrays.sort(students);
		/*
		Comparator <Student> cmpNom = (Student a, Student b)->{
								return b.nom.compareTo(a.nom);
						};
						
		Comparator <Student> cmpMoy = (Student a, Student b)->{
							return (int)(b.moy - a.moy);
					};
		Arrays.sort(students,cmpMoy);
		
		for(Student s : students)
		{
			System.out.println(s.nom+" "+s.moy);
		}*/
		
		int [] num [] = new int[3][];
		System.out.println(num.length);
		num[0] = new int[4];
		num[1] = new int[6];
		num[2] = new int[3];
		
		num[0][0]=10;
		num[0][1]=11;
		num[0][2]=12;
		num[0][3]=13;
		
		num[1][0]=20;
		num[1][1]=21;
		num[1][2]=22;
		num[1][3]=23;
		num[1][4]=24;
		num[1][5]=25;
		System.out.println(num[1].length);
		num[2][0]=30;
		num[2][1]=31;
		num[2][2]=32;
		for(int[]tab : num)
		{
			for(int e : tab)
			{
				System.out.print(e+"\t");
			}
			System.out.println();
		}
	}

}
