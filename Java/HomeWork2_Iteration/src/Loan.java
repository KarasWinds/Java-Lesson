/*
������H100000�����O�V�Ȧ�B��Q�M�a�U�����ɶU�C
�Y�Ȧ檺�~�Q�v��20%�A��Q��Q�v��10%�M�a�U������Q�v��1%�C
�H�묰���A�p��@�Ӥ��ܤ@�~��C�Ӥ���k�٦h�ֿ��C
 */
public class Loan {

	public static void main(String[] args) {
		double money = 100000; //�U�ڪ��B
		double p1 = 0.2/12; //�Ȧ�~�Q�v��20%
		double p2 = 0.1; //��Q��Q�v��10% 
		double p3 = 0.01*30; //�a�U������Q�v��1%
		for (int i = 1; i<=12; i++) {
			double A = 0, B = 0, C = 0;
			A = money * (1 + p1 * i) ;
			B = money * (1 + p2 * i) ;
			C = money * (1 + p3 * i) ;
			System.out.println("��" + i + "�Ӥ�," + "�Ȧ�n��" + (int)A + "��," + "��Q�n��" + (int)B + "��," + "�a�U�����n��" + (int)C + "��");
		}
			

	}

}
