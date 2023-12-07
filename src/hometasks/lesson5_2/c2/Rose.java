package hometasks.nesterovich5_2.c2;

public class Rose extends Plant {
    private int thornsCount;

    @Override
    public void grow() {
        super.grow();
    }

    public int growThorns() {
        return thornsCount;
    }

    public int getThornsCount() {
        return thornsCount;
    }

    public void setThornsCount(int thornsCount) {
        this.thornsCount = thornsCount;
    }
}
