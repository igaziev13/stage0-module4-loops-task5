package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void printTriangle(int cathetusLength) {
        for(int x=1;x<=cathetusLength;x++) {
            for (int y = 1; y <= cathetusLength; y++) {
                if (x>=y||y==1||x==cathetusLength)
                    System.out.print(8);
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    {
        printTriangle(2);
    }
}
