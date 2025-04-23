public class Matrix{
    public static void main(String args[]){
        int m[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            int sum_row=0;
            for(int j=0;j<3;j++){
                sum_row+=m[i][j];
            }
            System.out.println("sum of row "+(i+1)+": "+sum_row);
        }

        for(int j=0;j<3;j++){
            int sum_col=0;
            for(int i=0;i<3;i++){
                sum_col+=m[i][j];
            }
            System.out.println("sum of column "+(j+1)+": "+sum_col);
        }
    }
}