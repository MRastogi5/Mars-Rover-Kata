package org.mars.rover;

import java.util.Arrays;
import java.util.Scanner;

public class MarsExplorer {

    public static void main(String[] args) {

        String str;
        int xRover=0, yRover=0;
        char dirRover = 0;
        String moves = "";
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Plateau co-ordinates : ");
        int xPlateau = scanner.nextInt();
        int yPlateau = scanner.nextInt();

        System.out.println("Please enter how many rover  : ");
        int roverCount = scanner.nextInt();
        while (i < roverCount) {
            System.out.println("Please enter Rover "+i+" position co-ordinates : ");
            xRover = scanner.nextInt();
            yRover = scanner.nextInt();
            if(xRover > xPlateau || yRover > yPlateau){
                System.out.println("Rover is outside of Plateau. Please enter correct co-ordinates: ");
                xRover = scanner.nextInt();
                yRover = scanner.nextInt();
            }
            dirRover = scanner.next().charAt(0);
            System.out.println("Please enter Rover moving pattern : ");
            moves = scanner.nextLine();
            i++;
        }
        scanner.close();

    }

}
