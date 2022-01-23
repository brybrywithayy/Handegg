package games.gainsay;

public class Leader extends Player {

    public Leader() {
        super();
        this.position = PlayerPositionType.LEADER;
        this.speed = generateRandomInt(95, 1);
        this.strength = generateRandomInt(99, 25);
        this.stamina = generateRandomInt(99, 50);
        this.agility = generateRandomInt(50, 1);
        this.blocking = generateRandomInt(30, 1);
        this.catching = generateRandomInt(70, 1);
        this.tackling = generateRandomInt(70, 1);
        this.throwing = generateRandomInt(99, 55);
        this.kicking = generateRandomInt(80, 1);
    }

    public Leader(String name, String college, PlayerPositionType position, int age, int speed,
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

    // TODO code Leader behaviors
}
