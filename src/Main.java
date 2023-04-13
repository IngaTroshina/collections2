import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("cat", "cow", "dog", "cat", "bear"));
        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        task1(nums);
        task2(nums);
        task3(words);
        task4(strings);

    }
    public static void task1 (List<Integer> nums) {
        for (Integer integer : nums) {
            if (integer % 2 == 1) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    public static void task2 (List<Integer> nums) {
        Collections.sort(nums);
        Set<Integer> nums2 = new HashSet<>();
        for (Integer integer : nums) {
            if(!nums2.contains(integer)) {
                if (integer % 2 == 0) {
                    System.out.print(integer + " ");
                    nums2.add(integer);
                }
            }
        }
        System.out.println();
    }

    public static void task3 (List<String> words) {
        Set<String> words2 = new HashSet<>();
        for (String string : words) {
            if(!words2.contains(string)) {
                if (!string.equals(words)) {
                    System.out.print(string + " ");
                    words2.add(string);
                }
            }
        }
        System.out.println();
    }
    public static void task4 (List<String> strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        for (String key : map.keySet()) {
            System.out.println("Количество повторений слова " + "'" + key + "'" + " - " + map.get(key) + " раз(а)");
        }

    }
}