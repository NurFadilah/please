import java.util.Scanner;

public class Mudik{
	public static void main(String[] args){
	
	int tot,gigi1,gigi2,gigi3,jarak1,jarak2,jarak3,ttot,t1,t2,t3,v=0;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Jarak Total    = ");
	tot=input.nextInt();
	System.out.print("Masukan gigi1  = ");
	gigi1=input.nextInt();
	System.out.print("Masukan jarak1 = ");
	jarak1=input.nextInt();
	if(gigi1==1){v=40;}
	if(gigi1==2){v=60;}
	if(gigi1==3){v=80;}
	if(gigi1==4){v=100;}
	t1=jarak1/v;
	System.out.print("Masukan gigi2  = ");
	gigi2=input.nextInt();
	System.out.print("Masukan jarak2 = ");
	jarak2=input.nextInt();
	if(gigi2==1){v=40;}
	if(gigi2==2){v=60;}
	if(gigi2==3){v=80;}
	if(gigi2==4){v=100;}
	t2=jarak2/v;
	System.out.print("Masukan gigi3  = ");
	gigi3=input.nextInt();
	if(gigi3==1){v=40;}
	if(gigi3==2){v=60;}
	if(gigi3==3){v=80;}
	if(gigi3==4){v=100;}
	jarak3=tot-(jarak1+jarak2);
	t3=jarak3/v;
	
	ttot=t1+t2+t3;
	System.out.print("Waktu sampai   = "+ttot);
	}
}
	
	