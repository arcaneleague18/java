class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 3;
        int val = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                val = i;
            }
        }
        for(int i = val; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        for(int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }
}
