import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

/* ****************************************
 * Name:        Sveinson
 * Class:       CS20S
 * 
 * Assignment:  .format example
 **********************************************/
public class CS20SFormatOutputExample7{
    public static void main(String[] args){
    // **** Constants ****
    
        final String nl = System.lineSeparator();
    
    // **** variables ****
    
        String banner = "";         // output banner
        String prompt = "";         // prompt for input
        
        String strin = "";          // intput
        String strout = "";         // used for formatted output
        
        // declare some variables of differnt types
        int n1 = 10;
        int n2 = 123;
        
        double d1 = 12.23344523423;
        double price = 39.955645;
        
        String st = "Winter";
    
    // **** Objects ****
        // create a Scanner object to read input from the keyboard
        //Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // **** banner ****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  Formatting Output Example" + nl;
        banner += "******************************";
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
    // **** processing ****
    
    // **** output ****
    
    /* demonstrate the use of formatting strings and codes
     *  you can look to the java reference for a complete 
     *  explanation of the available codes
     *  we'll cover the basics and, for the most part, all of
     *  the codes you'll need
     */
    
    System.out.format("%20s %6d you can include text here as well %10.4f%s",st, n1, d1, nl);
    System.out.format("%-20s %25s %6d %10.2f%s",st, "- left aligns text in the field" ,45, d1, nl);
    
    strout = String.format("%20s %6d you can include text here as well %10.4f%s",st, n1, d1, nl);
    System.out.println(strout);
    JOptionPane.showMessageDialog(null, banner + strout);
    
    System.out.format("The cost is: %8s%s", currency.format(price), nl);
    
    // **** closing message ****
    
        System.out.println();
        System.out.println("end of program");
        
    }// end main

}// end class
