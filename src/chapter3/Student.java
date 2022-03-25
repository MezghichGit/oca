package chapter3;

public class Student{ //implements Comparable{
	
	String nom;
	double moy;
	
	public Student(String nom, double moy)
	{
		this.nom = nom;
		this.moy = moy;
	}
/*
	@Override
	public int compareTo(Object o) {
		Student temp = (Student)o;
		return (int)(this.moy-temp.moy);
	}*/

}
