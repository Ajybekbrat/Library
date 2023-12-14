import impl.ServiceBook;
import impl.ServiceLibrary;
import modelss.Book;
import modelss.Library;
import modelss.Reader;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


                DataBase dataBase = new DataBase();
        Reader reader = new Reader();
        Library library = new Library();
        Book book = new Book();
        GeneratorId generatorId = new GeneratorId();

        SerBook serviceBook = new SerBook();
        SerReader serviceReader = new SerReader();
        SerLibrary serviceLibrary = new SerLibrary();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

                while (true) {
                    System.out.println("""
                       choice
                     1. Save library
                     2. get all libraries
                     3. get library by id
                     4. update library
                     5. delete library
                     6. save Book
                     7. get all book
                     8. get book by id
                     9. delete book
                     10. clearBooksByLibraryId
                     11. save reader 
                     12. get all readers
                     13. get reader by id
                     14. update reader
                     15. assignReaderToLibrary 
                    """);
                    try {


                        String sc = new Scanner(System.in).nextLine();
                        switch (sc) {
                            case "1" -> {
                                Scanner scanner4 = new Scanner(System.in);
                                Library library6 = new Library();
                                System.out.print("Enter library name; ");
                                library6.setName(scanner.nextLine());
                                System.out.println("Enter adress");


                                library6.setId(GeneratorId.generatedId());
                                library6.setAddress(scanner.nextLine());
                                serviceLibrary.saveLibrary(library6);
                            }
                            case "2" -> {
                                serviceLibrary.getAllLibraries();
                            }
                            case "3" -> {
                                System.out.println("Enter id : ");
                                Scanner scanner3 = new Scanner(System.in);
                                int num = scanner3.nextInt();
                                serviceLibrary.getLibraryById(num);
                            }
                            case "4" -> {
                                System.out.print("Enter id: ");
                                Long num = scanner.nextLong();
                                System.out.println("Enter new library name: ");
                                Library library1 = new Library();
                                library1.setName(scanner.nextLine());

                                serviceLibrary.updateLibrary(num, String.valueOf(library1));
                            }
                            case "5" -> {
                                System.out.print("Enter Library id: ");
                                long num = scanner.nextLong();
                                serviceLibrary.deleteLibrary(num);
                            }
                            case "6 " -> {
                                Scanner scanner5 = new Scanner(System.in);
                                Book book1 = new Book();
                                System.out.print("Enter Library id: ");
                                long enter = scanner.nextLong();
                                System.out.print("Enter book name; ");
                                book1.setName(scanner.nextLine());
                                System.out.print("Enter author: ");
                                book1.setId(GeneratorId.generatedIdOfBook());


                                book1.setId(GeneratorId.generatedId());
                                book1.setAuthor(scanner.nextLine());
                                serviceBook.saveBook(enter, book1);

                            }
                            case "7" -> {
                                System.out.print("Enter library id: ");
                                long num = scanner1.nextLong();
                                serviceBook.getAllBooks(num);
                            }
                            case "8" -> {
                                System.out.print("Enter library id: ");
                                long lib = scanner2.nextLong();
                                System.out.println("Enter book id");
                                long boo = scanner2.nextLong();
                                serviceBook.getBookById(lib, boo);
                            }
                            case "9" -> {
                                System.out.print("Enter library id: ");
                                long lib = scanner2.nextLong();
                                System.out.println("Enter book id");
                                long id = scanner.nextLong();
                                serviceBook.deleteBook(lib, id);
                            }
                            case "10" -> {
                                System.out.print("Enter library id: ");
                                long lib = scanner.nextLong();
                                serviceBook.clearBooksByLibraryId(lib);
                            }
                            case "11" -> {
                                System.out.print("Enter reader name");
                                Reader reader1 = new Reader();
                                String name = scanner.nextLine();
                                reader1.setFullName(name);
                                reader1.setId(GeneratorId.generatedIdOFReader());
                                System.out.print("Enter reader phone number: ");
                                int num1 = scanner.nextInt();
                                reader1.setPhoneNumber(num1);
                                System.out.println("""
                                        Enter gender MALE or FEMALE
                                        """);
                                String gen = scanner2.nextLine();
                                reader1.setGender(gen);
                                System.out.print("Enter gmail: ");
                                String emai = scanner1.nextLine();
                                if (emai.contains("@gmail.com")) {
                                    reader1.setEmail(emai);
                                } else {
                                    System.out.println("Email need contains @gmail.com");
                                }
                                serviceReader.saveReader(reader1);


                            }
                            case "12" -> {
                                serviceReader.getAllReaders();
                            }
                            case "13" -> {
                                System.out.println("Enter reader id");
                                long id = scanner.nextLong();
                                serviceReader.getReaderById(id);
                            }
                            case "14" -> {
                                System.out.println("Enter reader id");
                                long od = scanner2.nextLong();
                                System.out.println("Enter new reader name");

                                Reader reader1 = new Reader();
                                String name = scanner1.nextLine();
                                reader1.setFullName(name);
                                System.out.print("Enter reader phone number: ");
                                int num1 = scanner1.nextInt();
                                reader1.setPhoneNumber(num1);
                                System.out.println("Enter Gender MALE or FEMALE");
                                String gen = scanner2.nextLine();
                                reader1.setGender(gen);
                                System.out.println("Enter gmail");
                                String gmai = scanner2.nextLine();
                                if (gmai.contains("gmail.com")) {
                                    reader1.setEmail(gmai);
                                } else {
                                    System.out.println("Email need contains @gmail.com");
                                }
                                serviceReader.updateReader(od, reader1);
                                } case "15" -> {

                            }


                        }
                    }catch (Exception e){
                        System.out.println("   INCORRECT CHOICE");

                    }
                    }

                }
            }




