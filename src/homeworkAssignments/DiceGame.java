package homeworkAssignments;

import java.util.Random;

/*
INSTRUCTIONS:
* User gets to roll the die a max of 5 times
* Each roll is a random number between 1 and 6
* Game board has 5 spaces
* If they get to exactly 20 at any point, they win
* If they go over, or get to 5 rolls and are under 20, they lose.
 */

public class DiceGame {
    public static void main(String[] args) {
        // setup known variables
        int maxRolls = 5;
        int gameBoardLength = 20;
        Random random = new Random();
        // starting number of dice rolls (1) and starting position (0)
        int userRolls = 1;
        int userPosition = 0;

        // start game loop using a do-while
        do {
            // get random dice roll
            int die = random.nextInt(6) + 1;
            // increment user position
            userPosition += die;

            // check if user position is less than or equal to 20, etc
            if ( userPosition < gameBoardLength ) {
                int spacesLeft = gameBoardLength - userPosition;
                System.out.println("Roll #"+ userRolls +": You've rolled a "+ die +". You are now on space "+ userPosition +" and have "+ spacesLeft+ " to go.");
            }
            else if ( userPosition > gameBoardLength ) {
                int spacesOver = userPosition - gameBoardLength;
                System.out.println("Roll #"+ userRolls +": You've rolled a "+ die +". You lose! You went "+ spacesOver +" space(s) too far. Better luck next time!");
                break;
            }
            else {
                System.out.println("Roll #"+ userRolls +": You've rolled a "+ die + ". You are now on space "+ userPosition +". Congrats! You win!");
                break;
            }

            userRolls++;
        }
        while(userRolls <= maxRolls);

        if (userPosition < gameBoardLength) {
            System.out.println("You're out of rolls! Better luck next time!");
        }

    }
}
