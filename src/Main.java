import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : intList) {
            if (num > 0) {
                if (num % 2 == 0) {
                    positiveNumbers.add(num);

                }
            }
        }
        Collections.sort(positiveNumbers);
        System.out.println("Выведем массив созданный при помощи перебора циклом + условия:");
        System.out.println(positiveNumbers);

        StreamMain.main(args);
    }
}
