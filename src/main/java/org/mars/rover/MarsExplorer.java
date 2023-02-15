package org.mars.rover;

import java.util.Arrays;
import java.util.Scanner;

public class MarsExplorer {

    Plateau plateau ;

    public static void main(String[] args) {

        String str;
        int i = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Plateau co-ordinates : ");
        int xPlateau = scanner.nextInt();
        int yPlateau = scanner.nextInt();

        System.out.println("Please enter how many rover  : ");
        int roverCount = scanner.nextInt();
        int[] xRover= new int[roverCount];
        int[] yRover= new int[roverCount];
        char[] dirRover = new char[roverCount];
        String[] movingPattern = new String[roverCount];
        while (i < roverCount) {
            System.out.println("Please enter Rover "+i+" position co-ordinates : ");
            xRover[i] = scanner.nextInt();
            yRover[i] = scanner.nextInt();
            if(xRover[i] > xPlateau || yRover[i] > yPlateau){
                System.out.println("Rover is outside of Plateau. Please enter correct co-ordinates: ");
                xRover[i] = scanner.nextInt();
                yRover[i] = scanner.nextInt();
            }
            dirRover[i] = scanner.next().charAt(0);
            System.out.println("Please enter Rover moving pattern : ");
            movingPattern[i] = scanner.next();

            if(!movingPattern[i].matches("[LRM]*")){
                System.out.println("Please enter correct moving pattern : ");
                movingPattern[i] = scanner.next();
            }
            i++;
        }
        scanner.close();

        Plateau plateau = createPlateau(xPlateau, yPlateau);
        addRoverToPlateau(roverCount, xRover, yRover, dirRover, plateau);
        i = 0;
        while (i < roverCount) {
            Rover rover = plateau.getRovers().get(i);
            moveTheRover(movingPattern[i], rover);
            System.out.println("Rover Final Position : " + rover.getPosition());
            i++;
        }
        //;
    }

    private static void addRoverToPlateau(int roverCount, int[] xRover, int[] yRover, char[] dirRover, Plateau plateau) {
        int i = 0;
        while (i < roverCount) {
            Rover rover = new Rover(xRover[i], yRover[i], dirRover[i] );
            plateau.addRover(rover);
            i++;
        }
    }

    private static void moveTheRover(String movingPattern, Rover rover) {
        char[] moveChar = movingPattern.toCharArray();
        for(char c : moveChar){
            switch (c){
                case 'L' :
                    rover.left();
                    break;
                case 'R':
                    rover.right();
                    break;
                case 'M':
                    rover.move();
                    break;
            }
        }
    }

    private static Plateau createPlateau(int xPlateau, int yPlateau) {
        Plateau plateau = Plateau.getInstance(xPlateau, yPlateau);
        System.out.println("Plateau Created !!! ");
        return plateau;
    }

}
