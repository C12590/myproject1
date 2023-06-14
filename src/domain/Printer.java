package domain;

public class Printer implements Equipment {

    private String name;
    private String type;

    public Printer() {
    }
    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public String getDescription() {
        return name + "(" + type + ")";
    }
}
