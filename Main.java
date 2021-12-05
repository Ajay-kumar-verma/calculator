import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
    
    
     Scanner sc= new Scanner(System.in);
    while(true){
        System.out.println("Enter airthmatic express  ");
    
    String exp=sc.nextLine();
    try {
        System.out.println(calc.solve(exp));
    
    } catch(Exception e) {
    System.out.println(e+"\n expression should be in order to \n operant operator operant ");
        
    }    
     
    }
    
  

		
	}
}



class calc{
    public static String solve(String exp){
         
        // SUM 
        if(exp.contains("+")){
            String num[]=exp.split("[+]");

          for(int i=0;i<num.length;i++)
          { float flt;
             try{
               flt= Float.parseFloat(num[i]);
               }
              catch(Exception e)
               { 
                 flt=Float.parseFloat(solve(num[i]));
               }   

             num[i]=String.valueOf(flt);  
          }
         
          float result=0;
          for (String str : num)
           { 
               result+=Float.parseFloat(str);
           }
        
          return String.valueOf(result);

  
        }



// SUB
        if(exp.contains("-")){
            String num[]=exp.split("[-]");

          for(int i=0;i<num.length;i++)
          { float flt;
             try{
               flt= Float.parseFloat(num[i]);
               }
              catch(Exception e)
               { 
                 flt=Float.parseFloat(solve(num[i]));
               }   

             num[i]=String.valueOf(flt);  
          }
         
          float result=2*Float.parseFloat(num[0]);
          for (String str : num)
           { 
               result-=Float.parseFloat(str);
           }
        
          return String.valueOf(result);

  
        }

 

        // MUL
        if(exp.contains("*")){
            String num[]=exp.split("[*]");

          for(int i=0;i<num.length;i++)
          { float flt;
             try{
               flt= Float.parseFloat(num[i]);
               }
              catch(Exception e)
               { 
                 flt=Float.parseFloat(solve(num[i]));
               }   

             num[i]=String.valueOf(flt);  
          }
         
          float result=1;
          for (String str : num)
           { 
               result*=Float.parseFloat(str);
           }
        
          return String.valueOf(result);

  
        }



//DIV

        if(exp.contains("/")){
            String num[]=exp.split("[/]");

          for(int i=0;i<num.length;i++)
          { float flt;
             try{
               flt= Float.parseFloat(num[i]);
               }
              catch(Exception e)
               { 
                 flt=Float.parseFloat(solve(num[i]));
               }   

             num[i]=String.valueOf(flt);  
          }
         
          float result=Float.parseFloat(num[0])*Float.parseFloat(num[0]);
          for (String str : num)
           { 
               result/=Float.parseFloat(str);
           }
        
          return String.valueOf(result);

  
        }

 
     return "Invalid expression !";   


// End of function 
    }   

    // End of class
    
}
