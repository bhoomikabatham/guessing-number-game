                               /*  Codsoft Java Internship Task No.1 */


import java.util.Random;

import java.util.Scanner;

class NumberGame{

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);

		int guess, random = (int)(Math.random() * 100) ;

		System.out.println("enter any number between 1-100 :");

		guess = in.nextInt();

		int i;

		for( i = 2; i <= 5 && guess != random;i++){

			if (guess > random){

				System.out.println("your guess is too high");

			}

			else{

				System.out.println("your guess is too low");

			}

			System.out.println("your attempt number " + i);

			System.out.println("please guess :");

			guess = in.nextInt();

		}

		if ( i == 5 )

			System.out.println("your all attempts are finished and you loss the game ");

		else{

			System.out.println("congratulations ! you guessed the correct number");
		}
	}

}
