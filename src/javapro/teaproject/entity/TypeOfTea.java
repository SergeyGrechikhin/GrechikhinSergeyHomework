package javapro.teaproject.entity;

public class TypeOfTea {
    private int id;
    private String typeName;
    private String comment;

    public TypeOfTea(int id, String typeName, String comment) {
        this.id = id;
        this.typeName = typeName;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return "TypeOfTea{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
