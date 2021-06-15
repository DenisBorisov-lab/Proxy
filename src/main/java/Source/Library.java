package Source;

import ServiceInterface.LibraryFunctions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Library implements LibraryFunctions {

    @Override
    public String[] getLanguages() throws IOException {
        String value = new String(Files.readAllBytes(Paths.get("C:\\Users\\maibo\\IdeaProjects\\Proxy\\src\\main\\resources\\text.txt")));
        return value.split("\\PL++");
    }
}
