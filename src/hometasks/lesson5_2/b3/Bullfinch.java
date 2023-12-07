package hometasks.nesterovich5_2.b3;

import hometasks.nesterovich5_2.b4.Flying;

public class Bullfinch extends ForestBird implements Flying {
    @Override
    public void voice() {
        super.voice();
        System.out.println("фю-фю");
    }

    @Override
    public void fly() {
        System.out.println("Снегирь летает");
    }
}
