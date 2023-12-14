



package modelss;

import impl.ServiceLibrary;

import java.util.ArrayList;
import java.util.Set;

public class Library{
        public int  id;
        private String name;
        private String address;
        private Set<Book> books;



    public Library(int id, String name, String address, Set<Book> books) {
            this.id = id;
            this.name = name;
            this.address = address;
        this.books = books;
        }


        public Library() {
        }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }


        @Override
        public String toString() {
            return "Library{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
