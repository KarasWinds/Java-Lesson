/*
錢精打以10%單利投資100000元，郝細算則以5%複利投資100000元。
計算多少年後郝細算的投資可以超過錢精打，並將此時兩人錢數印出。
 */


public class Interest {

	public static void main(String[] args) {
		int n = 0;
		double mA = 100000;
		double mB = 100000;
		double pA = 0.1;
		double pB = 0.05;
		double mAa;
		double mBa;		
		do {
			n++;
			mAa = mA * (1 + pA * n);
			mBa = mB * Math.pow(1 + pB, n);
		} while (mBa <= mAa);
		System.out.println(n + "年後");
		System.out.println("錢精打有" + (int)mAa + "元");
		System.out.println("郝細算有" + (int)mBa + "元");
	}

}
