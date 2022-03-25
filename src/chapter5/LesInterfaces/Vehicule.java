package chapter5.LesInterfaces;

public abstract interface Vehicule {
	
	//avant version 8
	
	 abstract void demarrer();
	 
	 public static final int VitesseMax=400;
	 
	default public void info() {
		 System.out.println("Une méthode concerete");
	 }
	static public void affichage() {
		 System.out.println("Une méthode concerete");
	 }


}
