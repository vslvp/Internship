import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        int answer = 0;
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            lines.forEach(line -> numbers.add(Integer.parseInt(line)));
            } catch (Exception e) {
            e.printStackTrace();
            }
            int num1 = numbers.stream().max(Integer::compare).get();
            int num2 = numbers.stream().min(Integer::compare).get();
            double num = (num1 + num2) / 2;
            if (num % 2 != 0){
                num = (int) num + 1;
            }
            for (int i =0;;i++){
                if (i >= numbers.size()){
                    break;
                }
                if (numbers.get(i) != num && numbers.get(i) < num){
                    answer += (int) num - numbers.get(i);
                }
                if (numbers.get(i) != num && numbers.get(i) > num){
                    answer += numbers.get(i) - num;
                }
            }
        System.out.println(answer);
    }
}
