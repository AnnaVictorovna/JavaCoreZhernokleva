package hometasks.nesterovich5_2.b3;

import hometasks.nesterovich5_2.b4.Flying;

public class Duck extends StreetBird implements Flying {
    @Override
    public void voice() {
        super.voice();
        System.out.println("кря");
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }
}
