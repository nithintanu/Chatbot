import java.util.ArrayList;

class Prime
{
   public static void main (String[] args)
   {		
       int i =0;
       long num =0;
       //Empty String
      ArrayList<Integer> al =new ArrayList<>();

       for (i = 1; i <= 10000; i++)         
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
    //    for(i=0;i<al.size();i++){
    //     System.out.println(al.get(0));


    
    //     }
    }
    
   }
