/*
�Y�@���q�����ز��~A�BB�BC�BD�PE�A�������O��12�B16�B10�B14�P15���F
�ӸӤ��q�@���T��P����A�L�̦b�Y������P��ƶq�p�U�ҥ�:
�P���	���~A	���~B	���~C	���~D	���~E
	1	33		32		56		45		33
	2	77		33		68		45		23
	3	43		55		43		67		65
 */
public class Sales {

	public static void main(String[] args) {
		int [][] data = {{33,32,56,45,33},{77,33,68,45,23},{43,55,43,67,65}};
		int [] itemsale = {12,16,10,14,15};
		int [] sales = new int [data.length];
		int [] item = new int [data[1].length];
		String [] salename = {"�P���1","�P���2","�P���3"};
		String [] itemname = {"���~A","���~B","���~C","���~D","���~E"};
		int sanM = 0;
		int itnM = 0;
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[i].length; j++) { 
				data[i][j] *= itemsale[i];
				sales[i] += data[i][j];
				item[j] += data[i][j];
			}
		for (int i = 1; i < (sales.length - 1); i++) {
			int saM = sales[0];
			if (saM < sales[i]) {
				saM = sales[i];
				sanM = i;
			}
		}
		for (int i = 1; i < (item.length - 1); i++) {
			int itM = item[0];
			if (itM < item[i]) {
				itM = item[i];
				itnM = i;
				}
		}
		System.out.println("a.�C�@�ӾP������P���`���B?");
		System.out.println("�P���1:" + sales[0] + "��");
		System.out.println("�P���2:" + sales[1] + "��");
		System.out.println("�P���3:" + sales[2] + "��");
		System.out.println("b.�C�@�����~���P����B?");
		System.out.println("���~A:" + item[0] + "��");
		System.out.println("���~B:" + item[1] + "��");
		System.out.println("���~C:" + item[2] + "��");
		System.out.println("���~D:" + item[3] + "��");
		System.out.println("���~E:" + item[4] + "��");
		System.out.println("c.���̦n�~�Z�]�P���`���B�̦h�̡^���P���?");
		System.out.println(salename[sanM]);
		System.out.println("d.�P���`���B�̦h�����~?");
		System.out.println(itemname[itnM]);
	}

}
