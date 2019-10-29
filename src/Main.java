import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        String wang = "wang hai rui";
        char[] chars = wang.toCharArray();

        for(char str : chars){
            System.out.print(str+" ");
        }

    }
}
