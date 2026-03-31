package enums;

public enum Status {
    ALIVE("живой"),
    DEAD("мёртвый");
    private String name;
    
    Status(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}