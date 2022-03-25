package chapter4;
@FunctionalInterface
public  interface Operation {

	public  double ops(double a, double b);
	
	//public double ops2(double a, double b);
	
	public default void info() {}
}
