import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Field field = new Field();
        System.out.println();
        field.showField();

        field.moveUp();

        System.out.println();
        field.showField();
    }

    public static String getMoves(){
        String moves = in.nextLine();
        return Arrays.toString(moves.split(" "));
    }
}
