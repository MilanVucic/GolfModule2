package lesson_1.simple_game;

public class GroundCharacter extends Character{
    public GroundCharacter(String name) {
        super(name);
    }

    @Override
    public void move(int newX, int newY, TileType tile) {
        if (tile != TileType.GROUND) {
            throw new CannotMoveException();
        }
        setNewPosition(newX, newY);
    }
}
