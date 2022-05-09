package ControlFlowStatements;

public class BreakANDContinue {
	
public static void main(String[] args) {
		
		int i=0;
	
		for (i=0; i<5; i++)
		{
			System.out.println("capgemini");

			break;                        
			
		}
		
		System.out.println("----------------------------------------------------------------------------");

		do
		{
			i++;
			if (i==2)
			{
				System.out.println("capgemini");
			continue;
		}
			System.out.println("india");     
			
		}while(i<5);
				

	}

}
