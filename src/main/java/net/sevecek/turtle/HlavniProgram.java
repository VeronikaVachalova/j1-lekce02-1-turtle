package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

//slunicko
        zofka.setLocation(100, 80);

        for (int i = 0; i < 355; i++) {
            zofka.turnRight(1);
            zofka.move(1);
        }
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(90);

        for (int i = 0; i < 50; i++) {
            zofka.turnLeft(1);
            zofka.move(1);
        }
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(90);

        for (int i = 0; i < 50; i++) {
            zofka.turnLeft(1);
            zofka.move(1);
        }
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(90);

        for (int i = 0; i < 50; i++) {
            zofka.turnLeft(1);
            zofka.move(1);
        }
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(90);

        for (int i = 0; i < 50; i++) {
            zofka.turnLeft(1);
            zofka.move(1);
        }
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(90);

        for (int i = 0; i < 50; i++) {
            zofka.turnLeft(1);
            zofka.move(1);
        }
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(90);

        for (int i = 0; i < 50; i++) {
            zofka.turnLeft(1);
            zofka.move(1);
        }
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(90);

//domecky
        zofka.setLocation(100,270);
        zofka.turnLeft(235);
        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(40);
        zofka.turnRight(100);
        zofka.move(40);

        zofka.penUp();
        zofka. move(55);
        zofka.turnLeft(145);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(40);
        zofka.turnRight(100);
        zofka.move(40);

        zofka.penUp();
        zofka. move(55);
        zofka.turnLeft(145);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(40);
        zofka.turnRight(100);
        zofka.move(40);

        zofka.penUp();
        zofka. move(55);
        zofka.turnLeft(145);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(40);
        zofka.turnRight(100);
        zofka.move(40);

        zofka.penUp();
        zofka. move(55);
        zofka.turnLeft(145);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(40);
        zofka.turnRight(100);
        zofka.move(40);

        zofka.penUp();
        zofka. move(55);
        zofka.turnLeft(145);

        zofka.turnLeft(90);
        zofka.move(420);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(40);
        zofka.turnRight(100);
        zofka.move(40);

        zofka.penUp();
        zofka. move(55);
        zofka.turnLeft(145);
        zofka.penDown();

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(260);
        zofka.turnLeft(90);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(40);
        zofka.turnRight(100);
        zofka.move(40);

        zofka.penUp();
        zofka. move(75);
        zofka.turnLeft(145);

        zofka.turnLeft(90);
        zofka.move(260);

        zofka.turnRight(90);
        zofka.penDown();

    }
}