import java.util.Scanner;

public class Baris{
	public static void main (String[] args){
	
	int siswa,max,baris,sisa;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Jumlah siswa                = ");
	siswa=input.nextInt();
	System.out.print("Jumlah max siswa @baris     = ");
	max=input.nextInt();
	
	baris=siswa/max;
	System.out.println("Jumlah baris                = "+baris);
	sisa=siswa%max;
	System.out.println("Jumlah siswa baris terkahir = "+sisa);
	}
}
	