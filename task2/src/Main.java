import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path1 = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        String path2 = scanner1.nextLine();
        ArrayList<Float> circlePoints = new ArrayList<>();
        ArrayList<Float> points = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path1));
            lines.forEach(line -> stringBuilder.append(line + " "));
            String[] strings = stringBuilder.toString().split("\\s");
            List<String> lines1 = Files.readAllLines(Paths.get(path2));
            lines1.forEach(line1 -> stringBuilder1.append(line1 + " "));
            String[] strings1 = stringBuilder1.toString().split("\\s");
            for (int i = 0; i < strings.length; i++){
                circlePoints.add(Float.parseFloat(strings[i]));
            }
            for (int k = 0; k < strings1.length; k++){
                points.add(Float.parseFloat(strings1[k]));
            }
            for (int l = 0; l < points.size(); ){
                if (points.get(l) * points.get(l) + points.get(l + 1) * points.get(l + 1)
                        == circlePoints.get(2) * circlePoints.get(2)){
                    System.out.println("0");
                }
                if (points.get(l) * points.get(l) + points.get(l + 1) * points.get(l + 1)
                        < circlePoints.get(2) * circlePoints.get(2)){
                    System.out.println("1");
                }
                if (points.get(l) * points.get(l) + points.get(l + 1) * points.get(l + 1)
                        > circlePoints.get(2) * circlePoints.get(2)){
                    System.out.println("2");
                }
                l = l + 2;
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
