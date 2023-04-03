package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library = new Library();

    @Test
    void countBooksGtTest() {
        // given
        int[] books = { 14, 16, 19, 32, 32, 32, 56, 69, 72 };
        int element = 32;

        // when
        int res = library.countBooksGt(books, element);

        // then
        Assertions.assertEquals(3, res);
    }

    @Test
    void whenAllBooksAreGreaterThanGivenElement() {
        // given
        int[] books = { 14, 16, 19, 32, 32, 32, 56, 69, 72 };
        int element = 10;

        // when
        int res = library.countBooksGt(books, element);

        // then
        Assertions.assertEquals(books.length, res);
    }

    @Test
    void whenAllBooksAreLessThanGivenElement() {
        // given
        int[] books = { 14, 16, 19, 32, 32, 32, 56, 69, 72 };
        int element = 72;

        // when
        int res = library.countBooksGt(books, element);

        // then
        Assertions.assertEquals(0, res);
    }


}