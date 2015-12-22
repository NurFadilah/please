import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Hari{
public static void main(String[] args){
BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
String HR;
int Har = Integer.parselnt(args[1]);
	Switch(Hari)
	{
		case 1;
			System.out.print(senin);
		break;

		case 2;
			System.out.print(selasa);
		break;

		case 3;
			System.out.print(rabu);
		break;

		case 4;
			System.out.print(kamis);
		break;

		case 5;
			System.out.print(jumat);
		break;

	
		case 6;
			System.out.print(sabtu);
		break;

		case 7;
			System.out.print(minggu);
		break;
try{
 Har=dataIn.readLine();
}
catch(IOException e){
System.out.println("Error getting input!");
}
}cd