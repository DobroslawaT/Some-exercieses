import java.util.Scanner;
public class mainClass {
public static void main(String[] args) {
		String a="Mama";
		a=a.toUpperCase();
		System.out.println(a);
		a=a.toLowerCase();
		System.out.println(a);
		
		//Nie wiem o co goœciowi chodzi³o z tym kopiowaniem, ale tu jest kopiowanie
		//a litera po literze
		char[] ch=new char[a.length()];
		Scanner scan=new Scanner(System.in);
        for (int i = 0; i < a.length(); i++) {
            ch[i] = a.charAt(i);}
        for (char c : ch) {
            System.out.println(c);
        } 
        //a tu u¿ytkownik dodaje litery i siê to koñczy, jak naciœnie q
        int arraySize=1000;
        char char1[]=new char[arraySize];
        int i=0;
        do {
        	char1[i]=scan.next().charAt(0
        			);
        	i++;
        }while(char1[i-1]!='q');
        
        for(int j=0;j<i;j++)
        	System.out.println(char1[j]);
	
	
	//Tu metody ze statku
	char matrix[][]=new char[10][10];
	statki gra1=new statki();
	gra1.startGame();
	matrix=gra1.addANewShip(1, 3, 3);
	matrix=gra1.addANewShip(1, 4, 9);
	matrix=gra1.addANewShip(1, 5, 8);
	matrix=gra1.addANewShip(1, 9, 1);
	matrix=gra1.addANewShip(2, 4, 1);
	for(int x=0;x<10;x++) {
		for(int j=0;j<10;j++)
		{
			System.out.print("[" +matrix[x][j]+"]"+" ");
		}
		System.out.println();
	}
	
	//A tu jakieœ moje œmieci, bo siê tu javy i eclipse kiedyœ uczy³am
	/*Employee architect = new Employee(3);

	System.out.println(architect.ageOfEmployee());
	System.out.println(architect.age);
	int age=0;
	System.out.println(age);
	int numbers[]= {1,2,3,4,5,7};
	for(int number:numbers)
	{
		System.out.print(number);
	}
	String names[]={"Julia", "Anna", "Zofia"};
	for(String name : names)
	{
		System.out.println(name);
	}
	Double y=4.0;
	Double x= Double.valueOf(4);
	Integer z=Integer.valueOf(4);
	Integer z1=4;
	Float z2=Float.valueOf("4");
	Integer z3=Integer.valueOf("14",16);
	System.out.println(y +" "+x +" "+z+ " "+z1 +" "+z2+" "+z3);*/
}

}
