import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
    
    
     Scanner sc= new Scanner(System.in);
    while(true){
        System.out.println("Enter airthmatic express \n Example  56+3,56-3,56*3,56/3,56%3");
    
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


        if(exp.contains("*")){
            String num[]=exp.split("[*]");

            float num1 = Float.parseFloat(num[0]);
            float  num2= Float.parseFloat(num[1]);
            return String.valueOf(num1*num2);
        }


 
        if(exp.contains("+")){
            String num[]=exp.split("[+]");

            float  num1 = Float.parseFloat(num[0]);
            float  num2= Float.parseFloat(num[1]);
            return String.valueOf(num1+num2);

        }


 
        if(exp.contains("-")){
            String num[]=exp.split("[-]");

            float num1 = Float.parseFloat(num[0]);
            float  num2= Float.parseFloat(num[1]);
      return String.valueOf(num1-num2);

        }

 
        if(exp.contains("/")){
                String num[]=exp.split("[/]");
            

            float num1 = Float.parseFloat(num[0]);
            float  num2= Float.parseFloat(num[1]);

          return String.valueOf(num1/num2);

        }


 
        if(exp.contains("%")){
           String num[]=exp.split("[%]");

            float num1 = Float.parseFloat(num[0]);
            float  num2= Float.parseFloat(num[1]);

         return  String.valueOf(num1%num2);
        }
  
 
 
     return "Invalid expression !";   


// End of function 
    }   

    // End of class
    
}
