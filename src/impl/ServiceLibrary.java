package impl;

import modelss.Library;

import java.util.ArrayList;
import java.util.Set;

public interface ServiceLibrary {



    ArrayList<Library> saveLibrary(Library library);

    ArrayList<Library> getAllLibraries() ;



    void getLibraryById(long id);

    Set<Library> updateLibrary(Long id, String library);

    String deleteLibrary(Long id);

}
