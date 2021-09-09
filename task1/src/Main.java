import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int m = scanner1.nextInt();
        ArrayList<Integer> mas = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int j = 1;
        int k = 0;
        answer.add(1);
        for (int i = 0; ;) {
            mas.add(j);
            if (j == n) {
                j = 0;
            }
            j++;
            i++;
            if (i % m == 0 && i != 0){
                k++;
                answer.add(mas.get(k * (m - 1)));
                if (answer.get(k) == 1){
                    answer.remove(k);
                    answer.forEach(System.out::print);
                    break;
                }
            }
        }
    }
}