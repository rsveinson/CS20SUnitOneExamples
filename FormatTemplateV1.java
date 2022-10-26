import java.util.Scanner;

/* *******************************
 * name:    Sveinson
 * Class:   CS20S
 * 
 * Assignment:  AxQy
 ************************************/
public class FormatTemplateV1{
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
    
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);
    
    // **** banner ****
    
        banner = "**************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  AxQy" + nl;
        banner += "**************************" + nl;
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
    // **** pocessing ****
    
    // **** output ****
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    }//end main

}// end class
