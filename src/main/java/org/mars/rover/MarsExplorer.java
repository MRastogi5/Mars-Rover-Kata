package org.mars.rover;

import org.mars.plataeu.Plateau;

import java.util.Scanner;

public class MarsExplorer {

    Plateau plateau;
    int xPlateau;
    int yPlateau;
    int roverCount;
    int[] xRover;
    int[] yRover;
    char[] dirRover;
    String[] movingPattern = new String[]{};


    public static void main(String[] args) {

        System.out.println(args.length);
        MarsExplorer explorer = new MarsExplorer();
        int i = 0;

        getInputFromConsole(explorer);

        //Create Plateau Grid
        Plateau plateau = createPlateauAndAddRover(explorer);

        while (i < explorer.roverCount) {
            Rover rover = plateau.getRovers().get(i);
            explorer.moveTheRover(explorer.movingPattern[i], rover, plateau.getX_axis(), plateau.getY_axis());
            System.out.println("Rover Final Position : " + rover.getPosition());
            i++;
        }
    }

    private static Plateau createPlateauAndAddRover(MarsExplorer explorer) {
        Plateau plateau = explorer.createPlateau(explorer.xPlateau, explorer.yPlateau);
        // Plateau can have
        explorer.addRoverToPlateau(explorer.roverCount, explorer.xRover, explorer.yRover, explorer.dirRover, plateau);
        return plateau;
    }

    private static int getInputFromConsole(MarsExplorer explorer) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Plateau co-ordinates : ");
        explorer.xPlateau = scanner.nextInt();
        explorer.yPlateau = scanner.nextInt();

        System.out.println("Please enter how many rover  : ");
        explorer.roverCount = scanner.nextInt();
        explorer.xRover = new int[explorer.roverCount];
        explorer.yRover = new int[explorer.roverCount];
        explorer.dirRover = new char[explorer.roverCount];
        explorer.movingPattern = new String[explorer.roverCount];
        while (i < explorer.roverCount) {
            System.out.println("Please enter Rover " + i + " position co-ordinates : ");
            explorer.xRover[i] = scanner.nextInt();
            explorer.yRover[i] = scanner.nextInt();
            if (explorer.xRover[i] > explorer.xPlateau || explorer.yRover[i] > explorer.yPlateau) {
                System.out.println("Rover is outside of Plateau. Please enter correct co-ordinates: ");
                explorer.xRover[i] = scanner.nextInt();
                explorer.yRover[i] = scanner.nextInt();
            }
            explorer.dirRover[i] = scanner.next().charAt(0);
            System.out.println("Please enter Rover moving pattern : ");
            explorer.movingPattern[i] = scanner.next();

            if (!explorer.movingPattern[i].matches("[LRM]*")) {
                System.out.println("Please enter correct moving pattern : ");
                explorer.movingPattern[i] = scanner.next();
            }
            i++;
        }
        scanner.close();
        return explorer.roverCount;
    }

    public void addRoverToPlateau(int roverCount, int[] xRover, int[] yRover, char[] dirRover, Plateau plateau) {
        int i = 0;
        while (i < roverCount) {
            plateau.addRover(createRover(xRover[i], yRover[i], dirRover[i]));
            i++;
        }
    }

    Rover createRover(int xRover, int yRover, char dirRover) {
        return new Rover(xRover, yRover, dirRover);
    }

    public void moveTheRover(String movingPattern, Rover rover, int x, int y) {
        char[] moveChar = movingPattern.toCharArray();
        for (char c : moveChar) {
            switch (c) {
                case 'L':
                    rover.left();
                    break;
                case 'R':
                    rover.right();
                    break;
                case 'M':
                    rover.move(x, y);
                    break;
            }
        }
    }

    public Plateau createPlateau(int xPlateau, int yPlateau) {
        Plateau plateau = Plateau.getInstance(xPlateau, yPlateau);
        System.out.println("Plateau Created !!! ");
        return plateau;
    }

}
