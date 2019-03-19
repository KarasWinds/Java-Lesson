/*
錢不精以100000元分別向銀行、當鋪和地下錢莊借貸。
若銀行的年利率為20%，當鋪月利率為10%和地下錢莊日利率為1%。
以月為單位，計算一個月後至一年後每個月該歸還多少錢。
 */
public class Loan {

	public static void main(String[] args) {
		double money = 100000; //貸款金額
		double p1 = 0.2/12; //銀行年利率為20%
		double p2 = 0.1; //當鋪月利率為10% 
		double p3 = 0.01*30; //地下錢莊日利率為1%
		for (int i = 1; i<=12; i++) {
			double A = 0, B = 0, C = 0;
			A = money * (1 + p1 * i) ;
			B = money * (1 + p2 * i) ;
			C = money * (1 + p3 * i) ;
			System.out.println("第" + i + "個月," + "銀行要還" + (int)A + "元," + "當鋪要還" + (int)B + "元," + "地下錢莊要還" + (int)C + "元");
		}
			

	}

}
