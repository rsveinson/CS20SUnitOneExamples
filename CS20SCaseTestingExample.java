import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.time.LocalDate;

/* ****************************************
 * Name:        Sveinson
 * Class:       CS20S
 * 
 * Assignment:  Testing: given a birth date ie. 12/28 for december 28
 *              and the current date, say 11/ 21 for November 21
 *              determine if a person has had their birthday
 *              
 *              We will need to test this comprehensively using
 *              test cases and test data
 **********************************************/
public class CS20SCaseTestingExample{
    public static void main(String[] args){
    // **** Constants ****
    
        final String nl = System.lineSeparator();
        
        /* LocalDate gets the current date in the form
         * yyyy/mm/dd
         */
        LocalDate currentDate = LocalDate.now();
        //System.out.println(currentDate);
        
        /* these two lines extract the current month as in int
         * the current date ie. 20 if it's the 20th also an int
         */
        int currentMonth = currentDate.getMonth().getValue();
        int currentDay = currentDate.getDayOfMonth();
        System.out.println(currentMonth + "/" + currentDay);
        
    
    // **** variables ****
    
        String banner = "";         // output banner
        String prompt = "";         // prompt for input
        
        String strin = "";          // intput
        String strout = "";         // used for formatted output
        
        boolean old = false;         // true if the person has had their birthday
        
        // person's birth month and day
        int birthDay = 0;
        int birthMonth = 0;
    
    // **** Objects ****
        // create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // **** banner ****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  Testing Example" + nl;
        banner += "******************************";
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
        prompt = "Enter your birthday in the form mm dd";
        System.out.println(prompt);
        birthMonth = scanner.nextInt();
        birthDay = scanner.nextInt();
        
        System.out.println("You were born on " + birthMonth +"/" + birthDay);
        System.out.println("The current date is " + currentMonth + "/" + currentDay);
    
    // **** processing ****
    
        // see if the birthday has passed
        old = currentMonth > birthMonth || (currentMonth == birthMonth && currentDay > birthDay);
    
    // **** output ****
    
        System.out.println(nl + "------------- Resu/t----------------");
        System.out.println("Your birthday has passed this year. " + old);
    
    // **** closing message ****
    
        System.out.println();
        System.out.println("end of program");
        
    }// end main

}// end class
