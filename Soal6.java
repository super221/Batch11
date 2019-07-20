import java.util.Scanner;

class Main {
     public static  void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		   int s ;
		   System.out.println("Masukkan Metode, Nilai Maksimal(N), Array Digit(k): ");
		   System.out.print("input");
		   String a = input.nextLine();

		   String[] A = a.split(",");
		   
		   String b = (A[0]);
		   int N = Integer.parseInt(A[1]);
		   String[] F = A[2].split(" ");
		   int D1 = Integer.parseInt(F[0]);
		   int D2 = Integer.parseInt(F[1]);
		   int D3 = Integer.parseInt(F[2]);
		   String H = "'SUM'";
		   String G = "'MUL'";
		   String I = "'SUB'";
		   String J = "'DIV'";
		   int x = ((D1-(N/2))/2);
		   int y = ((D2-(N/2))/2);
		   int z = ((D3-(N/2))/2);
		   
		   if (N<=1000) {
			
		   if (b.equals(H)) {
			   s = x +y +z;
			   System.out.println("Maka hasilnya :" + s );
			  }
		   else if (b.equals(G)) {
               s = x * y *z;		
               System.out.println("Maka hasilnya :" + s );
		}
		   else if (b.equals(I)) {
               s = x - y -z;		
               System.out.println("Maka hasilnya :" + s );
		}
		   else if (b.equals(J)) {
               s = x / y /z;	
               System.out.println("Maka hasilnya :" + s );
		}
		   
		   }
           }
	}
