package org.example.Problem1588;


import java.util.ArrayList;
import java.util.List;

public class SumOfAllOddLengthList {

    private static int sumOddLengthSubarrays(int[] ints) {

        List<List<Integer>> subLists = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                List<Integer> subList = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subList.add(ints[k]);
                }
                subLists.add(subList);
            }
        }

        return subLists.stream()
                .filter(list -> list.size() % 2 != 0)
                .mapToInt(list -> list.stream().mapToInt(Integer::intValue).sum())
                .sum();
    }

   

    public static void main(String[] args) {

        int sum = sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3});
        System.out.println(sum);
    }


}
