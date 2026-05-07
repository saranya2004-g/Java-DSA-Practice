package Arrays;

public class MoveAll0s {
	
	public static void main(String args[]) {
		int a[]= {1,0,2,0,3,4,5};
		
		int finalarr[]= new int[a.length] ;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0) 
			{
				finalarr[count]=a[i];
				count++;
			}
		}
		for(int i=0;i<finalarr.length;i++) {
			System.out.print(finalarr[i] + " ");
		}
	}
}			
		
				
		
				
	
			
	
		

		
	  
			

		

	

