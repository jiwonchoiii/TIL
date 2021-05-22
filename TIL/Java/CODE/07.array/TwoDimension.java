package array;

public class TwoDimension {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3}, {4,5,6}};
		
		System.out.println("행의 갯수: "+arr.length);		
		System.out.println("열의 갯수: "+arr[0].length);	// =arr[1].length = arr[2].length
		
	
		for(int i = 0 ; i <arr.length; i++) {
			for(int j = 0 ; j <arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();			// 한 행 출력 끝난 후 한 줄 띄움
	}
	}
}
