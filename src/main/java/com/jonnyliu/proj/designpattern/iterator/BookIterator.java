package com.jonnyliu.proj.designpattern.iterator;

/**
 * Book对象的迭代器
 */
public class BookIterator implements Iterator<Book> {

    private int index;

    private Book[] books;

    public BookIterator(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < this.books.length;
    }

    @Override
    public Book next() {
        Book book = books[index];
        index++;
        return book;
    }
}
