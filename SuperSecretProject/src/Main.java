/**
 * 
 * This machine will simulate a slot machine, for simplicity sake I will refer to a wheel as having 5 points
 * The wheel will represented by an array of string, this is to make printing out the array as I go easier; I'll probably swap to char later on
 * Each point is a String representing a value, A for Ace, K for King, Q for Queen, J to Jack, and finally T for Ten.
 * so a wheel could look like (A,K,T,T,K) for example
 * 
 * RandomiseWheels will generate random points and place them on a wheel
 * 
 * TBA: class will look at generated wheels and check for win lines
 * TBA: class will on win lines being generated announce a payout
 * TBA: class will keep track of wins, spins and total losses/earnings 
 * 
 * 
 * 
 */

/**
 * @author mikey
 *
 */
public class Main {
	RandomiseWheels randomWheel = new RandomiseWheels();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int spin = 0;
		double k = 0;
		double totalWinOrLoss = 0;
		int[][] arrayOfWheels = new int[5][5];
		while(k < 50000){
		arrayOfWheels[0] = RandomiseWheels.pickFiveWinners();
		arrayOfWheels[1] = RandomiseWheels.pickFiveWinners();
		arrayOfWheels[2] = RandomiseWheels.pickFiveWinners();
		arrayOfWheels[3] = RandomiseWheels.pickFiveWinners();
		arrayOfWheels[4] = RandomiseWheels.pickFiveWinners();
			totalWinOrLoss +=CheckWheels.checkWheel(arrayOfWheels);
			System.out.println("Spins:" + spin + " - WinOrLoss: " + (50000 % (50000 - totalWinOrLoss)));
			k++;
			spin++;
		}

	}
		
}
