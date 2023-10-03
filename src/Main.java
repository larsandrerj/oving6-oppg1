import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("ØVING 6 OPPGAVE 1!");

        Random rnd = new Random();

        int[] numberOccurence = new int[10];
        for (int i = 0; i < 100000; i++) {
            int num = rnd.nextInt(10);
            numberOccurence[num]++;
        }

        for (int i = 0; i < numberOccurence.length; i++) {
            System.out.println((i) + " blir repetert " + numberOccurence[i] + " ganger");
        }
    }
}