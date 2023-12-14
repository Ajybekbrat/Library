package impl;

import modelss.Book;

import java.util.Set;

public interface ServiceBook {


        Book saveBook(Long libraryId, Book book);

        Set<Book> getAllBooks(Long libraryId);

        Book getBookById(Long libraryId, Long bookId);

        Book deleteBook(Long libraryId,Long bookId);

        void clearBooksByLibraryId(Long libraryId);


}
