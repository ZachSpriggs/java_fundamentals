// Bicycle Calorie Calculator Specification
// Write a program to show calories burned in riding a bicycle, for a given velocity (in mph) as described below.
// The Bicycle Calorie Model
// A rough estimate of the number of Calories burned by a rider on a bicycle is given by this formula:
// calPerMinute = (K_1*V + K_2*V*V*V) / 69.78 / 0.25
// Where:
// V = velocity in m/s    
// V = 0.447 * Vmph;
// where Vmph = velocity in miles per hour
// Note: For a rider & road bicycle weighing a total of 187 pounds, K_1 = 3.509 and K_2 = 0.2581. 
// Use these constants in your implementation of the formula.
// Check: calPerMinute at 10mph is about 2.22
// The Assumptions
// This assumes no wind and flat ground, and is only approximate.
// Requirements
// Behavior Requirements
// Your program (a console program) will
// 1) repeatedly ask the user for a velocity (a double, in mph) (Vmph) and
// 2) print (for an 187 pound rider+bicycle):
// a) calories burned per minute
// b) calories burned per Hour
// c) calories burned per Mile
//      Output Format
//        All this output for the given velocity should be in its own row on the console.
// 3) continue to ask the user for a new velocity until the user enters 0 (zero) or a negative value.
// Architecture/Code Requirements
// The basic calPerMinute calculation must be done in its own method.
// Calculation methods must calculate only--and certainly not print!  (methods do one thing only and do it well!)
// Follow our Coding Conventions Java Coding Conventions_1E.pdfActions
// Guidance
// calPerHour = calPerMinute * 60;
// calPerMile = calPerHour/Vmph;
// You can get input from the user in a console program with the Scanner class in java.util.Scanner



import java.util.Scanner;
public class random {
    public static final double calPerMinute = 2.22; // based on 10mph
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter VMPH");

        String speed = scan.nextLine();

        System.out.println("Velocity is: " + Double.toString(calcSpeed(speed)));
    }

    public static void calcSpeed(double mph){
        double velocity = mph * .447;
    }
    
}