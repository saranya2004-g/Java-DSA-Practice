package BasicProblems;

public class Palindrome {
    public static void main(String[] args) {
        String str = "MALAYALAM";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);

        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
//public class MoveAll0
//{
//public static void main(String args[]) {
//int a[]= {1,0,2,0,3,4,5};
//int finalarr[]= new int[a.length] ;
//int count=0;
//for(int i=0;i<a.length;i++)
//{
//	if(a[i]!=0) 
//	{
//		finalarr[count]=a[i];
//		count++;
//	}
//	}
//for(int i=0;i<finalarr.length;i++) {
//	  System.out.print(finalarr[i] + " ");
//}
//}
//}