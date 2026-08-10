package Number_Programimg;

public class Fibonnacci {

	public static void main(String[] args) {
		int fn=0;
		int sn=1;
		int tsum=0;
		for(int i=1;i<=10;i++) {
			System.out.print(fn+ " ");
			tsum=fn+sn;
			fn=sn;
			sn=tsum;
		}

	}

}
