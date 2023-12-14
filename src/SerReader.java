import impl.ServiceReader;
import modelss.Reader;

import java.util.ArrayList;
import java.util.Set;

public class SerReader implements ServiceReader {

DataBase dataBase = new DataBase();


    @Override
    public Set<Reader> saveReader(Reader reader) {

            dataBase.readers.add(reader);
            return null;
        }


    @Override
    public ArrayList<Reader> getAllReaders() {
        System.out.println(dataBase.readers);
        return null;
    }

    @Override
    public Reader getReaderById(Long id) {
        for (Reader reader : dataBase.readers) {
            if (reader.getId()==(id)){
                System.out.println(reader);

            }else{
                System.out.println("DONT  FOUND ");
            }
        }

        return null;
    }

    @Override
    public ArrayList<Reader> updateReader(Long id, Reader reader) {
        for (Reader reader1 : dataBase.readers) {
            if (reader1.getId()==(id)){
                 dataBase.readers.add(reader);
            }else{
                System.out.println(" incorrect id");

            }
        }
        return null;
    }

    @Override
    public ArrayList<Reader> assignReaderToLibrary(Long readerId, Long libraryId) {

        return null;
    }
}
