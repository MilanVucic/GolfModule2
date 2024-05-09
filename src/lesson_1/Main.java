package lesson_1;

import lesson_1.simple_game.*;
import lesson_1.simple_game.Character;

public class Main {
    public static void main(String[] args) {
        Character c1 = new FlyingCharacter("Bird Flier");
        Character c2 = new GroundCharacter("Warrior");
        Character c3 = new SwimmingCharacter("Dolphin");
        c1.move(1,1, TileType.WATER);
        c2.move(1,1, TileType.GROUND);
        c3.move(1,1, TileType.GROUND);
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static double max(double a, double b) {
        return a > b ? a : b;
    }
}