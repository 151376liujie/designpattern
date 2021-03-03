package com.jonnyliu.proj.designpattern.iterator;

public class App {

    public static void main(String[] args) {

        Book book = new Book("java设计模式", "jims brown");
        Book book2 = new Book("大话设计模式", "jims brown");
        Book book3 = new Book("图解设计模式", "jims brown");
        Book book4 = new Book("图解HTTP", "jims brown");

        BookShelf shelf = new BookShelf();
        shelf.addBook(book);
        shelf.addBook(book2);
        shelf.addBook(book3);
        shelf.addBook(book4);

        Iterator<Book> iterator = shelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
