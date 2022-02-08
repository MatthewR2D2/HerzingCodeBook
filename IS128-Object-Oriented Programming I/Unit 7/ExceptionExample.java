class InvalidEmailException  extends Exception  
{  
    public InvalidEmailException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  

public class ExceptionExample {

    // method to check the age  
    static void validate (String email) throws InvalidEmailException{    
        if(!email.contains("@")){  
   
         // throw an object of user defined exception  
         throw new InvalidEmailException("You did not put in a valid email");    
     }  
        else {   
         System.out.println("We will email you stuff now");   
         }   
      }    

    public static void main(String args[])
    {
        try  
        {  
            validate("Gus@gmail.com");  
        }  
        catch (InvalidEmailException ex)  
        {  
            System.out.println("Email Exception Found");  
            System.out.println(ex);  
        } 
        
        try  
        {  
            // calling the method   
            validate("Gus at gmail.com");  
        }  
        catch (InvalidEmailException ex)  
        {  
            System.out.println("Email Exception Found");  
            System.out.println(ex);  
        }
  
    } 
}
