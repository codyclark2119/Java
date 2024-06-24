package udemy_exercises;

import java.util.*;

class Sorting {

    public static void main(String[] args) {
        System.out.println("This is the Sorting Class");
        Sorting mySorting = new Sorting();
        int[] numList = mySorting.getNums();
        mySorting.sortIntegers(numList);
        mySorting.printNums(numList);
        mySorting.reverse(numList);
        mySorting.printNums(numList);
    }

    void sortIntegers(int[] nums) {
        System.out.println("Sorted Nums:");
        Arrays.sort(nums);
    }

    void printNums(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }

    int[] getNums() {
        int[] userNums = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < userNums.length; i++) {
            userNums[i] = input.nextInt();
        }
        input.close();
        System.out.println("Users Nums:");
        System.out.println(Arrays.toString(userNums));

        return userNums;
    }

    void reverse(int[] numbers) {
        System.out.println("Nums in descending order:");
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
    }

}
