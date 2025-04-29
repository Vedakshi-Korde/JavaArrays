import java.util.Scanner;
class SearchIndexofElement{

		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			
			System.out.println("Enter element to find index of enterd number");
			int index=s.nextInt();

			for(int i=0;i<arr.length;i++){
				if(index==arr[i]){
					System.out.print("Element" +index+ "found at index" +i);
					
				}
			}
		}

	}