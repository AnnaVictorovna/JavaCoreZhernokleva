package hometasks.lesson7.b2;

public class Circus {
    private String name;
    private Bear bear;
    private Elephant elephant;
    private Horse horse;
    private String whatBearCanDo;
    private String whatElephantCanDo;
    private String whatHorseCanDo;

    public Circus(String name, String whatBearCanDo, String whatElephantCanDo, String whatHorseCanDo) {
        this.name = name;
        this.whatBearCanDo = whatBearCanDo;
        this.whatElephantCanDo = whatElephantCanDo;
        this.whatHorseCanDo = whatHorseCanDo;
    }

    class Bear {
        public void iCan() {
            System.out.println("я умею ходить");
        }
    }

    class Elephant {
        public void iCan() {
            System.out.println("я умею ходить");
        }
    }

    class Horse {
        public void iCan() {
            System.out.println("я умею ходить");
        }
    }

}
