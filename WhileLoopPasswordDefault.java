public class WhileLoopPasswordDefault {

    public static final String originalPassword  = "Happy1";
     
    public static void main(String[] args) {
        // Declare variables
        String defaultPassword = "";
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Please enter the default password: ");
        defaultPassword = sc.nextLine();
        
        while(!defaultPassword.equals(originalPassword)){
            System.out.print("\nWrong password! \n" + 
                             "Please enter the default password: ");
             
            defaultPassword = sc.nextLine();
             
        }
        System.out.println("\nCorrect password! \n" +   
                           "-----------------");
       
    }
    
}
