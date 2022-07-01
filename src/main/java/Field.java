import java.util.Scanner;

public class Field {
    private static final int x = 4;
    private static final int y = 4;
    private int[][] field = new int[x][y];

    public Field(){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < this.field.length; i++){
            for (int j = 0; j < this.field[i].length; j++){
                this.field[i][j] = in.nextInt();
            }
        }
        in.nextLine();
    }

    public void moveDown(){
        for (int i = x - 1; i > 0 ; i--){
            for (int j = 0; j < this.field[i].length; j++){
                if (this.field[i][j] == this.field[i - 1][j]){
                    this.field[i][j] = this.field[i][j] * 2;
                    this.field[i - 1][j] = 0;
                }
            }
        }
        for (int i = x - 2; i > 0; i--){
            for (int j = 0; j < this.field[i].length; j++){
                if (this.field[i][j] == 0){
                    this.field[i][j] = this.field[i - 1][j];
                    this.field[i - 1][j] = 0;
                }
            }
        }
    }

    public void moveUp(){
        for (int i = 0; i < x - 1 ; i++){
            for (int j = 0; j < this.field[i].length; j++){
                if (this.field[i][j] == this.field[i + 1][j]){
                    this.field[i][j] = this.field[i][j] * 2;
                    this.field[i + 1][j] = 0;
                }
            }
        }
        for (int i = 1; i < x - 1; i++){
            for (int j = 0; j < this.field[i].length; j++){
                if (this.field[i][j] == 0){
                    this.field[i][j] = this.field[i + 1][j];
                    this.field[i + 1][j] = 0;
                }
            }
        }
    }

    public void showField(){
        for (int[] element : this.field){
            for (int element2 : element){
                System.out.print(element2 + " ");
            }
            System.out.println();
        }
    }
}
