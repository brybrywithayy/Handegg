package games.gainsay;

public class Defender extends Player {

    public Defender() {
        super();
        this.position = PlayerPositionType.DEFENDER;
        this.speed = generateRandomInt(99, 1);
        this.strength = generateRandomInt(99, 25);
        this.stamina = generateRandomInt(99, 50);
        this.agility = generateRandomInt(75, 1);
        this.blocking = generateRandomInt(70, 1);
        this.catching = generateRandomInt(99, 1);
        this.tackling = generateRandomInt(99, 60);
        this.throwing = generateRandomInt(50, 1);
        this.kicking = generateRandomInt(50, 1);
    }

    public Defender(String name, String college, PlayerPositionType position, int age, int speed,
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
