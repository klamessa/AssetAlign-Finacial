/*Write a C program that has two functions named findMax and countOdd. Each
function will take two arguments, an integer array and the number of elements in the
array.findMax returns the largest element. countOdd returns the count of the
number of odd elements in the array. The main function should call findMax and
countOdd twice with different arrays and then print out the results of calling the
functions.*/

#include <stdio.h>

int findMax(int array[], int size) {
    int max = 0; 
    for (int i = 0; i < size; i++) {
        if(array[i] > max) {
            max = array[i];
        }
    }
    return max;
}

int countOdd(int array[], int size) {
    int oddCount = 0; 
    for (int i = 0; i < size; i++) {
        if (array[i] % 2 == 1) {
            oddCount++;
        }
    }
    return oddCount;
}

int main() {
    static int array1[] = {1, -1, 100, 32, 64, -97};
    static int array2[] = {-100, 1, -10, 50, -40, 98, 110};

    int size1 = sizeof(array1) / sizeof(array1[0]);
    int size2 = sizeof(array2) / sizeof(array2[0]);

    int max1 = findMax(array1, size1);
    int max2 = findMax(array2, size2);

    int countOdd1 = countOdd(array1, size1);
    int countOdd2 = countOdd(array2, size2);

    printf("Array 1 - Max: %d, Odd Count: %d\n", max1, countOdd1);
    printf("Array 2 - Max: %d, Odd Count: %d\n", max2, countOdd2);

    return 0;  
}
