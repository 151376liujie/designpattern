package com.jonnyliu.proj.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 书架类
 */
public class BookShelf {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Iterator<Book> iterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator<Book> {

        private int index;

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            Book book = books.get(index);
            index++;
            return book;
        }
    }
}
