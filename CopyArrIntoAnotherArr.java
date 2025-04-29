import java.util.Scanner;
import java.util.Arrays;
class CopyArrIntoAnotherArr{
		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int n=s.nextInt();

			int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}

			int arr2[]=new int[n];

			for(int i=0;i<arr.length;i++){
				arr2[i]=arr[i];
			}	
			System.out.println("Copied array elements");
			System.out.println(Arrays.toString(arr2));
	}
}