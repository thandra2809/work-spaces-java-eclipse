import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoval {
    public static void main(String[] args) {

        ArrayList<String> listOne =
                new ArrayList<>(Arrays.asList("a","b","c","d","f"));

        ArrayList<String> listTwo =
                new ArrayList<>(Arrays.asList("a","b","c","d","e"));

        listOne.removeAll(listTwo);

        System.out.println(listOne);


    }

}
