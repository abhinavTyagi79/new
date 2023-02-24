public class tear {
    public static void main(String[] args)
    {
        int s [][][]= new int[3][5][6];
        int row;
        int col;
        int z;

        for (row=0; row <=3; row++)
        {
            System.out.println( "Number of row="+ row);
            for (col = 0; col <=5; col++)
            {
               // System.out.println(s[row][col]);
                for (z = 0; z <=6; z++)
               System.out.println(row+""+col+""+z);
            }
           // System.out.println();
        }
    }
}
