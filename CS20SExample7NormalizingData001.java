import java.util.Scanner;
import javax.swing.JOptionPane;

/* *******************************
 * name:    Sveinson
 * Class:   CS20S
 * 
 * Assignment:  Example 7 Elephant weight
 ************************************/
public class CS20SExample7NormalizingData001{
    public static void main(String[] args){
    // **** constants ****
    
        final int GRAMINTONNE = 1000000;    // grams in a tonne
        final int GRAMINKILO = 1000;        // grams in a kilo
        
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
        
        // elephant weight variables
        // weight of elephant 1
        int e1Tonne = 0;
        int e1Kilo = 0;
        int e1Gram = 0;
        int e1TotalGrams = 0;
        
        // weight of elephant 2
        int e2Tonne = 0;
        int e2Kilo = 0;
        int e2Gram = 0;
        int e2TotalGrams = 0;
        
        // total weight of both elephants
        int totalTonne = 0;
        int totalKilo = 0;
        int totalGram = 0;
        int totalTotalGrams = 0;
        
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);
    
    // **** banner ****
    
        banner = "**************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  Example 7" + nl;
        banner += "**************************" + nl;
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
        
        // Elephant 1 prompt
        prompt = "Enter the weight of elephant 1 in tt kk gg";
        System.out.println(prompt);
        
        // read from keyboard
        e1Tonne = scanner.nextInt();
        e1Kilo = scanner.nextInt();
        e1Gram = scanner.nextInt();
        
        // echo
        System.out.println(e1Tonne + ":" + e1Kilo + ":" + e1Gram);
        System.out.println();
        
        // Elephant 2 prompt
        prompt = "Enter the weight of elephant 2 in tt kk gg";
        System.out.println(prompt);
        
        // read from keyboard
        e2Tonne = scanner.nextInt();
        e2Kilo = scanner.nextInt();
        e2Gram = scanner.nextInt();
        
        // echo
        System.out.println(e2Tonne + ":" + e2Kilo + ":" + e2Gram);
        System.out.println();
    
    // **** pocessing ****
    
        // normalize elephant 1
        e1TotalGrams = e1Tonne * GRAMINTONNE;     // convert tonne to gram
        e1TotalGrams += e1Kilo * GRAMINKILO;      // concver kilo to gram and add
        e1TotalGrams += e1Gram;                   // add grams
        //System.out.println(e1TotalGrams);
        
        // normalize elephant 2
        e2TotalGrams = e2Tonne * GRAMINTONNE;     // convert tonne to gram
        e2TotalGrams += e2Kilo * GRAMINKILO;      // concver kilo to gram and add
        e2TotalGrams += e2Gram;                   // add grams
        //System.out.println(e2TotalGrams);
        
        // find combined weight in grams
        totalTotalGrams = e1TotalGrams + e2TotalGrams;
        //System.out.println(totalTotalGrams);
        
        // de-normalize/convert total weight to composite units
        totalTonne = totalTotalGrams / GRAMINTONNE;         //get total tonnes
        totalTotalGrams = totalTotalGrams % GRAMINTONNE;    // get grams remaining
        
        // get kilos and grams
        totalKilo = totalTotalGrams / GRAMINKILO;           // get total kilos
        totalGram = totalTotalGrams % GRAMINKILO;           // get total grams
        
        // test
        System.out.println(totalTonne + ":" + totalKilo + ":" + totalGram);
    
    // **** output ****
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    }//end main

}// end class
