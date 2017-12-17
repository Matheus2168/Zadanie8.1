import java.util.Scanner;

public class DirTest {


    public static void main(String[] args) {

        System.out.println(Directions.getAll());

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj kierunek: ");

        Directions yourDirection = Directions.valueOf(sc.nextLine().toUpperCase());

        System.out.println("OK, wiec idziemy na "+yourDirection.getPL_DIRECTION_NAME());

        yourDirection = Directions.convert(8);

        System.out.println(yourDirection.getPL_DIRECTION_NAME());
    }
}
