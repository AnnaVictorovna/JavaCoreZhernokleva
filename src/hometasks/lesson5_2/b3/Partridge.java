package hometasks.nesterovich5_2.b3;

import hometasks.nesterovich5_2.b4.Flying;

public class Partridge extends ForestBird implements Flying {
    @Override
    public void voice() {
        super.voice();
        System.out.println("xo-xo");
    }

    @Override
    public void fly() {
        System.out.println("Куропатка летает");
    }
}
