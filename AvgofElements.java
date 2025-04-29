import java.util.Scanner;
class AvgofElements{

		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}	
			
			int sum=0;
			for(int i=0;i<arr.length;i++){
				sum=sum+arr[i];
			}
			int avg=sum/n;
			System.out.println("Average is "+avg);
		}
}	