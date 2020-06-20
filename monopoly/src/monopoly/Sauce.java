// Ritvik Ramdas

package monopoly;

import java.util.*;

import java.util.Scanner;

public class Sauce 
{
	public static void main ( String[] args )
	{
		int roll_num = 0;
		double player1_worth = 1500;
		double player2_worth = 1500;
		int player1_space = 1;
		int player2_space = 1;
		boolean player1_jail = false;
		boolean player2_jail = false;
		boolean player1_bankrupt = false;
		boolean player2_bankrupt = false;
		
		boolean GameEnd = false;
		
		Scanner input = new Scanner(System.in);
		
		properties zero = new properties();
		
		start one = new start();
		one.setPos(1);
		
		properties two = new properties();
		two.setPos(2);
		
		properties three = new properties();
		three.setPos(3);
		
		properties four = new properties();
		four.setPos(4);
		
		properties five = new properties();
		five.setPos(5);
		five.setTileType("l");
		
		properties six = new properties();
		six.setPos(6);
		
		railroad seven = new railroad();
		seven.setPos(7);
		seven.setName("first");
		
		properties eight = new properties();
		eight.setPos(8);
		eight.setTileType("l");
		
		chance nine = new chance();
		nine.setPos(9);
		nine.setName("Bank pays you $50!");
		
		parking ten = new parking();
		ten.setPos(10);
		
		taxes eleven = new taxes();
		eleven.setPos(11);
		
		gotojail twelve = new gotojail();
		twelve.setPos(12);
		
		properties thirteen = new properties();
		thirteen.setPos(13);
		thirteen.setTileType("l");
		
		properties fourteen = new properties();
		fourteen.setPos(14);
		
		properties fifteen = new properties();
		fifteen.setPos(15);
		fifteen.setTileType("l");
		
		chance sixteen = new chance();
		sixteen.setPos(16);
		sixteen.setName("Pay $15.");
		
		properties seventeen = new properties();
		seventeen.setPos(17);
		seventeen.setTileType("l");
		
		properties eighteen = new properties();
		eighteen.setPos(18);
		
		parking nineteen = new parking();
		nineteen.setPos(19);
		
		railroad twenty = new railroad();
		twenty.setPos(20);
		twenty.setName("second");
		
		properties twentyone = new properties();
		twentyone.setPos(21);
		
		properties twentytwo = new properties();
		twentytwo.setPos(22);
		twentytwo.setTileType("l");
		
		parking twentythree = new parking();
		twentythree.setPos(23);
		
		properties twentyfour = new properties();
		twentyfour.setPos(24);
		twentyfour.setTileType("l");
		
		properties twentyfive = new properties();
		twentyfive.setPos(25);
		
		properties twentysix = new properties();
		twentysix.setPos(26);
		
		parking twentyseven = new parking();
		twentyseven.setPos(27);
		
		utilities twentyeight = new utilities();
		twentyeight.setPos(28);
		
		properties twentynine = new properties();
		twentynine.setPos(29);
		twentynine.setTileType("l");
		
		properties thirty = new properties();
		thirty.setPos(30);
		
		chance thirtyone = new chance();
		thirtyone.setPos(31);
		thirtyone.setName("Collect $200!");
		
		railroad thirtytwo = new railroad();
		thirtytwo.setPos(32);
		thirtytwo.setName("third");
		
		properties thirtythree = new properties();
		thirtythree.setPos(33);
		thirtythree.setTileType("l");
		
		jailblock thirtyfour = new jailblock();
		thirtyfour.setPos(34);
		
		properties thirtyfive = new properties();
		thirtyfive.setPos(35);
		
		parking thirtysix = new parking();
		thirtysix.setPos(36);
		
		properties thirtyseven = new properties();
		thirtyseven.setPos(37);
		
		properties thirtyeight = new properties();
		thirtyeight.setPos(38);
		thirtyeight.setTileType("l");
		
		taxes thirtynine = new taxes();
		thirtynine.setPos(39);
		
		chance forty = new chance();
		forty.setPos(40);
		forty.setName("Pay $20.");
		
		properties fortyone = new properties();
		fortyone.setPos(41);
		
		railroad fortytwo = new railroad();
		fortytwo.setPos(42);
		fortytwo.setName("fourth");
		
		properties fortythree = new properties();
		fortythree.setPos(43);
		
		properties fortyfour = new properties();
		fortyfour.setPos(44);
		fortyfour.setTileType("l");
		
		ArrayList <SquareType> list = new ArrayList <SquareType>();
		list.add(zero);
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		list.add(five);
		list.add(six);
		list.add(seven);
		list.add(eight);
		list.add(nine);
		list.add(ten);
		list.add(eleven);
		list.add(twelve);
		list.add(thirteen);
		list.add(fourteen);
		list.add(fifteen);
		list.add(sixteen);
		list.add(seventeen);
		list.add(eighteen);
		list.add(nineteen);
		list.add(twenty);
		list.add(twentyone);
		list.add(twentytwo);
		list.add(twentythree);
		list.add(twentyfour);
		list.add(twentyfive);
		list.add(twentysix);
		list.add(twentyseven);
		list.add(twentyeight);
		list.add(twentynine);
		list.add(thirty);
		list.add(thirtyone);
		list.add(thirtytwo);
		list.add(thirtythree);
		list.add(thirtyfour);
		list.add(thirtyfive);
		list.add(thirtysix);
		list.add(thirtyseven);
		list.add(thirtyeight);
		list.add(thirtynine);
		list.add(forty);
		list.add(fortyone);
		list.add(fortytwo);
		list.add(fortythree);
		list.add(fortyfour);
	
		
		System.out.println("Welcome to Monopoly!");
		System.out.println();
		
		System.out.println("Board Legend: ");
		System.out.println("s = start");
		System.out.println("c = chance");
		System.out.println("g = go to jail");
		System.out.println("j = jail");
		System.out.println("p = parking");
		System.out.println("h = home");
		System.out.println("l = hotel");
		System.out.println("r = railroad");
		System.out.println("t = taxes");
		System.out.println("u = utilities");
		System.out.println();
		
		while ( GameEnd == false )
		{
			// first player
			
			if ( player1_jail == true )
			{
				int a = (int) (6 - (Math.random()));
				int b = (int) (6 - (Math.random()));
				
				if ( a == b )
				{
				}
				
				else
				{
					int count = 1;
					while ( count < 4 )
					{
						a = (int) (6 - (Math.random()));
						b = (int) (6 - (Math.random()));
						
						if ( a == b )
						{
							break;
						}
						
						else
						{
							count++;
						}
					}
					
					if ( count >= 4 )
					{
						player1_worth -= 50;
					}
				}
				
			}
			
			System.out.println("Player 1's turn");
			
			roll_num = roll( (int) ((Math.random() * 6 ) + 1) , (int) ((Math.random() * 6 ) + 1));
			
			System.out.println("Player 1 rolled a total of " + roll_num);
			
			player1_space += roll_num;
			
			if ( player1_space > 45 )
			{
				player1_space = 1;
			}
			
			printboard(list);
			
			System.out.println("Player 1 is on space #" + player1_space);
			
			if ( list.get(player1_space).getTileType() == "s" )
			{
				player1_worth += 200;
			}
			
			else if ( list.get(player1_space).getTileType() == "c" )
			{
				if ( list.get(player1_space).getName() == "Bank pays you $50!" )
				{
					player1_worth += 50;
					System.out.println("Bank pays you $50!");
				}
				
				else if ( list.get(player1_space).getName() == "Pay $15." )
				{
					player1_worth -= 15;
					System.out.println("Pay $15.");
				} 
				
				else if ( list.get(player1_space).getName() == "Collect $200!" )
				{
					player1_worth += 200;
					System.out.println("Collect $200!");
				} 
				
				else
				{
					player1_worth -= 20;
					System.out.println("Lose $20!");
				}
			}
			
			else if ( list.get(player1_space).getTileType() == "g" )
			{
				player1_space = 34;
				player1_jail = true;
				System.out.println("You are in jail!");
			}
			
			else if ( list.get(player1_space).getTileType() == "h" )
			{
				if ( list.get(player1_space).getOwner() == 2 )
				{
					System.out.println("Do you want to buy this home from Player 2? (Y or N)");
					String choice_buy = input.nextLine();
					
					if ( choice_buy == "Y" )
					{
						player1_worth -= 50;
						player2_worth += 50;
						list.get(player1_space).setOwner(1);
					}
					
					else
					{
						player1_worth -= 15;
						player2_worth += 15;
					}
				}
				
				else if ( list.get(player1_space).getOwner() == 1 )
				{
					player1_worth += 25;
				}
				
				else
				{
					System.out.println("Do you want to buy this home? ( 1 or 2 )?");
					
					int choice = input.nextInt();
					input.nextLine();
					
					if ( choice == 1 )
					{
						player1_worth -= 50;
						list.get(player1_space).setOwner(1);
					}
				}
			}
			
			else if ( list.get(player1_space).getTileType() == "l" )
			{
				if ( list.get(player1_space).getOwner() == 2 )
				{
					System.out.println("Do you want to buy this hotel from Player 2? (Y or N)");
					String choice_buy = input.nextLine();
					
					if ( choice_buy == "Y" )
					{
						player1_worth -= 100;
						player2_worth += 100;
						list.get(player1_space).setOwner(1);
					}
					
					else
					{
						player1_worth -= 50;
						player2_worth += 50;
					}
				}
				
				else if ( list.get(player1_space).getOwner() == 1 )
				{
					player1_worth += 75;
				}
				
				
				else
				{
					System.out.println("Do you want to buy this hotel? (1 or 2)");
					
					int choice = input.nextInt();
					input.nextLine();
					
					if ( choice == 1 )
					{
						player1_worth -= 100;
						list.get(player1_space).setOwner(1);
					}
				}
			}
			
			else if ( list.get(player1_space).getTileType() == "r" )
			{
				System.out.println("Which station do you want to arrive at? (1,2,3,4)");
				
				int rail = input.nextInt();
				input.nextLine();
				
				if ( rail == 1 )
				{
					player1_space = 7;
					System.out.println("You are now at space " + player1_space );
				}
							
				if ( rail == 2 )
				{
					player1_space = 20;
					System.out.println("You are now at space " + player1_space );
				}
							
				if ( rail == 3 )
				{
					player1_space = 32;
					System.out.println("You are now at space " + player1_space );
				}
							
				if ( rail == 4 )
				{
					player1_space = 42;
					System.out.println("You are now at space " + player1_space );
				}
			}
			
			else if ( list.get(player1_space).getTileType() == "t" )
			{
				double tax = 0.15 * player1_worth;
				
				player1_worth -= tax;
				
				System.out.println("You have paid taxes.");
			}
			
			else
			{
			}
			
			System.out.println("You have $" + player1_worth + " left.");
			
			System.out.println("Would you like to continue? (Y or N)");
			
			String cont = input.nextLine();
			
			if ( cont == "Y" )
			{}
			
			// second player
			
			System.out.println();
			
			if ( player2_jail == true )
			{
				int a = (int) (6 - (Math.random()));
				int b = (int) (6 - (Math.random()));
							
				if ( a == b )
				{
				}
							
				else
				{
					int count = 1;
					while ( count < 4 )
					{
						a = (int) (6 - (Math.random()));
						b = (int) (6 - (Math.random()));
									
						if ( a == b )
						{
							break;
						}
									
						else
						{
							count++;
						}
					}
								
					if ( count >= 4 )
					{
						player2_worth -= 50;
					}
				}
							
			}
						
			System.out.println("Player 2's turn");
						
			roll_num = roll( (int) ((Math.random() * 6 ) + 1) , (int) ((Math.random() * 6 ) + 1));
						
			System.out.println("Player 2 rolled a total of " + roll_num);
						
			player2_space += roll_num;
						
			if ( player2_space > 45 )
			{
				player2_space = 1;
			}
						
			printboard(list);
						
			System.out.println("Player 2 is on space #" + player2_space);
						
			if ( list.get(player2_space).getTileType() == "s" )
			{
				player2_worth += 200;
			}
						
			else if ( list.get(player2_space).getTileType() == "c" )
			{
				if ( list.get(player2_space).getName() == "Bank pays you $50!" )
				{
					player2_worth += 50;
					System.out.println("Bank pays you $50!");
				}
							
				else if ( list.get(player2_space).getName() == "Pay $15." )
				{
					player2_worth -= 15;
					System.out.println("Pay $15.");
				} 
							
				else if ( list.get(player2_space).getName() == "Collect $200!" )
				{
					player2_worth += 200;
					System.out.println("Collect $200!");
				} 
						
				else
				{
					player2_worth -= 20;
					System.out.println("Lose $20.");
				}
			}
						
			else if ( list.get(player2_space).getTileType() == "g" )
			{
				player2_space = 34;
				player2_jail = true;
				System.out.println("You are in jail!");
			}
						
			else if ( list.get(player2_space).getTileType() == "h" )
			{
				if ( list.get(player2_space).getOwner() == 1 )
				{
					System.out.println("Do you want to buy this home from Player 1? (1 or 2)");
					int choice_buy = input.nextInt();
					input.nextLine();
					
					if ( choice_buy == 1 )
					{
						player2_worth -= 50;
						player1_worth += 50;
						list.get(player2_space).setOwner(2);
					}
								
					else
					{
						player2_worth -= 15;
						player1_worth += 15;
					}
				}
							
				else if ( list.get(player2_space).getOwner() == 2 )
				{
					player2_worth += 25;
				}
							
				else
				{
					System.out.println("Do you want to buy this home? (1 or 2)");
								
					int choice = input.nextInt();
					input.nextLine();
								
					if ( choice == 1 )
					{
						player2_worth -= 50;
						list.get(player2_space).setOwner(2);
					}
				}
			}
						
			else if ( list.get(player2_space).getTileType() == "l" )
			{
				if ( list.get(player2_space).getOwner() == 1 )
				{
					System.out.println("Do you want to buy this hotel from Player 1? (Y or N)");
					String choice_buy = input.nextLine();
								
					if ( choice_buy == "Y" )
					{
						player2_worth -= 100;
						player1_worth += 100;
						list.get(player2_space).setOwner(2);
					}
								
					else
					{
						player2_worth -= 50;
						player1_worth += 50;
					}
				}
							
				else if ( list.get(player2_space).getOwner() == 2 )
				{
					player2_worth += 75;
				}
							
							
				else
				{
					System.out.println("Do you want to buy this hotel? ( 1 or 2) ");
								
					int choice = input.nextInt();
					input.nextLine();
								
					if ( choice == 1 )
					{
						player2_worth -= 100;
						list.get(player2_space).setOwner(2);	
					}
				}
			}
						
			else if ( list.get(player2_space).getTileType() == "r" )
			{
				System.out.println("Which station do you want to arrive at? (1,2,3,4)");
							
				int rail = input.nextInt();
				input.nextLine();
							
				if ( rail == 1 )
				{
					player2_space = 7;
					System.out.println("You are now at space " + player2_space );
				}
							
				if ( rail == 2 )
				{
					player2_space = 20;
					System.out.println("You are now at space " + player2_space );
				}
							
				if ( rail == 3 )
				{
					player2_space = 32;
					System.out.println("You are now at space " + player2_space );
				}
							
				if ( rail == 4 )
				{
					player2_space = 42;
					System.out.println("You are now at space " + player2_space );
				}
			}
						
			else if ( list.get(player2_space).getTileType() == "t" )
			{
				double tax = 0.15 * player2_worth;
				
				player2_worth -= tax;
				System.out.println("You have paid taxes.");
			}
			
			else
			{
			}
			
			System.out.println("You have $" + player2_worth + " left.");
			
			System.out.println("Would you like to continue? (Y or N)");
			
			String cont2 = input.nextLine();
			
			if ( cont2 == "Y" )
			{}
			
			if ( player1_worth < 0 )
			{
				System.out.println("Player 2 Wins!");
				GameEnd = true;
			}
			
			if ( player2_worth < 0 )
			{
				System.out.println("Player 1 Wins!");
				GameEnd = true;
			}
			
		}
	}
	
	public static int roll ( int a , int b )
	{
		return ( a + b );
	}
	
	public static void printboard ( ArrayList<SquareType> list )
	{
		System.out.println("                       MONOPOLY                   ");
		System.out.println();
		System.out.println("        24  25  26  27  28  29  30  31  32  33  34");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("23 | " + list.get(23).getTileType() + " | " + list.get(24).getTileType() + " | " + list.get(25).getTileType() + " | " + list.get(26).getTileType() + " | " + list.get(27).getTileType() + " | " + list.get(28).getTileType() + " | " + list.get(29).getTileType() + " | " + list.get(30).getTileType() + " | " + list.get(31).getTileType() + " | " + list.get(32).getTileType() + " | " + list.get(33).getTileType() + " | " + list.get(34).getTileType() + " |");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("22 | " + list.get(22).getTileType() + " |                             	       | " + list.get(35).getTileType() + " | 35");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("21 | " + list.get(21).getTileType() + " |                               	       | " + list.get(36).getTileType() + " | 36");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("20 | " + list.get(20).getTileType() + " |                               	       | " + list.get(37).getTileType() + " | 37");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("19 | " + list.get(19).getTileType() + " |                            	       | " + list.get(38).getTileType() + " | 38");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("18 | " + list.get(18).getTileType() + " |                   		       | " + list.get(39).getTileType() + " | 39");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("17 | " + list.get(17).getTileType() + " |                        	       | " + list.get(40).getTileType() + " | 40");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("16 | " + list.get(16).getTileType() + " |                   		       | " + list.get(41).getTileType() + " | 41");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("15 | " + list.get(15).getTileType() + " |                   		       | " + list.get(42).getTileType() + " | 42");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("14 | " + list.get(14).getTileType() + " |                   		       | " + list.get(43).getTileType() + " | 43");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("13 | " + list.get(13).getTileType() + " |                    	               | " + list.get(44).getTileType() + " | 44");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("12 | " + list.get(12).getTileType() + " | " + list.get(11).getTileType() + " | " + list.get(10).getTileType() + " | " + list.get(9).getTileType() + " | " + list.get(8).getTileType() + " | " + list.get(7).getTileType() + " | " + list.get(6).getTileType() + " | " + list.get(5).getTileType() + " | " + list.get(4).getTileType() + " | " + list.get(3).getTileType() + " | " + list.get(2).getTileType() + " | " + list.get(1).getTileType() + " |");
		System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("        11  10   9   8   7   6   5   4   3   2   1   ");
		System.out.println();
	}
	
	public static int moves ( int a , int b )
	{
		if ( a + b > 44 )
		{
			return 5;
		}
		
		else
		{
			return (a + b);
		}
	}
}