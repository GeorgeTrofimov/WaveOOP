import java.util.Scanner;

public class GameField extends CatGame {
    protected static String[][] GameField;
    protected int startPointX;
    protected int startPointY;
    protected int exitPointX;
    protected int exitPointY;

    public static void Create_GameField() {
        GameField = new String[10][10];
        for (int i = 0; i < GameField.length; i++) {
            for (int j = 0; j < GameField.length; j++) {
                GameField[i][j] = "+";
            }
        }
        addWall();
    }

    private static void addWall() {
        GameField[1][1] = "#";
        GameField[1][2] = "#";
        GameField[1][3] = "#";
        GameField[1][6] = "#";
        GameField[2][6] = "#";
        GameField[3][6] = "#";
        GameField[4][6] = "#";
        GameField[5][6] = "#";
        GameField[0][8] = "#";
        GameField[1][8] = "#";
        GameField[2][8] = "#";
        GameField[7][7] = "#";
        GameField[7][8] = "#";
        GameField[7][9] = "#";
        GameField[4][1] = "#";
        GameField[5][1] = "#";
        GameField[6][1] = "#";
        GameField[7][1] = "#";
        GameField[8][1] = "#";
        GameField[8][2] = "#";
        GameField[8][3] = "#";
        GameField[8][4] = "#";
    }

    public void StartPoint() {
        System.out.println((char) 27 + "[32mВведите начальную координату. Например: (1;2) " + (char) 27 + "[0m");
        Scanner in = new Scanner(System.in);
        System.out.print("Координата X: ");
        this.startPointX = in.nextInt();
        System.out.print("Координата Y: ");
        this.startPointY = in.nextInt();
        if (GameField[startPointX][startPointY].equals("#")) {
            System.out.println((char) 27 + "[31mДанная координата занята или не существует!" + (char) 27 + "[0m");
            StartPoint();
        } else {
            GameField[startPointX][startPointY] = "0";
        }
    }

    @Override
    public String toString() {
        System.out.println((char) 27 + "[33m№ X 0  1  2  3  4  5  6  7  8  9" + (char) 27 + "[0m");
        System.out.println((char) 27 + "[33mY |-----------------------------" + (char) 27 + "[0m");
        for (int i = 0; i < GameField.length; i++) {
            System.out.printf((char) 27 + "[33m%s |" + (char) 27 + "[0m", i);
            for (int j = 0; j < GameField.length; j++) {
                if (GameField[i][j].equals("#")) {
                    System.out.printf((char) 27 + "[31m # " + (char) 27 + "[0m");
                } else if (GameField[i][j].equals("$")) {
                    System.out.printf((char) 27 + "[32m $ " + (char) 27 + "[0m");
                } else {
                    System.out.printf(" " + GameField[i][j] + " ");
                }
            }
            System.out.println();
        }
        return "";
    }

    public void exitPoint() {
        System.out.println((char) 27 + "[32mВведите конечную координату. Например: (4;7) " + (char) 27 + "[0m");
        Scanner in = new Scanner(System.in);
        System.out.print("Координата X: ");
        exitPointX = in.nextInt();
        System.out.print("Координата Y: ");
        exitPointY = in.nextInt();
        if (GameField[exitPointX][exitPointY].equals("#")) {
            System.out.println((char) 27 + "[31mДанная координата занята или не существует!" + (char) 27 + "[0m");
            exitPoint();
        } else {
            System.out.println((char) 27 + "[32mРешение:" + (char) 27 + "[0m");
        }
    }
}