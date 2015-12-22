import java.util.Scanner;

public class Kotak{
	public static void main(String[] args){
	
	int tot,biru,merah,putih,selisih=0;
	Scanner input = new Scanner(System.in);
	System.out.print("Total bola  [10-100] = ");
	tot=input.nextInt();
	System.out.print("Bola Biru     [5-50] = ");
	biru=input.nextInt();
	System.out.print("Bola Merah    [5-50] = ");
	merah=input.nextInt();
	
	putih=tot-(biru+merah);
	if(putih!=merah && putih>merah){selisih=putih-merah;}
	if(putih!=merah && merah>putih){selisih=merah-putih;}
	if(putih==merah){selisih=0;}
	
	System.out.println("Bola Putih           = "+putih);
	System.out.println("Bola yg dikeluarkan  = "+selisih);
	}
}
	