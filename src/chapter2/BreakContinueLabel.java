package chapter2;

public class BreakContinueLabel {

	public static void main(String[] args) {
		
		int k =0;
		for(int i=0; i<10; i++)
		{
			continue;
			//k++;
			
		}
		outer:for(int i=0; i<10; i++)
		{
			inner:for(int j=0; j<10;j++)
			{
				if(j==5) continue outer;
				System.out.println("(i,j) = "+"("+i+","+j+")");
			}
			   
		}
		System.out.println("Fin du programme");
	}

}
