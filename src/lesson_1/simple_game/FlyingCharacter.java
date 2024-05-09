package lesson_1.simple_game;

public class FlyingCharacter extends Character {
    public FlyingCharacter(String name) {
        super(name);
    }

    @Override
    public void move(int newX, int newY, TileType tile) {
        if (tile == TileType.WALL) {
            throw new CannotMoveException();
        }
        setNewPosition(newX, newY);
    }
}
