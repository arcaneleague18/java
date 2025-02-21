public class Insert_value{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,6,7,8,9};
        int arr_cpy[] = new int[10],val = 5, index = 4;

        System.arraycopy(arr, 0, arr_cpy, 0, index-1);
        arr_cpy[index-1] = val;
        System.arraycopy(arr, index,arr_cpy,index+1,9-index-1);
        System.out.println("Array after deletion: ");
        for(int i=0;i<9;i++){
            System.out.println(arr_cpy[i]);
        }
    }
}