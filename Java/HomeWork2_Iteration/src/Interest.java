/*
���르�H10%��Q���100000���A�q�Ӻ�h�H5%�ƧQ���100000���C
�p��h�֦~��q�Ӻ⪺���i�H�W�L���르�A�ñN���ɨ�H���ƦL�X�C
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
		System.out.println(n + "�~��");
		System.out.println("���르��" + (int)mAa + "��");
		System.out.println("�q�Ӻ⦳" + (int)mBa + "��");
	}

}
