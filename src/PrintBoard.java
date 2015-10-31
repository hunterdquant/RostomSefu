public class PrintBoard {

    public static void main(String[] args) {
        int x = 5;
        int y = 5;

        Board b = new Board(x,y,5,5,5);

        for (int i = 0; i < x; i++) {
            System.out.println();
            for (int j = 0; j < y; j++) {
                System.out.println(b.getNode(i,j));
            }
        }
        System.out.println("end");
        System.exit(0);
    }

}
