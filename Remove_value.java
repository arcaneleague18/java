public class Remove_value{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9},n=5;
        int arr_cpy[] = new int[9],f=4;

        System.arraycopy(arr, 0, arr_cpy, 0, f);
        System.arraycopy(arr, f+1,arr_cpy,f, 9-f-1);
        System.out.println("Array after deletion: ");
        for(int i=0;i<8;i++){
            System.out.println(arr_cpy[i]);
        }
    }
}