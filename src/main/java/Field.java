import java.util.Scanner;

public class Field {
    public static final int x = 4;
    public static final int y = 4;
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

        boolean repeat;
        do {
            repeat = false;
            for (int i = x - 1; i > 0; i--) {
                for (int j = 0; j < this.field[i].length; j++) {
                    if (this.field[i][j] == 0) {
                        if (this.field[i - 1][j] != 0){
                            repeat = true;
                        }
                        this.field[i][j] = this.field[i - 1][j];
                        this.field[i - 1][j] = 0;
                    }
                }
            }
        }while (repeat);
    }

    public void moveUp(){
        for (int i = 0; i < this.field.length - 1 ; i++){
            for (int j = 0; j < this.field[i].length; j++){
                if (this.field[i][j] == this.field[i + 1][j]){
                    this.field[i][j] = this.field[i][j] * 2;
                    this.field[i + 1][j] = 0;
                }
            }
        }

        boolean repeat;
        do {
            repeat = false;
            for (int i = 0; i < this.field.length - 1; i++) {
                for (int j = 0; j < this.field[i].length; j++) {
                    if (this.field[i][j] == 0) {
                        if (this.field[i + 1][j] != 0){
                            repeat = true;
                        }
                        this.field[i][j] = this.field[i + 1][j];
                        this.field[i + 1][j] = 0;
                    }
                }
            }
        }while (repeat);
    }

    public void moveRight(){
        for (int i = x - 1; i > 0 ; i--){
            for (int j = 0; j < this.field[i].length; j++){
                if (this.field[j][i] == this.field[j][i - 1]){
                    this.field[j][i] = this.field[j][i] * 2;
                    this.field[j][i - 1] = 0;
                }
            }
        }

        boolean repeat;
        do {
            repeat = false;
            for (int i = x - 1; i > 0; i--) {
                for (int j = 0; j < this.field[i].length; j++) {
                    if (this.field[j][i] == 0) {
                        if (this.field[j][i - 1] != 0 ){
                            repeat = true;
                        }
                        this.field[j][i] = this.field[j][i - 1];
                        this.field[j][i - 1] = 0;
                    }
                }
            }
        }while (repeat);
    }

    public void moveLeft(){
        for (int i = 0; i < this.field.length - 1; i++){
            for (int j = 0; j < this.field[i].length; j++){
                if (this.field[j][i] == this.field[j][i + 1]){
                    this.field[j][i] = this.field[j][i] * 2;
                    this.field[j][i + 1] = 0;
                }
            }
        }

        boolean repeat;
        do {
            repeat = false;
            for (int i = 0; i < this.field.length - 1; i++) {
                for (int j = 0; j < this.field[i].length; j++) {
                    if (this.field[j][i] == 0) {
                        if (this.field[j][i + 1] != 0 ){
                            repeat = true;
                        }
                        this.field[j][i] = this.field[j][i + 1];
                        this.field[j][i + 1] = 0;
                    }
                }
            }
        }while (repeat);
    }

    public void showField(){
        System.out.println();
        for (int[] element : this.field){
            for (int element2 : element){
                if (element2 == 0){
                    System.out.print("- ");
                }else {
                    System.out.print(element2 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[] countNumber(){
        int[] tab = new int[5];
        for (int[] element : this.field){
            for (int element2 : element){
                if (element2 == 2){
                    tab[0]++;
                } else if (element2 == 4){
                    tab[1]++;
                } else if (element2 == 8){
                    tab[2]++;
                } else if (element2 == 16){
                    tab[3]++;
                } else if (element2 == 32){
                    tab[4]++;
                }
            }
        }
        return tab;
    }
}
