package hometasks.lesson10.a3;

public enum Tab {
    T1("\n\t"),
    T2("\n\t\t"),
    T3("\n\t\t\t"),
    T4("\n\t\t\t\t"),
    T5("\n\t\t\t\t\t"),
    T6("\n\t\t\t\t\t\t"),
    ;
    final String string; // что тут среда разработки подсказывает сделать и почему? исправить и написать объяснение тут.

    /* Среда разработки подсказывает, чтобы это поле было final
    1) Модификатор final на полях, говорит о том, что данное поле, является окончательным, что его нельзя изменить.
    2) Ещё нашла, что final - это подсказка компилятору. Если он видит финальные поля, то может произвести
    определённые оптимизации кода, но основная причина под пунктом 1*/
    Tab(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
