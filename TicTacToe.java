import java.util.Scanner;

public class TicTacToe {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static int cnt=0;
	public static int pos;
	public static int count=2;
	public static int c=100;
	public static char GameBoard[][]= {{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};


	
	public static void show(char[][] GameBoard) {
		System.out.println("\n");
		for(char[] mat:GameBoard){
			System.out.println(mat);
		}
		System.out.print("\n");
	}
	
	public static void CheckX(char[][] GameBoard){
		
		if(GameBoard[0][0]=='X' && GameBoard[2][2]=='X' && GameBoard[4][4]=='X'){
			System.out.println(" X is winner");
			cnt=100;
		}else if (GameBoard[0][4]=='X' && GameBoard[2][2]=='X' && GameBoard[4][0]=='X') {
			System.out.println(" X is winner");
			cnt=100;
		}else if (GameBoard[0][0]=='X' && GameBoard[2][0]=='X' && GameBoard[4][0]=='X'){
			System.out.println(" X is winner");
			cnt=100;
		}else if (GameBoard[0][2]=='X' && GameBoard[2][2]=='X' && GameBoard[4][2]=='X') {
			System.out.println(" X is winner");
			cnt=100;			
		}else if (GameBoard[0][4]=='X' && GameBoard[2][4]=='X' && GameBoard[4][4]=='X') {
			System.out.println(" X is winner");
			cnt=100;
		}else if (GameBoard[0][0]=='X' && GameBoard[0][2]=='X' && GameBoard[0][4]=='X') {
			System.out.println(" X is winner");
			cnt=100;
		}else if (GameBoard[2][0]=='X' && GameBoard[2][2]=='X' && GameBoard[2][4]=='X') {
			System.out.println(" X is winner");
			cnt=100;
		}else if (GameBoard[4][0]=='X' && GameBoard[4][2]=='X' && GameBoard[4][4]=='X') {
			System.out.println(" X is winner");
			cnt=100;
		}
	}
	
	
	public static void CheckO(char[][] GameBoard){
		
		if(GameBoard[0][0]=='O' && GameBoard[2][2]=='O' && GameBoard[4][4]=='O'){
			System.out.println("Player O is winner");
			cnt=100;
		}else if (GameBoard[0][4]=='O' && GameBoard[2][2]=='O' && GameBoard[4][0]=='O') {
			System.out.println(" O is winner");
			cnt=100;
		}else if (GameBoard[0][0]=='O' && GameBoard[2][0]=='O' && GameBoard[4][0]=='O'){
			System.out.println(" O is winner");
			cnt=100;
		}else if (GameBoard[0][2]=='O' && GameBoard[2][2]=='O' && GameBoard[4][2]=='O') {
			System.out.println(" O is winner");
			cnt=100;			
		}else if (GameBoard[0][4]=='O' && GameBoard[2][4]=='O' && GameBoard[4][4]=='O') {
			System.out.println(" O is winner");
			cnt=100;
		}else if (GameBoard[0][0]=='O' && GameBoard[0][2]=='O' && GameBoard[0][4]=='O') {
			System.out.println(" O is winner");
			cnt=100;
		}else if (GameBoard[2][0]=='O' && GameBoard[2][2]=='O' && GameBoard[2][4]=='O') {
			System.out.println(" O is winner");
			cnt=100;
		}else if (GameBoard[4][0]=='O' && GameBoard[4][2]=='O' && GameBoard[4][4]=='O') {
			System.out.println(" O is winner");
			cnt=100;
		}
	}
	
	
	
	public static void Insert() {
		
		do {
			
			if(count%2==0){
				
				System.out.println("\n ---- X's turn ---- \n ");
				System.out.println("Enter the position= ");
				
				pos=sc.nextInt();
				
				if(CheckPosition(pos)) {
					count++;
					cnt++;

				}else {
					Insert();
				}
			
				
				
				switch (pos) {
				case 1: {
					
					GameBoard[0][0]='X';
					break;
				}
				case 2: {
					
					GameBoard[0][2]='X';
					break;
				}case 3: {
					
					GameBoard[0][4]='X';
					break;
				}case 4: {
					
					GameBoard[2][0]='X';
					break;
				}case 5: {
					
					GameBoard[2][2]='X';
					break;
				}case 6: {
					
					GameBoard[2][4]='X';
					break;
				}case 7: {
					
					GameBoard[4][0]='X';
					break;
				}
				case 8: {
					
					GameBoard[4][2]='X';
					break;
				}case 9: {
					
					GameBoard[4][4]='X';
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + pos);
				}
				
				show(GameBoard);
				
				CheckX(GameBoard);

				
			}else {
				
				System.out.println("\n ---- O's turn ---- \n");
				System.out.println("Enter the position= ");
				
				pos=sc.nextInt();
				
				if(CheckPosition(pos)) {
					count++;
					cnt++;

				}else {
					Insert();
				}

				

				
				switch (pos) {
				case 1: {
					
					GameBoard[0][0]='O';
					break;
				}
				case 2: {
					
					GameBoard[0][2]='O';
					break;
				}case 3: {
					
					GameBoard[0][4]='O';
					break;
				}case 4: {
					
					GameBoard[2][0]='O';
					break;
				}case 5: {
					
					GameBoard[2][2]='O';
					break;
				}case 6: {
					
					GameBoard[2][4]='O';
					break;
				}case 7: {
					
					GameBoard[4][0]='O';
					break;
				}
				case 8: {
					
					GameBoard[4][2]='O';
					break;
				}case 9: {
					
					GameBoard[4][4]='O';
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + pos);
				}
				
				show(GameBoard);
				
				CheckO(GameBoard);

			}
			
		}while(cnt<9);
			
	}
	
	
	public static boolean CheckPosition(int pos) {
		
		switch (pos) {
		case 1: {
			
			if (GameBoard[0][0]=='X' || GameBoard[0][0]=='O') {
				System.out.println("Position already occupied !!! Enter another position");
				return false;
			}else {
				return true;
			}
			
		}
		case 2:{
			if(GameBoard[0][2]=='X' || GameBoard[0][2]=='O') {
				System.out.println("Position already occupied !!! Enter another position");

				return false;
			}else {
				return true;
			}
		}
		case 3:{
			if(GameBoard[0][4]=='X' || GameBoard[0][4]=='O') {
				System.out.println("Position already occupied !!! Enter another position");

				return false;
				
			}else {
				return true;
			}
		}
		case 4:{
			if(GameBoard[2][0]=='X' || GameBoard[2][0]=='O') {
				System.out.println("Position already occupied !!! Enter another position");

				return false;
			}else {
				return true;
			}
			
			
		}
		case 5:{
			if(GameBoard[2][2]=='X' || GameBoard[2][2]=='O') {
				System.out.println("Position already occupied !!! Enter another position");

				return false;
			}else {
				return true;
			}
		}
		case 6:{
			if(GameBoard[2][4]=='X' || GameBoard[2][4]=='O') {
				System.out.println("Position already occupied !!! Enter another position");

				return false;
			}else {
				return true;
			}
		}
		case 7:{
			if(GameBoard[4][0]=='X' || GameBoard[4][0]=='O') {
				System.out.println("Position already occupied !!! Enter another position");

				return false;
			}else {
				return true;
			}
		}
		case 8:{
			if(GameBoard[4][2]=='X' || GameBoard[4][2]=='O') {
				System.out.println("Position already occupied !!! Enter another position");

				return false;
			}else {
				return true;
			}
		}
		case 9:{
			if(GameBoard[4][4]=='X' ||GameBoard[4][4]=='O') {
				System.out.println("Position already occupied !!! Enter another position");

				return false;
			}else {
				return true;
			}
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + pos);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		for(char[] mat:GameBoard){
			System.out.println(mat);
		}
		
			
		Insert();
		
		
		
			
	}

}
