package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int center = (int) (sideLength/2f + ((sideLength%2==0)?0:0.5));
        for(int x=1;x<=sideLength;x++)
        {
            for (int y=1;y<=sideLength;y++)
            {
                if (y==center||x==center)
                    System.out.print(8);
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
