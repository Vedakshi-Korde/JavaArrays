import java.util.Scanner;
class LinearSearchofElements{

		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			
			System.out.println("Enter element you want to search: ");
			int search=s.nextInt();
			
			boolean found=false;
			for(int i=0;i<arr.length;i++){
				if(search==arr[i]){
					System.out.println("Element found at index " +i);
					found = true;
					break;
				}
			
			}
			if(!found){
					System.out.println("Element not found at index ");		
				}
		}
}