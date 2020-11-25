package hangmanGame;
import java.util.Scanner;
public class HangeMan {
	int flag=0, option;
	String input,guess;
	
	public void GameMenu() {
		Scanner opt = new Scanner (System.in);
		option=opt.nextInt();
		switch(option) {
		case 1: System.out.println("Play the game");
		break;
		case 2: System.out.println("View game instruction");
		break;
		default: System.out.println("Exit game");
		break;
		}
	}
	
	public void PlayGame() {
		String word="Aishwarya";
		
		Scanner inputletter = new Scanner (System.in);
		int namelength=word.length();
		String letter = inputletter.next();
		int n=0;
		int attempt=0,attemptPass=0,attemtFail=0;
		System.out.println("Length of the string "+namelength);
		

		do {			
			//String input = inputletter.nextLine();		
			for (int i=0;i<namelength;i++) {				
				if(word.charAt(i) == letter.charAt(0))
				{
					flag=1;					
				}
			}
			//}
			if(flag==1) {
				System.out.println("\nThis letter is present in the word");
				attemptPass=attemptPass+1;
				System.out.println("\nNumber of letters guessed correct "+attemptPass);
			}
			
			else {
				System.out.println("\nThis letter is not present in the word");
				attemtFail=attemtFail+1;
				System.out.println("\nNumber of letters guessed wrong "+attemtFail);
			}
			
			attempt=attempt+1;
			System.out.println("\nTotal Number of attempts "+attempt);
			
			//System.out.println("\nDo you want to guess the letter AGAIN?(Y/N)");
			
			guess=inputletter.next();
			letter=guess;
			flag=0;
			
		}while(attempt<namelength);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println("-----Menu----");
		System.out.println("1.Play");
		System.out.println("2.Game Instructions");
		System.out.println("3.Exit Game");
		System.out.println("\nChoose the option:");
		
		HangeMan menu = new HangeMan();
		menu.GameMenu();
		
		
		
		
		System.out.println("\nEnter your guess");
		
		HangeMan play = new HangeMan();
		play.PlayGame();
		
		
		
	}

}

