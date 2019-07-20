import java.util.Scanner;

class Main {
   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" masukkan harga makanan: ");
		int a = in.nextInt();
		System.out.println(
				" apakah kode Voucher? (tulis 'ARKAFOOD5' atau ‘DITRAKTIRDEMY jika ada. jika tidak ketik'false' ) ");
		String b = in.next();
		System.out.println(" masukkan jarak:(dalam KM) ");
		int c = in.nextInt();

		System.out.println(" apakah ada pajak? (true/false): ");
		boolean d = in.nextBoolean();
		String FALSE = "false";
		String F = "ARKAFOOD5";
		String G = "DITRAKTIRDEMY";
		int e, sum;

		if (c - 1.5 >= 0) {
			e = (int) (5000 + (c - 1.5) * 3000);
	
			if (b.equals(FALSE) && d == false) {
				sum = a + e;
				System.out.println(sum);
			}
			else if (b.equals(FALSE) && b != "false") {
				sum = (int) (a + e + a * 0.05);
				System.out.println(sum);
			} else if (a >= 50000) {
				if (b.equals(F) && d == false) {
					sum = (int) (a + e + 0.5 * a);
					System.out.println(sum);
				} else if (b.equals(F) && d != false) {
					sum = (int) (a + e + 0.5 * a + 0.05 * a);
					System.out.println(sum);
				}
			}
			else if (a >= 25000) {
				if (b.equals(G) && d == false) {
					sum = (int) (a + e + 0.6 * a);
					System.out.println(sum);
				} else if (b.equals(G) && d != false) {
					sum = (int) (a + e + 0.6 * a + 0.05 * a);
					System.out.println(sum);
				}
			}
		}
	}
}
