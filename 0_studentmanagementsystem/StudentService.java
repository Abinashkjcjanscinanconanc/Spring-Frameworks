import java.util.*;

public class StudentService {
    private List<String> names;

    public StudentService() {
        names = new ArrayList<String>();
    }

    /**
     * <h1>Add a name
     * <h1>
     * Using this method you can add a Name.
     * 
     * @param name -> string
     */
    public void name(String name) {
        names.add(name);
    }

    public List<String> names() {
        return names;
    }
}
