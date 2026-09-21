import java.util.HashSet;

public class FirstDuplicate {
    public static void main(String[] args) {

        int arr[] = {5, 3, 4, 3, 2, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i])) {
                System.out.println("First duplicate: " + arr[i]);
                return;
            }

            set.add(arr[i]);
        }

        System.out.println("No duplicate found");
    }
}
