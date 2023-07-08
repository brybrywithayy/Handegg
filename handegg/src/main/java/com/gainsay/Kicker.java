package com.gainsay;

public class Kicker extends Player {

    public Kicker() {
        super();
        this.position = PlayerPositionType.KICKER;
        this.speed = generateRandomInt(90, 1);
        this.strength = generateRandomInt(99, 25);
        this.stamina = generateRandomInt(99, 25);
        this.agility = generateRandomInt(50, 1);
        this.blocking = generateRandomInt(50, 1);
        this.catching = generateRandomInt(50, 1);
        this.tackling = generateRandomInt(60, 1);
        this.throwing = generateRandomInt(80, 1);
        this.kicking = generateRandomInt(99, 60);
    }

    public Kicker(String name, String college, PlayerPositionType position, int age, int speed,
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
