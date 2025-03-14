import java.util.HashMap;
public class Task2 {
    public static int findDominant(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int threshold = array.length / 2;
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > threshold) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 3, 3, 2, 2};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {5, 5, 5, 1};
        System.out.println(findDominant(arr1));
        System.out.println(findDominant(arr2));
        System.out.println(findDominant(arr3));
    }
}
