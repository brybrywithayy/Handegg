package games.gainsay;

public class Scorer extends Player {

    public Scorer() {
        super();
        this.position = PlayerPositionType.SCORER;
        this.speed = generateRandomInt(99, 50);
        this.strength = generateRandomInt(99, 40);
        this.stamina = generateRandomInt(99, 50);
        this.agility = generateRandomInt(99, 50);
        this.blocking = generateRandomInt(65, 15);
        this.catching = generateRandomInt(90, 45);
        this.tackling = generateRandomInt(70, 1);
        this.throwing = generateRandomInt(75, 1);
        this.kicking = generateRandomInt(50, 1);
    }

    public Scorer(String name, String college, PlayerPositionType position, int age, int speed,
                  int strength, int stamina, int catching, int blocking, int tackling, int agility,
                  int throwing, int kicking) {
        super(name, college, position, age, speed, strength, stamina, catching, blocking, tackling,
              agility, throwing, kicking);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", position=" + position +
               ", speed=" + speed +
               ", strength=" + strength +
               ", stamina=" + stamina +
               ", tackling=" + tackling +
               ", blocking=" + blocking +
               ", catching=" + catching +
               ", agility=" + agility +
               ", throwing=" + throwing +
               ", kicking=" + kicking +
               '}';
    }
}
