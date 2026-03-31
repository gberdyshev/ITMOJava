package enums;

public enum StatusEmotion {
    GOOD("хорошо"),
    CLEVERLY("ловко"),
    NOW("живо"),
    WELLDONE("молодецки");
    private String name;
    StatusEmotion(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}