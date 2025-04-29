import java.util.Scanner;
import java.util.Arrays;
class IndexOnEvenPos{
		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int n=s.nextInt();

			int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
		
			for(int i=0;i<arr.length;i++){
				if(i%2==0){
					System.out.print(arr[i]+"  ");		
				}
			}
			

}
}