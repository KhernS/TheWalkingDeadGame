package walkingDead;

import java.util.Scanner;


public class Main{
	
	static int playerPick;
	int select;
	String enter;
	Scanner scan = new Scanner(System.in);
	Dialogue introduction = new Dialogue();
	Narrative narrate = new Narrative();
	PlayerChoice playerChoice = new PlayerChoice();
	PoliceOfficer police = new PoliceOfficer();
	NonDialogue nonDialogue =  new NonDialogue();
	Save save = new Save();
	
	
	    public Main() {
	    	
	    //Choose between newGame or loadSave
	    System.out.println("Load or NewGame");
	    select = scan.nextInt();
	    if(select == 1) {
	    	save.readPlayer(enter);
	    	
	    }
	    
		// Introduction
		introduction.introduction();
		enter = scan.nextLine();
		introduction.introduction1();
		enter = scan.nextLine();
		introduction.introduction2();
		enter = scan.nextLine();
		
		//title
		System.out.println("Episode One: A New Day");
		System.out.println(" ");
		
		//narrate
		narrate.narrate();
		enter = scan.nextLine();
		
		//dialogue with PoliceOfficer
		 police.policeDlg();
		 System.out.println(" ");
		 //choices
		 System.out.println("1: Why do you say that?");
		 System.out.println("2: You know what they say about reckoning.");
		 System.out.println("3: Does it really matter?");
		 System.out.println("4: ....");
		 
		 //timer for choices
	      playerPick = scan.nextInt();
	      
		//checks player choice
		if(playerPick == 1) {
			System.out.println(playerChoice.choice[0]);
		}
		else if (playerPick == 2) {
			System.out.println(playerChoice.choice[1]);
		}
		else if(playerPick == 3) {
			System.out.println(playerChoice.choice[2]);
		}
		else if(playerPick == 4) {
			System.out.println(playerChoice.choice[3]);
		}
	
		//Police officer responds to the player
		if(playerPick == 1) {
			police.policeDlg1();
		}
		else if(playerPick == 2){
            police.policeDlg2();
            nonDialogue.nonDlg();
            police.policeDlg1();
            
		}
		else if(playerPick == 3) {
			police.policeDlg3();
			police.policeDlg1();
		}
		else if(playerPick == 4) {
			police.policeDlg4();
			police.policeDlg1();
		}
		
		 System.out.println(" ");
		 System.out.println("1: And what do you say?");
		 System.out.println("2: Not from me.");
		 System.out.println("3: Every time?");
		 System.out.println("4: ....");
		 
		 playerPick = scan.nextInt();
		 System.out.println(" ");
		 
		//Police officer responds to the player
		 if(playerPick == 1) {
				police.policeDlg5();
				System.out.println(" ");
				 nonDialogue.nonDlg1();
			}
		 
			else if(playerPick == 2){
	            police.policeDlg6();
	            System.out.println(" ");
	            nonDialogue.nonDlg1();
			}
		 
			else if(playerPick == 3){
	            police.policeDlg7();
	            System.out.println(" ");
	            nonDialogue.nonDlg1();
			}
			else if(playerPick == 4){
	            police.policeDlg6();
	            System.out.println(" ");
	            nonDialogue.nonDlg1();
			}
			
		}
	   
	    public static void main(String[] args) {
	    	new Main();
	    	    
	}

}

