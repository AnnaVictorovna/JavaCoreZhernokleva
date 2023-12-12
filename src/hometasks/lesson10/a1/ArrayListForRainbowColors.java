package hometasks.lesson10.a1;

import java.util.ArrayList;

public class ArrayListForRainbowColors {
    public static void main(String[] args) {
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(Color.RED);
        colors.add(Color.ORANGE);
        colors.add(Color.YELLOW);
        colors.add(Color.GREEN);
        colors.add(Color.LIGHT_BLUE);
        colors.add(Color.BLUE);
        colors.add(Color.PURPLE);
        System.out.println(colors);

    }
}

// лучше вынести как отдельный класс, а не внутренний.
// Чтобы была возможность в будущем переиспользовать его.

/*Создать список ArrayList который хранит в себе все цвета радуги.
Вывести их в консоль.*/