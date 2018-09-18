import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in) ;
		
		String name;
		System.out.println("Please enter player's name :");
		name = stdin.nextLine();
		
		
		int H;
		int AB;
		int BB;
		int HBP;
		int SF;
		int dbl;
		int triple;
		int HR;
		System.out.println("Please enter following datas in orders: H, AB, BB, HBP, SF, dbl, triple, HR");
		H = stdin.nextInt();
		AB = stdin.nextInt();
		BB = stdin.nextInt();
		HBP = stdin.nextInt();
		SF = stdin.nextInt();
		dbl = stdin.nextInt();
		triple = stdin.nextInt();
		HR = stdin.nextInt();
		
		
		
		
		BaseballPlayer p1 = new BaseballPlayer(name, H, AB, BB, HBP, SF, dbl, triple, HR);
		
		System.out.printf("%s's BA is: %f\n",p1.getPlayerName(),p1.BA() );
		System.out.printf("%s's OBP is: %f\n",p1.getPlayerName(),p1.OBP() );
		System.out.printf("%s's SLG is: %f\n",p1.getPlayerName(),p1.SLG() );
		System.out.printf("%s's OBS is: %f\n",p1.getPlayerName(),p1.OBS() );
		System.out.printf("%s's TB is: %d\n",p1.getPlayerName(),p1.TB() );
	}

}
