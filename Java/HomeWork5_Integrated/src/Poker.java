
public class Poker {
	public static String[] pokerArray = Poker.pokerArray();

	private static String[] pokerArray() {
		String[] A = new String[52];
		int i = 0;
		while (i < A.length) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 13; k++) {
					switch (j) {
					case 1:
						A[i] = "pi" + k;
						i++;
						break;

					case 2:
						A[i] = "co" + k;
						i++;
						break;

					case 3:
						A[i] = "tr" + k;
						i++;
						break;

					case 4:
						A[i] = "ca" + k;
						i++;
						break;

					}

				}

			}

		}

		return A;
	}

	private static String[] pokerRandom(String[] poker) {
		String[] result = poker;
		for (int i = 0;i < result.length;i++) {
			int index = (int)(Math.random() * result.length);
			String tmp = result[index];
			result[index] = result[i];
			result[i] = tmp;
		}
		return result;
	}

	public static void main(String[] args) {
		//System.out.println(Poker.pokerArray[0]);
		String[] T = Poker.pokerRandom(Poker.pokerArray);
		//System.out.println(Poker.pokerArray[0]);
		String[] player1 = new String[13];
		String[] player2 = new String[13];
		String[] player3 = new String[13];
		String[] player4 = new String[13];
		int n = 0;
		while (n < 13) {
			player1[n] = T[4 * n];
			player2[n] = T[4 * n+1];
			player3[n] = T[4 * n+2];
			player4[n] = T[4 * n+3];
			n++;
		}
		
	}

}
