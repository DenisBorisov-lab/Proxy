package Source;

import ServiceInterface.LibraryFunctions;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class OnlineLibrary implements LibraryFunctions {

    private final LibraryFunctions library = new Library();
    private Set<String> languages = new HashSet<>();

    @Override
    public String[] getLanguages() throws IOException {
        if (languages.isEmpty()) {
            languages = new HashSet<>(Arrays.asList(library.getLanguages()));
        }
        return languages.toArray(new String[languages.size()]);
    }

    public void clearLog() {
        languages.clear();
    }
}
