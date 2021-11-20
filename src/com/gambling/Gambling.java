package com.gambling;

import java.util.Random;

public class Gambling {
	static int stack=100;  
	final static int BET=1;    
	public void Game() {
		System.out.println("Welcome To Gambler Simulator");
		System.out.println("Every Day Stack: "+stack);
		System.out.println("Bet Price: "+BET);
		
		Random random = new Random();  
		int Bet = random.nextInt(2);
		
		if(Bet == 1) {
			System.out.println("Bet Win");
			System.out.println("Final Amount: "+(stack += BET)); 
		}else {
			System.out.println("Bet Loss");
			System.out.println("Final Amount: "+(stack -= BET)); 
		}
		
	}
}