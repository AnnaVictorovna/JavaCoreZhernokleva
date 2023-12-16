package hometasks.lesson10.a3;

public enum Tab {
    T1("\n\t"),
    T2("\n\t\t"),
    T3("\n\t\t\t"),
    T4("\n\t\t\t\t"),
    T5("\n\t\t\t\t\t"),
    T6("\n\t\t\t\t\t\t"),
    ;
    String string;

    Tab(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
