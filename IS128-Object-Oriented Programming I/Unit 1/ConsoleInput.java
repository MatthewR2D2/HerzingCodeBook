public class ConsoleInput {
    public static void main(String[] args){
    // Using Console to input data from user
    System.out.println("Enter your Name");
    String myName = System.console().readLine();
    System.out.println("Your Name is: " + myName);
}
    
}
