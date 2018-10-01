import java.util.Scanner;


public class ArrayBoolean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/////// Tipe Data Array Boolean \\\\\\\
		

		
		Scanner SC = new Scanner(System.in);

				//mendaklarasikan variabel
				boolean yakin []= {true,false,true,false};
				{
				//operasi menggunakan variabel
				if (yakin[0]==true){
				
				//menampilkan operasi menggunakan variabel
					System.out.println("Good");}
				else {
					System.out.println("Bad");}
				//melakukan inisialisasi menggunakan input dari keyboard
					System.out.print("Yakin : ");
				Scanner sc = new Scanner (System.in);
				boolean input=sc.nextBoolean();
				if (input=true){
					System.out.println("Good");}
				else {
					System.out.println("Bad");}	
				}
	}
}
