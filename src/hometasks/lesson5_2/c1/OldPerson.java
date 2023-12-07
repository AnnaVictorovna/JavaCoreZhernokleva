package hometasks.nesterovich5_2.c1;

public class OldPerson extends Person {
    private int pensionSize = 200;

    @Override
    public void walk() {
        System.out.println("Walk slowly");
    }

    public void getPension() {
        System.out.println(pensionSize);
    }

    public int getPensionSize() {
        return pensionSize;
    }

    public void setPensionSize(int pensionSize) {
        this.pensionSize = pensionSize;
    }
}
