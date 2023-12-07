package hometasks.nesterovich5_2.b3;

import hometasks.nesterovich5_2.b4.Flying;

public class Goose extends HomeBird implements Flying {
    @Override
    public void voice() {
        super.voice();
        System.out.println("га-га");
    }

    @Override
    public void fly() {
        System.out.println("Гусь летает");
    }
}
