package org.example;

public class Library {

    public int countBooksGt(int[] books, int element) {
        int left = 0;
        int right = books.length - 1;
        while (left <= right) {
            int middleIndex = left + (right - left) / 2;

            if (books[middleIndex] <= element) {
                left = middleIndex + 1;
            } else {
                right = middleIndex - 1;
            }
        }
        return books.length - left;
    }
}
