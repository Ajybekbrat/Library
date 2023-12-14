package impl;

import modelss.Reader;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public interface ServiceReader {






        Set<Reader>saveReader(Reader reader);

        ArrayList<Reader> getAllReaders();

    Reader getReaderById(Long id);

    ArrayList<Reader> updateReader(Long id, Reader reader);





    ArrayList<Reader> assignReaderToLibrary(Long readerId, Long libraryId);
    }


