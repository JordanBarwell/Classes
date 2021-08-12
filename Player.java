package lib;
/** The Player has a Rollable object and a Name, so this class will 
 *  use feilds taken from the "Name" class and use the "Rollable" interface.
 *  It gets the full name of the player and the Rollable score. 
 *      
 * @author P2405537
 *
 */
public class Player implements Comparable<Player> {

	/** Here is the fields created using private classes from 
	 *  the "Name" class and the "Rollable" interface. 
	 *  we are creating a name of type 'Name' and a dice of type 'Rollable' 
	 */	  
	private Name name;
	private Rollable dice;

	/** in this method declares that a player 
	 *  has a default name and a default die.   
	 */
	public Player() {
		name = new Name();
		dice = new Die();
	}

	/** we are setting the parameters for the player name, when a name is entered 
	 *  it will then have filled the default name with 
	 *  the players name
	 *    @param name this is the player name 
	 */    
	public Player(Name name) {
		this.name = name;
		this.dice = new Die();
	}

	/** this constructor is for when the Player has entered 
	 *  both name and the dice, and sets the parameters 
	 *  for type name and type die
	 * @param name this is the player name
	 * @param dice this is the players rollable type
	 */

	public Player(Name name, Rollable dice) {
		this.name = name;
		this.dice = dice;
	}

	//Set methods for the Player class
	
	/** the compareTo method compares a players name with another's
	 * to see if two players have the same name. 
	 * @param other this is another Player object 
	 * @return return integer difference 
	 */
	public int compareTo(Player other) {
		return this.name.compareTo(other.name);
	}
	/**this method will be used to set a players name.
	 * @param name this is to set the players name 
	 */
	public void setName(Name name) {
		this.name = name; 
	}

	/**this method sets the players rollable type which is of type dice
	 * 
	 * @param dice this is the players rollable object
	 */
	public void setDie(Rollable dice) {
		this.dice = dice;
	}

	/** It sets the players full name to the name you enter. 
	 *  It creates a string array composed of the players full name which is input.
	 *  It splits the string at whatever index " " is at and separates it so that 
	 *  the first name is index [0] of the array and the family name is index [1]  
	 * @param fullPlayerName the players full name 
	 */
	public void setFullPlayerName(String fullPlayerName) {
		String[] FullNameSplit = fullPlayerName.split(" ");
		this.name = new Name(FullNameSplit[0], FullNameSplit[1]);  
	}

	//Get methods for Player class
	public Rollable getDice() {
		return dice;
	}

	public Name getName(){
		return name;
	}

	public int getDiceScore() {
		return dice.getScore();
	}

	//Methods for getting Dice info
	public void rollDice() {
		dice.roll();
	}

	public Rollable getRollable() {
		return dice;
	}


	@Override
	public String toString() {
		return "Player:[name=" + name + ", Die=" + dice + "]";
	}
}

