import java.util.Scanner;


public class Kazik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Выша ставка = ");
        double st = sc.nextDouble();
        int x = (int) (Math.random() * 13) +1;
        double y = 0;
        if (x == 1 || x == 13){
            st *= 10;
            y += 10;
        }
        if (x == 2 || x == 12){
            st *= 5;
            y += 5;

        }
        if (x == 3 || x == 11){
            st *= 2;
            y += 2;

        }
        if (x == 4 || x == 10 ){
            st *= 1.5;
            y += 1.5;

        }
        if (x == 5 || x == 9 ){
            st *= 1;
            y += 1;

        }
        if (x == 6 || x == 8){
            st *= 0.5;
            y += 0.5;

        }
        if (x == 7){
            st *= 0.2;
            y += 0.2;

        }

        System.out.println("Выпало "+y);
        System.out.println("Ваш баланс = "+ st);
    }
}
