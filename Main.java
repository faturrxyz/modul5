public class Main {
    public static void main(String[] args) {
        binarytree pohon = new binarytree();

        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);

        System.out.print("\npre order : ");
        pohon.preOrder(pohon.root);
        System.out.print("\nin order : ");
        pohon.inOrder(pohon.root);
        System.out.print("\npost order : ");
        pohon.preOrder(pohon.root);
    }
}