import java.util.Scanner;
import javax.swing.JOptionPane;

/* *******************************
 * name:    Sveinson
 * Class:   CS20S
 * 
 * Assignment:  Using JOptionPane of I/O
 ************************************/
public class CS20SExample6JOptionPane{
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
        
        int n = 0;              // int read from keyboard
        double x = 0.0;         // double read from keyboard
        char ch = 'a';          // char read from keyboard
    
    // **** objects ****
    
        //Scanner scanner = new Scanner(System.in);
    
    // **** banner ****
    
        banner = "**************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  EX 6 JOptionPane" + nl;
        banner += "**************************" + nl;
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
        prompt = "enter an String.";
        strin = JOptionPane.showInputDialog(prompt);
        
        strout = "Here's the String " + strin;
        JOptionPane.showMessageDialog(null, strout);
        
        // getting numbers
        //int
        prompt = "enter an int";
        n = Integer.parseInt(JOptionPane.showInputDialog(prompt));
        
        strout = "Here's the int " + n;
        JOptionPane.showMessageDialog(null, strout);
        
        // now a double
        prompt = "enter an double";
        x = Double.parseDouble(JOptionPane.showInputDialog(prompt));
        
        strout = "Here's the double " + x;
        JOptionPane.showMessageDialog(null, strout);
        
        // what if we want the first letter of an input string?
        prompt = "enter an String.";
        strin = JOptionPane.showInputDialog(prompt);
        ch = strin.charAt(5);       // get the first letter
        
        strout = "Here's the first letter in the string " + ch;
        JOptionPane.showMessageDialog(null, strout);
        
    // **** pocessing ****
    
    // **** output ****
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    }//end main

}// end class
