import java.util.Scanner;

/* *******************************
 * name:    Sveinson
 * Class:   CS20S
 * 
 * Assignment:  Example 5 Pythagoras
 ************************************/
public class CS20SExample5Pythagoars{
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
        
        // specific variables
        
        int sideA = 0;      // sides of the triangle
        int sideB = 0;
        
        double hypotenuse = 0.0;    // the hypotenuse
    
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);
    
    // **** banner ****
    
        banner = "**************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  Example 5 Pythagoras" + nl;
        banner += "**************************" + nl;
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
        prompt = "Enter side a and side b of the triangle.";
        System.out.println(prompt);
        
        // read in sides
        sideA = scanner.nextInt();
        sideB = scanner.nextInt();
        
        // echo
        System.out.println("the sides are: " + sideA + " and " + sideB + nl);
    
    // **** pocessing ****
        
        // step one add the sides
        //hypotenuse = sideA + sideB;
        
        // step two add the squares of the sides
        //hypotenuse = (sideA * sideA) + (sideB * sideB);
        
        // step three get the square root of the sum of squares of the sides
        hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
        
        //System.out.println(hypotenuse);
    
    // **** output ****
    
        System.out.println(nl + "*****************************");
        System.out.println("Results:" + nl);
        System.out.println("Triangle ABC");
        System.out.println("with sides: " + sideA + " and " + sideB);
        System.out.println("Has Hypotenuse: " + hypotenuse + nl);
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    }//end main

}// end class
