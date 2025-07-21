package holidayWork.miniProject.firstProject.repository;

import holidayWork.miniProject.firstProject.entity.Gruppe;
import holidayWork.miniProject.firstProject.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GruppeRepository {
    private final Map<String, Gruppe> gruppes = new HashMap<String, Gruppe>();

    public void save(Gruppe gruppe) {
        gruppes.put(gruppe.getCourseName(), gruppe);
    }

    public Gruppe findByName(String name) {
        return gruppes.get(name);
    }

    public boolean exists(String name) {
        return gruppes.containsKey(name);
    }

    public List<Gruppe> findAll() {
        return new ArrayList<>(gruppes.values());
    }
}
