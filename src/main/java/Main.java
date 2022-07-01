import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Field field = new Field();
        String[] moves = in.nextLine().split(" ");
        field.showField();

        for (int i = 0; i < moves.length; i++){
            switch (moves[i]){
                case "D" :
                    field.moveDown();
                    field.showField();
                    break;
                case "U" :
                    field.moveUp();
                    field.showField();
                    break;
                case "L" :
                    field.moveLeft();
                    field.showField();
                    break;
                case "R" :
                    field.moveRight();
                    field.showField();
                    break;
            }
        }

        int[] numbers = field.countNumber();
        for (int element : numbers){
            System.out.print(element + " ");
        }
    }

}
