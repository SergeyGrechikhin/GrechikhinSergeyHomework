package homework16.experiments.proba2;

public class Group {
    private String groupname ;

    public Group(String groupname) {
        this.groupname = groupname;
    }

    public String getGroupname() {
        return groupname;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupname='" + groupname + '\'' +
                '}';
    }
}
