package hometasks.lesson6.a1;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Cat1";//строка занесена в пул
        String s2 = "Cat";//строка занесена
        String s3 = new String("Cat");//строка не занесена в пул
        String s4 = s3.intern();//занесена
        System.out.println("s1 == s2 :" + (s1 == s2));
        System.out.println("s1 == s3 :" + (s1 == s3));
        System.out.println("s1 == s4 :" + (s1 == s4));
    }
}
/*
Сколько строк будет храниться в String Pool в результате выполнения
следующего кода:
ОТВЕТ: 3 строки занесены в пул
вопрос: а какие строки занесены в пул строк? перечисли их.
 */