package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int i, j;
        //Top part of the hourglass
        for (i=1;i<=height;i=i+2)
        {
            for (j=1;j<i;j=j+2)
                System.out.print(" ");

            for (j=0;j<=height-i;j++)
                System.out.print(8);
            //Actually the following part is not necessary, but it is required by Test application
            for (j=1;j<i;j=j+2)
                System.out.print(" ");

            System.out.println();
        }
        //Bottom part of the hourglass
        for (i=(height%2==0?2:3);i<=height;i=i+2)
        {
            for (j=1;j<=height-i;j=j+2)
                System.out.print(" ");

            for (j=1;j<=i;j++)
                System.out.print(8);
            //Actually the following part is not necessary, but it is required by Test application
            for (j=1;j<=height-i;j=j+2)
                System.out.print(" ");

            System.out.println();
        }
    }
}
