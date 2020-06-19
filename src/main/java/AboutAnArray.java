import java.util.Arrays;

public class AboutAnArray {

  /*
   Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
  sum28([2, 3, 2, 2, 4, 2]) → true
  sum28([2, 3, 2, 2, 4, 2, 2]) → false
  sum28([1, 2, 3, 4]) → false
    */

  public boolean sum28(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 2) {
        sum += arr[i];
      }
    }

    if (sum == 8) {
      return true;
    }
    return false;
  }

  /*
  Given an array of ints, return true if the value 3 appears in the array
  exactly 3 times, and no 3's are next to each other.

  haveThree([3, 1, 3, 1, 3]) → true
  haveThree([3, 1, 3, 3]) → true
  haveThree([3, 4, 3, 3, 4, 3]) → false
   */

  public boolean haveThree(int[] arr) {

    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 3) {
        count++;
      }
    }
    if (count == 3) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    AboutAnArray aboutAnArray = new AboutAnArray();

    int[] arrOne = {2, 3, 2, 2, 4, 2};
    System.out.println("Sum 28: " + aboutAnArray.sum28(arrOne));

    int[] someArray = {3, 6, 3, 2, 3};
    System.out.println(aboutAnArray.haveThree(someArray));

    aboutAnArray.arrayEven(someArray);

    int[] ansArray = aboutAnArray.evenOdd(someArray);

    System.out.println(Arrays.toString(ansArray));

    int[] newArray = {4, 4, 4};
    System.out.println(aboutAnArray.more14(newArray));
  }

  /*
  Return an array that contains the exact same numbers as the given array,
  but rearranged so that all the even numbers come before all the odd numbers.
  Other than that, the numbers can be in any order.
  You may modify and return the given array, or make a new array.

    evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
    evenOdd([3, 3, 2]) → [2, 3, 3]
    evenOdd([2, 2, 2]) → [2, 2, 2]
   */

  public int[] evenOdd(int[] nums) {

    int i = 0;
    // This block will count howmany even numbers inside an array...
    while (i < nums.length && nums[i] % 2 == 0) i++;

    for (int j = i + 1; j < nums.length; j++) {
      if (nums[j] % 2 == 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
      }
    }

    return nums;
  }

  /*
  Given an array of ints, return true if the number of 1's is greater
  than the number of 4's
    more14([1, 4, 1]) → true
    more14([1, 4, 1, 4]) → false
    more14([1, 1]) → true
   */

  public boolean more14(int[] arr) {

    // TODO
    // 1. Read and array and find 1 and 4 ?
    // Compare if 1's are more then 4's if so true or false

    int count1 = 0;
    int count4 = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        count1++;
      }

      if (arr[i] == 4) {
        count4++;
      }
    }

    if (count1 > count4) {
      return true;
    }

    return false;
  }

  // find an even or odd number in any number array...

  public void arrayEven(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        System.out.println(arr[i] + " It's an even Number");
      } else {
        System.out.println(arr[i] + " It's odd number");
      }
    }
  }
}
