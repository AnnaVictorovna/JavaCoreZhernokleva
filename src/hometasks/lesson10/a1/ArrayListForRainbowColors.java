package hometasks.lesson10.a1;

import java.util.ArrayList;

public class ArrayListForRainbowColors {
    public static void main(String[] args) {
        ArrayList<Colors> colors = new ArrayList<>();
        colors.add(Colors.RED);
        colors.add(Colors.ORANGE);
        colors.add(Colors.YELLOW);
        colors.add(Colors.GREEN);
        colors.add(Colors.LIGHT_BLUE);
        colors.add(Colors.BLUE);
        colors.add(Colors.PURPLE);
        System.out.println(colors);

    }
}

// лучше вынести как отдельный класс, а не внутренний.
// Чтобы была возможность в будущем переиспользовать его.
enum Colors {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    LIGHT_BLUE,
    BLUE,
    PURPLE,
    ;
}
/*Создать список ArrayList который хранит в себе все цвета радуги.
Вывести их в консоль.*/