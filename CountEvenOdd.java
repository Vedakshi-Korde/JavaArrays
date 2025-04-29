import java.util.Scanner;
class CountEvenOdd{
		public static void main(String args[]){

			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			int arr[]=new int[n];
			
			int ceven=0;
			int codd=0;   

			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
		
			for(int i=0;i<arr.length;i++){
				if(arr[i]%2==0){
					ceven++;
				}
				else{
					codd++;
				}
			}
			System.out.println("Total number of even numbers are : " +ceven);
			System.out.println("Total number of odd numbers are : " +codd);
		}
	
}