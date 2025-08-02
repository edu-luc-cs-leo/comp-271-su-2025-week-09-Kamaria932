import java.util.Arrays;
/* Part 1: 
 * Goal: Find the largest element within the array using recursive methods.
 * Subarray has one element this element is the larget
 * Hint: Similar to how merge sort divides arrays.
 * Split the array in half, find the largest element from each division, and then compare the larger values. Return the largest element.
*/

public class recursiveExercises {
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

    } //end of class
