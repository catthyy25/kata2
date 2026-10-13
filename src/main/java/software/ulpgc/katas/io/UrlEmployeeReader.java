package software.ulpgc.katas.io;

import software.ulpgc.katas.model.Employee;
import software.ulpgc.katas.model.Gender;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UrlEmployeeReader implements EmployeeReader {
    private final URL url;

    public UrlEmployeeReader(URL url) {
        this.url = url;
    }

    @Override
    public List<Employee> load() {
        try {
            try (InputStream is = url.openStream()) {
                return loadFrom(is);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Employee> loadFrom(InputStream is) throws IOException {
        return loadFrom(new InputStreamReader(is));
    }

    private List<Employee> loadFrom(Reader reader) throws IOException {
        return loadFrom(reader.readAllLines());
    }

    private List<Employee> loadFrom(List<String> lines){
        return IntStream.range(1, lines.size()).mapToObj(i -> loadFrom(lines.get(i))).collect(Collectors.toList());
    }

    private Employee loadFrom(String line){
        return loadFrom(line.split("\t"));
    }

    private Employee loadFrom(String[] fields){
        return new Employee(fields[0], genderOf(fields[5]));
    }

    private static Gender genderOf(String field){
        return field.isEmpty() ? null : Gender.valueOf(field);
    }
}
