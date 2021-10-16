package trial_package;

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_arr=new int[100];
		for(int i=1;i<=100;i++) {
			if(i==90)
				continue;
			num_arr[i-1]=i;
		}
		
		
		System.out.println(missingNumber(num_arr));
		
	}
	private static int missingNumber(int[] num_arr) {
		int[] temp=new int[100];
		int missing=0;
		for(int i:num_arr) {
			if(i==0)
				continue;
			temp[i-1]=i;
		}
		for(int i=0;i<temp.length;i++) {
			if(temp[i]==0)
				missing=i+1;
		}
		return missing;
	}

}
