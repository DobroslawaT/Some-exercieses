import java.util.Scanner;
public class statki {
	
	int ileStatk�w4=0;
	int ileStatk�w3=0;
	int ileStatk�w2=0;
	int ileStatk�w1=0;
	char [][] table;
	char[][] startGame() {
	//creates a playing table
	table=new char[10][10];
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++) {
			table[i][j]=' ';
		}
	}
	return table;
}


char[][] addANewShip(int length, int xCoord, int yCoord)
{
	//nowy instance klasy dla skanowania variables
	Scanner scan=new Scanner(System.in);
	//koordynaty dodatkowe
	int xCoord1;
	int yCoord1;
	switch (length){	
	case 1:
		//Sprawdza, czy nie ma za du�o statk�w
		if(ileStatk�w1<4) {

			table[xCoord][yCoord]='*';
			ileStatk�w1++;
		}
		else if(ileStatk�w1>=4)
		{

			System.out.println("Ju� masz wszystkie pojedyncze statki, spr�buj jeszcze raz");
		}
	break;
	case 2:
		if(ileStatk�w2<3) {
			System.out.println("Dodaj koordynaty ko�ca staku");
			xCoord1=scan.nextInt();
			yCoord1=scan.nextInt();
			table[xCoord][yCoord]='*';
			table[xCoord1][yCoord1]='*';
			ileStatk�w2++;
		}
		else if(ileStatk�w1>=4)
		{

			System.out.println("Ju� masz wszystkie podw�jne statki, spr�buj jeszcze raz");
		}
		break;
	case 3:
		if(ileStatk�w3<2) {
		System.out.println("Dodaj koordynaty ko�ca staku");;
		xCoord1=scan.nextInt();
		yCoord1=scan.nextInt();
		if(xCoord==xCoord1&&((yCoord+yCoord1)%2==0))
		{
			table[xCoord][yCoord]='*';
			table[xCoord1][yCoord1]='*';
			table[xCoord][(yCoord+yCoord1)/2]='*';
			ileStatk�w3++;
		}
		else if(yCoord==yCoord1&&(xCoord+xCoord1)%2==0){
		table[xCoord][yCoord]='*';
		table[xCoord][yCoord]='*';
		table[(xCoord+xCoord1)/2][yCoord]='*';
		ileStatk�w3++;
		
	}
		else {
			System.out.println("Z�e koordynaty");
		}
		}
		else
		{
			System.out.println("Ju� masz wszystkie podw�jne statki, spr�buj jeszcze raz");
		}
	break;
	
	case 4:
		if(ileStatk�w4<1) {
		System.out.println("Dodaj koordynaty ko�ca staku");
		xCoord1=scan.nextInt();
		yCoord1=scan.nextInt();
		if(xCoord==xCoord1&&((yCoord-yCoord1)%2==0))
		{
			table[xCoord][yCoord]='*';
			table[xCoord1][yCoord1]='*';
			if(yCoord<yCoord1)
			{
				yCoord++;
				table[xCoord][yCoord]='*';
				yCoord++;
				table[xCoord][yCoord]='*';
			}
			else
			{
				yCoord--;
				table[xCoord][yCoord]='*';
				yCoord--;
				table[xCoord][yCoord]='*';
			}
			ileStatk�w4++;
		}
		else if(yCoord==yCoord1&&(xCoord-xCoord1)%2==0){
		table[xCoord][yCoord]='*';
		table[xCoord][yCoord]='*';
		if(xCoord<xCoord1)
		{
			xCoord++;
			table[xCoord][yCoord]='*';
			xCoord++;
			table[xCoord][yCoord]='*';
			ileStatk�w4++;
		}
		else if (xCoord>xCoord1)
		{
			xCoord--;
			table[xCoord][yCoord]='*';
			xCoord--;
			table[xCoord][yCoord]='*';
			ileStatk�w4++;
		}
		}
		else {
			System.out.println("Z�e koordynaty");
		}
		}
		else
		{
			System.out.println("Ju� masz wszystkie podw�jne statki, spr�buj jeszcze raz");
		}
		break;


default:
	System.out.println("Taki statek nie istnieje");	
	break;
	}
		return table;
		
}

int markAShip() {
	return 0;
}

int printYourTable() 
{
	return 0;
}
int printWhatYouMarked()
{
	return 0;
}
}
