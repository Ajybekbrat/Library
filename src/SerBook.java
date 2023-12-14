import impl.ServiceBook;
import modelss.Book;
import modelss.Library;


import java.util.Scanner;
import java.util.Set;


public class SerBook implements ServiceBook{
    DataBase dataBase = new DataBase();

    @Override
    public Book saveBook(Long libraryId, Book book) {
        for (Library library : dataBase.libraries) {



                if (library.getId() == (libraryId) ) {
                    dataBase.bookSet.add(book);
                }else{
                    System.out.println(" DONT FOUND LIBRARY");
                }


            }


            return null;
        }



    @Override
    public Set<Book> getAllBooks(Long libraryId){
        for (Library library : dataBase.libraries) {
            if (library.getId() == libraryId){
                System.out.println(dataBase.bookSet);

            }else {
                System.out.println("Dont found ");
            }
        }
        return null;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (Book book : dataBase.bookSet) {
            for (Library library : dataBase.libraries) {
                if (library.getId()== (libraryId) && book.getId() == (bookId)){
                    System.out.println(book);
                }
            }
        }
        return null;
    }

    @Override
    public Book deleteBook(Long libraryId, Long bookId) {
        for (Book book : dataBase.bookSet) {

                for (Library library : dataBase.libraries) {
                    if (library.getId() == (libraryId) && book.getId() == (bookId)){
                        dataBase.bookSet.remove(book);
                    }else {
                        System.out.println("DONT FOUND");
                    }
                }
        }
        return null;
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (Library library : dataBase.libraries) {
            if (library.getId()== (libraryId)){
                dataBase.libraries.clear();
            }else{
                System.out.println("DONT FOUND");
            }
        }

    }
}
