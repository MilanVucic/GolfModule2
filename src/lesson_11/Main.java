package lesson_11;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(50);
        tree.add(25);
        tree.add(75);
        tree.add(13);
        tree.add(10);
        tree.add(22);
        tree.add(44);
        tree.add(88);
        tree.add(65);
        tree.add(62);
        System.out.println(tree.contains(88));
        System.out.println(tree.contains(100));
        System.out.println(tree.contains(62));
        System.out.println(tree.contains(65));
        System.out.println(tree.contains(33));
    }
}
