package com.gambling;

import java.util.Random;

public class Gambling {
	static int stack=100;  
	final static int BET=1;
	public void Game() {
		System.out.println("Welcome To Gambler Simulator");
		System.out.println("Every Day Stack: "+stack);
		System.out.println("Beat Price: "+BET);
		
		int stack_Upper = 150;  
		int stack_Lower =50;    
		
		while(stack > stack_Lower && stack < stack_Upper) {   
		Random random = new Random();  
		int bet = random.nextInt(2);
		if(bet == 1) {
			System.out.println("Bet Win");
			System.out.println("Final Amount: "+(stack += BET)); 
		}else {
			System.out.println("Bet Loss");
			System.out.println("Final Amount: "+(stack -= BET)); 
		}
		}
	}
}