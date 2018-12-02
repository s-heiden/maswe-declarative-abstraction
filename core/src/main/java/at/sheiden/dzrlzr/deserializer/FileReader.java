package at.sheiden.dzrlzr.deserializer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class FileReader {
    static String getFileContentAsString(Path file) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            return reader.readLine();
        } catch (IOException e) {
            throw new IOException(e); // TODO: make more concrete
        }
    }
}
