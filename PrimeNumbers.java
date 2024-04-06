import java.util.ArrayList;

class PrimeNumbers
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       //Empty String
      ArrayList<Integer> al =new ArrayList<>();

       for (i = 1; i <= 10000000; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)

	  {
         al.add(i);
	     
	  }	
       }
       System.out.println(al);
       
   }
}