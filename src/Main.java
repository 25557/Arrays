import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        int[] chunkList = new int[5];

        chunkList[0] = 123;
        chunkList[1] = 35;
        chunkList[2] = 999;
        chunkList[3] = 5430;
        chunkList[4] = 64;

        int[] getallenReeks = {4, 856, 123, 42, 58};

        System.out.println( Arrays.toString(getallenReeks) );

        Arrays.copyOf(getallenReeks, getallenReeks.length + 1);

        Scanner scan = new Scanner(System.in);

        getallenReeks[getallenReeks.length - 1] = scan.nextInt();

        System.out.println( Arrays.toString(getallenReeks) );
    }
}
