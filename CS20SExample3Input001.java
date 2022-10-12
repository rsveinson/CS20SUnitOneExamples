import java.util.Scanner;

/* *******************************
 * name:    Sveinson
 * Class:   CS20S
 * 
 * Assignment:  Example 3 getting keyboard input
 ************************************/
public class CS20SExample3Input001{
    public static void main(String[] args){
    // **** constants ****
        
        /* a new line character that will work
         * on any computer system. We could use
         * \n but this code doesn't work on all computer
         */
        final String nl = System.lineSeparator();
    
    // **** variables ****
    
        String banner = "";     // output banner
        String prompt = "";     // prompt for input
        
        String strin = "";      // get input
        String strout = "";     // formatted string for output
        
        // example 3 variables
        int n = 0;                  // and int to get from keyboard
        double d = 0.0;             // a double
        String firstName = "";      // person's first name
        String lastName = "";       // person's last name
    
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);
    
    // **** banner ****
    
        banner = "**************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  Example 3" + nl;
        banner += "**************************" + nl;
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
        // prompt for intput
        System.out.println("enter an integer.");
        
        // read and parse keyboard input
        n = scanner.nextInt();
        
        // echo input to terminal window
        System.out.println("You entered " + n + nl);
        
        System.out.println("enter a number with a decimal place.");
        d = scanner.nextDouble();
        System.out.println("You entered " + d + nl);
        
        // get somesone's name
        System.out.println("enter you name.");
        firstName = scanner.next();
        lastName = scanner.next();
        System.out.print(firstName + " ");
        System.out.println(lastName + nl);
    
    // **** pocessing ****
    
    // **** output ****
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    }//end main

}// end class
