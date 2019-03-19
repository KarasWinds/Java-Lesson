/*
某一公司有五種產品A、B、C、D與E，其單價分別為12、16、10、14與15元；
而該公司共有三位銷售員，他們在某月份的銷售數量如下所示:
銷售員	產品A	產品B	產品C	產品D	產品E
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
		String [] salename = {"銷售員1","銷售員2","銷售員3"};
		String [] itemname = {"產品A","產品B","產品C","產品D","產品E"};
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
		System.out.println("a.每一個銷售員的銷售總金額?");
		System.out.println("銷售員1:" + sales[0] + "元");
		System.out.println("銷售員2:" + sales[1] + "元");
		System.out.println("銷售員3:" + sales[2] + "元");
		System.out.println("b.每一項產品的銷售金額?");
		System.out.println("產品A:" + item[0] + "元");
		System.out.println("產品B:" + item[1] + "元");
		System.out.println("產品C:" + item[2] + "元");
		System.out.println("產品D:" + item[3] + "元");
		System.out.println("產品E:" + item[4] + "元");
		System.out.println("c.有最好業績（銷售總金額最多者）的銷售員?");
		System.out.println(salename[sanM]);
		System.out.println("d.銷售總金額最多的產品?");
		System.out.println(itemname[itnM]);
	}

}
