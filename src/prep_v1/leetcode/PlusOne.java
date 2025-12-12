package leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[]{1, 2, 3, 4};
        String numberAsString = Arrays.stream(digits)
                .mapToObj(String::valueOf)
                .reduce("", String::concat);

        long number = Long.parseLong(numberAsString);

        long result = number + 1;

        int[] digitArray = Long.toString(result)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

        System.out.println(Arrays.toString(digitArray));
    }
}
