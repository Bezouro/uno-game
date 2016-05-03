package UNO;
import cardGame.*;

/**
 * 
 * @author Eduardo Pinto and Otávio Augusto
 *
 */
public class Hand extends CardCollection <UnoCard>{
	
	public Hand(){
		super();
	}
	
	/**
	 * Add a card in the hand of the player.
	 */
	@Override
	public void addCard(UnoCard card){
		this.cardList.add(card);
	}

	/**
	 * Remove a card in the hand of the player.
	 * @return the UNO card removed.
	 */
	@Override
	public UnoCard getCard(int index){
		try{
			return this.cardList.remove(index);
		} catch(IndexOutOfBoundsException e){
			return null;
		}
	}
}
