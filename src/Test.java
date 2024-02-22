import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List<String> list3 = new ArrayList(Arrays.asList("NORTH", "NORTH", "EAST", "EAST", "NORTH", "WEST", "SOUTH", "WEST", "WEST"));
//        System.out.println(Assorted.wildWest(list3));
        List<Integer> supermarket = new ArrayList(Arrays.asList(5,3,4));
        List<Integer> supermarket2 = new ArrayList(Arrays.asList(10,2,3,3));
        List<Integer> supermarket3 = new ArrayList(Arrays.asList(2,3,10));
        List<Integer> supermarket4 = new ArrayList(Arrays.asList(2,3,10,2,3,10,8,7,4,12,4,6));
        System.out.println(Assorted.queueTime(supermarket, 1));
        System.out.println(Assorted.queueTime(supermarket2, 2));
        System.out.println(Assorted.queueTime(supermarket3, 3));
        System.out.println(Assorted.queueTime(supermarket4, 4));
    }
}
