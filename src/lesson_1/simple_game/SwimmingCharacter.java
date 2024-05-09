package lesson_1.simple_game;

public class SwimmingCharacter extends Character{
    public SwimmingCharacter(String name) {
        super(name);
    }

    @Override
    public void move(int newX, int newY, TileType tile) {
        if (tile != TileType.WATER) {
            throw new CannotMoveException();
        }
        setNewPosition(newX, newY);
    }
}
