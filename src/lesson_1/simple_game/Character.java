package lesson_1.simple_game;

public abstract class Character {
    protected int x, y;
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public abstract void move(int newX, int newY, TileType tile);

    protected void setNewPosition(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}
