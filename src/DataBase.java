import impl.ServiceBook;
import impl.ServiceLibrary;
import modelss.Book;
import modelss.Library;
import modelss.Reader;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



    public class DataBase {
         public Set<Book> bookSet = new HashSet<>(Arrays.asList(
                 new Book(1, "kyiamat", "Chyngyz Aitmatov", "detectiv"),
        new Book(2, "faca to face", "Chyngyz Aitmatov", "fight"),
          new Book(3, "Belyi porohot", "Chyngyz Aitmatov", "detectiv"),
         new Book(4, "Erte kelgen turnalar", "Chyngyz Aitmatov", "drama"),
         new Book(5, "red apple", "Chyngyz Aitmatov", "love")));
         public Set<Library> libraries = new HashSet<>(Arrays.asList(
                 new Library(1, "Peaksoft", "kirova 63", bookSet),
                 new Library(2, "Peaksoft", "kirova 63", bookSet),
                 new Library(3, "zone", "isanova", bookSet),
                 new Library(4, "globus", "toktogula", bookSet),
                 new Library(5, "Peaksoft", "kirova 63", bookSet)
         ));


       public Set<Reader>readers = new HashSet<>(Arrays.asList(
               new Reader(1, "Abil", "Abil@gmail.com", 502091107, "male"),
               new Reader(2, "Alisher", "Abil@gmail.com", 500935434, "male"),
               new Reader(3, "Asema", "Asema@gmail.com", 502110703, "female"),
               new Reader(4, "Alina", "Alinal@gmail.com", 702091107, "female"),
               new Reader(5, "Aktan", "Aktan@gmail.com", 772091107, "male"))

       );


    }

