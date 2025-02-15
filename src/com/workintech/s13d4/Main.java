package com.workintech.s13d4;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        Point p1 = new Point(4, 5);

        Point p2 = null;

        System.out.println(p1.distance(p2));

        Player player1 = new Player("elf", 20, Weapon.PINK);

        System.out.println(player1);
        player1.loseHealth(30);
        System.out.println(player1.healthRemaining());
    }
}