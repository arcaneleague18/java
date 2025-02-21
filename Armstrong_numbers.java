public class Armstrong_numbers{
    public static void main(String args[]){
        for(int i=1;i<1000;i++){
            int temp=i,temp1=i,r=0,c=0;
            while(temp!=0){
                temp%=10;
                c+=1;
            }
            System.out.println("c is taken");
            while(temp1!=0){
                int k = temp1%10;
                r+=(k*c);
            }
            System.out.println("r is calculated");
            if(i==r){
                System.out.println(i);
            }
        }

    }
}