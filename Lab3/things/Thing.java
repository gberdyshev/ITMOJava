package things;

public class Thing {
    private String name;

    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;
        Thing other = (Thing) otherObject;
        return name.equals(other.name);       
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }


}