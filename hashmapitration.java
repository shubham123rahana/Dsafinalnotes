import java.util.HashMap;
import java.util.HashSet;

public class hashmapitration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 3, 5, 6, 5};
        death(arr);
    }

    public static void death(int[] arr) {
        HashSet<Integer>set=new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        //put when more then one is present
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        //itreation of hashmap
        map.forEach((key, value) -> {
            System.out.println(key+" "+value);
                }
        );
//itretion of hashset
        System.out.println("set");
        for (int i:set) {
            System.out.print(i+" ");
        }
    }
}
