package Client;

import ServiceInterface.LibraryFunctions;
import Source.OnlineLibrary;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        LibraryFunctions library = new OnlineLibrary();
        String[] languages = library.getLanguages();
        for (int i = 0; i < languages.length; i++) {
            System.out.println((i + 1) + ": " + languages[i]);
        }
    }
}
