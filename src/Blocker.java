package games.gainsay;

public class Blocker extends Player {

    public Blocker() {
        super();
        this.position = PlayerPositionType.BLOCKER;
        this.speed = generateRandomInt(80, 1);
        this.strength = generateRandomInt(99, 65);
        this.stamina = generateRandomInt(99, 50);
        this.agility = generateRandomInt(80, 45);
        this.blocking = generateRandomInt(99, 60);
        this.catching = generateRandomInt(50, 1);
        this.tackling = generateRandomInt(85, 1);
        this.throwing = generateRandomInt(50, 1);
        this.kicking = generateRandomInt(50, 1);
    }

    public Blocker(String name, String college, PlayerPositionType position, int age, int speed,
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
