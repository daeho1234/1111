import java.util.Random;

public class distribution {

    public static void main(String[] args) {

        int x=0,y;
        Random r = new Random();

        for(int i=0;i<10;i++) {
            y = 2 * i + 1;
            System.out.print(y + r.nextGaussian() + ", ");
        }
    }
}
