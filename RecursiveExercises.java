import java.util.Arrays;
/* Part 1: 
 * Goal: Find the largest element within the array using recursive methods.
 * Subarray has one element this element is the larget
 * Hint: Similar to how merge sort divides arrays.
 * Split the array in half, find the largest element from each division, and then compare the larger values. Return the largest element.
*/
public class RecursiveExercises {
    public static int findMax(int[] arr, int left, int right) {
        if (left == right) { //If the subarray has one element.
            return arr[left]; //Return the one elemenet. This is the largest number.
        }
        int mid = (left + right) / 2; //Divide the array into two smaller arrays.
        int maxLeft = findMax (arr, left, mid); //Find the max value of the left subarray.
        int maxRight = findMax (arr, mid + 1, right); //Find the max value of the right subarray.
        /*Compare the large values in each subarray and return the largest. */
        if (maxLeft > maxRight) {
            return maxLeft;
        }else {
            return maxRight;
        }
    } // end of FindMax

    /*Part 2: Reverse the Array
     * Reverse the array in place
     * Take an array and swap when left and right cross each other in the array.
     */
public static void reverseArray(int[] arr, int left, int right) {
    //Stop when the two pointers meet or cross within the array.
    if (left >= right) {
        return;
    }
    //swap the elements located at the two pointers.
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    //Move the pointers toward the center and then repeat.
    reverseArray(arr, left + 1, right - 1);
}
/*Part 3: CountOccurreneces 
 * Goal: Count how many times a target value appears in the array.
 * Stop the count if the index is past the last element within the array. Keep the count within bounds.
 * If element matches searched target increase the count by 1.
 */
public static int countOccurrences(int[] arr, int target, int index) {
    //If the index is past the last element, nothing is left to count.
    if (index >= arr.length) {
    return 0;
    }
    int countContinue = countOccurrences(arr, target, index + 1); //recursively count the rest of the array
    //Add 1 to the count if the current element matches the target.
    if (arr[index] == target) {
        return 1 + countContinue;
    } else {
        return countContinue; //once all the elemnet matches have been found return count total.
    }
}
 public static void main(String[] args) {
        int[] arr1 = {6, 4, 2, 1, 7}; //create an array with 5 elements 
        System.out.println("The largest value is: " + findMax(arr1, 0, arr1.length - 1)); //search the array and give the largest element.
 
        int[] arr2 = {2, 4, 6, 8, 10}; //create an array with 5 elements 
        System.out.println("arr2 before reverse: " + Arrays.toString(arr2));
        reverseArray(arr2, 0, arr2.length - 1); //search array 2, swap left and right elements.
        System.out.println("arr2 before revers: " + Arrays.toString(arr2));
    
        int[] arr3 = {1, 2, 3, 2, 2}; //create an array with 5 elements 
        System.out.println("number of twos in arr3: " + countOccurrences(arr3, 2, 0)); //search array 3, look for target 2, begin at index 0.
    } //end of tests
} //end of class

    