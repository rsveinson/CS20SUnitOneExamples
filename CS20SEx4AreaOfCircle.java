import java.util.Scanner;

/* *******************************
 * name:    Sveinson
 * Class:   CS20S
 * 
 * Assignment:  example 4 calculate the area of a circle
 ************************************/
public class CS20SEx4AreaOfCircle{
    public static void main(String[] args){
    // **** constants ****
    
        final double PI = 3.14159;      // value of Pi
        
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
        
        double radius = 0.0;    // radius of the circle
        double area = 0.0;      // area of the circle
    
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);
    
    // **** banner ****
    
        banner = "**************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  Ex 4 Area of Circle" + nl;
        banner += "**************************" + nl;
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
        prompt = "Enter the radius of the circle.";
        System.out.println(prompt);
        radius = scanner.nextDouble();
        
        // echo input to verify
        System.out.println("you entered " + radius);
    
    // **** pocessing ****
    
        area = radius * radius * PI;       // calculate the area
    
    // **** output ****
    
        System.out.println(nl + "---------------------");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println(nl);
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    }//end main

}// end class
