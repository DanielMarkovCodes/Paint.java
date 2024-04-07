//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************

import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {
        final int COVERAGE = 350; // paint covers 350 sq ft/gal
        final int DOOR_AREA = 20;
        final int WINDOW_AREA = 15;

        // declare integers length, width, and height;
        int length, width, height;
        // declare double totalSqFt;
        double totalSqFt;
        // declare double paintNeeded;
        double paintNeeded;

        // declare and initialize Scanner object
        Scanner scan = new Scanner(System.in);
        // Prompt for and read in the length of the room
        System.out.println("Enter the length of the room: ");
        length = scan.nextInt();
        // Prompt for and read in the width of the room
        System.out.println("Enter the width of the room: ");
        width = scan.nextInt();
        // Prompt for and read in the height of the room
        System.out.println("Enter the height of the room: ");
        height = scan.nextInt();

        System.out.println("How many doors are in the room? ");
        int numDoors = scan.nextInt();
        System.out.println("How many windows are in the room? ");
        int numWindows = scan.nextInt();

        // Compute the total square feet to be painted--think
        // about the dimensions of each wall
        totalSqFt = 2 * height * length + 2 * height * width;
        totalSqFt -= (DOOR_AREA * numDoors + WINDOW_AREA * numWindows);

        // Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;
        // Print the length, width, and height of the room and the
        // number of gallons of paint needed.
        System.out.println("Room dimensions:");
        System.out.println("Length: " + length + " feet");
        System.out.println("Width: " + width + " feet");
        System.out.println("Height: " + height + " feet");
        System.out.println("Number of doors: " + numDoors);
        System.out.println("Number of windows: " + numWindows);
        System.out.println("Total square feet to be painted: " + totalSqFt);
        System.out.println("Gallons of paint needed: " + paintNeeded);
    }
}


