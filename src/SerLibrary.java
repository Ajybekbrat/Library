import impl.ServiceLibrary;
import modelss.Library;

import java.util.ArrayList;
import java.util.Set;

public class SerLibrary implements ServiceLibrary {
    DataBase dataBase = new DataBase();
    @Override
    public ArrayList<Library> saveLibrary(Library library) {
        dataBase.libraries.add(library);

        return null;
    }

    @Override
    public ArrayList<Library> getAllLibraries() {
        for (Library library : dataBase.libraries) {
            System.out.println(library);
        }

        return null;
    }

    @Override
    public void getLibraryById(long id) {
        for (Library library : dataBase.libraries) {
            if (library.getId() == (id)){
                System.out.println(library);
            }else{
                System.out.println("Dont Found");
            }
        }
    }

    @Override
    public Set<Library> updateLibrary(Long id, String library) {
        for (Library library1 : dataBase.libraries) {
            if (library1.getId() == (id)){
                library1.setName(library);

            }else {
                System.out.println("Dont found" );
            }
        }
        return null;
    }

    @Override
    public String deleteLibrary(Long id) {
        for (Library library : dataBase.libraries) {
            if (library.getId()==(id)){
                dataBase.libraries.remove(library);
            }else{
                System.out.println("Dont found");
            }
        }
        return null;
    }
}
