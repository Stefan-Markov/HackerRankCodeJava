package BigDecimal;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<BigDecimal> nums = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            BigDecimal bigDecimal = new BigDecimal(s);
            nums.add(bigDecimal);
//            map.merge(
//                    bigDecimal,
//                    List.of(s),
//                    (oldS, newS) -> Stream.concat(oldS.stream(), newS.stream()).collect(Collectors.toList()));
        }

//        map.keySet().forEach(x -> map.get(x).forEach(System.out::println));
            Collections.sort(nums);
            nums.forEach(System.out::println);
//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
//        String[] s = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            s[i] = scan.next();
//        }
//        Arrays.stream(s)
//                .map(BigDecimal::new)
//                .sorted(BigDecimal::compareTo)
//                .forEach(System.out::println);
    }
}
