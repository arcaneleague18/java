public class Palindrome{
	public static void main(String args[]){
		int a= 12345, res=0;
		int t=a;
		while(t!=0){
			int k=a%10;
			t=t/10;
			res*=10;
			res+=k;
		}
		if(res==a){
			System.out.println(a+" is a palindrome");
		}
		else{
			System.out.println(a+" is not a palindrome");
		}
	}
}