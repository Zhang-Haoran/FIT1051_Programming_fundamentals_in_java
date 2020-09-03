package MonsterZoo;

import java.util.ArrayList;
public class Zoo2 {
	private ArrayList<Monster> monsters;
	//following must be maintained correctly within this class only
	//several methods below depend on its correctness at any given time
	//current number of monsters in zoo NOT zoo capacity
	private int numberOfMonsters;

	//CONSTRUCTORS
	public Zoo2(int capacity){
		monsters = new ArrayList<Monster>();
		numberOfMonsters = 0;
	}

	//ACCESSORS
	public int getCapacity(){ //accessor??? there is no instance variable called capacity
		return monsters.size();
	}

	public int getNumberOfMonsters(){
		return numberOfMonsters;
	}

	//MUTATORS
	//capacity of zoo cannot be changed, Java arrays are of fixed size
	//numberOfMonsters MUST NOT be mutated by the outside world
	//if set incorrectly methods below will either malfunction or
	//cause a run-time crash, this is why we hide data

	//OTHER METHODS
	public int getIndexOfAMonster(String nameToGet){
		int retValue = -1; //default is not found

		for (int i = 0; i < numberOfMonsters; i++)
			if (monsters.get(i).equals(nameToGet))
				retValue = i;

		return retValue;
	}

	public Monster getAMonsterByIndex(int indexToGet){
		Monster retVal;
		if (indexToGet >= 0 && indexToGet < numberOfMonsters)
			retVal =  monsters.get(indexToGet); //PRIVACY LEAK OUT
		else
			retVal = null;

		return retVal;
	}

	public Monster getAMonsterByName(String nameToGet){
		Monster retVal = null;
		for (int i = 0; i <= numberOfMonsters - 1; i++)
			if (monsters.get(i).getName().equals(nameToGet))
				retVal = monsters.get(i);

		return retVal; //PRIVACY LEAK OUT
	}

	//an append operation
	public boolean addAMonster(Monster monsterToAdd){
		boolean retValue = true;
		
		if (numberOfMonsters < monsters.size()){
			monsters.add(monsterToAdd); //PRIVACY LEAK IN
			numberOfMonsters++;
		}
		else
			retValue = false;
		return retValue;
	}

	//an insert operation
	public boolean insertAMonster(Monster monsterToAdd, int indexToAddAt){
        boolean retValue = true;

        monsters.add(indexToAddAt, monsterToAdd);
        numberOfMonsters++;

        return retValue;
	}
	
	public boolean removeAMonster(int indexToRemove){
		boolean retValue = true;
		
		monsters.remove(indexToRemove);
        numberOfMonsters--;
		return retValue;
	}

	public boolean fight(Monster aggressor, int aggressorLimbsLost,
						 int aggressorEyesLost, Monster victim, int victimLimbsLost,
						 int victimEyesLost) {

		boolean retValue = true;

		if (getIndexOfAMonster(aggressor.getName()) != -1 && getIndexOfAMonster(victim.getName()) != -1) {

			//Set aggressor's temperament to aggressive
			aggressor.setTemperament(Monster.TemperamentEnum.AGGRESSIVE);

			// Update aggressor limbs
			int newAggressorLimbs = aggressor.getNumberOfLimbs() - aggressorLimbsLost;
			if (newAggressorLimbs  >= 0) {
				aggressor.setNumberofLimbs(newAggressorLimbs );
				if (aggressor.getNumberOfLimbs() == 0) {
					aggressor.setTemperament(Monster.TemperamentEnum.PASSIVE);
				}
			}
			else {
				retValue = false;
			}

			// Update victim limbs
			int newVictimLimbs = victim.getNumberOfLimbs() - victimLimbsLost;
			if (newVictimLimbs >= 0) {
				victim.setNumberofLimbs(newVictimLimbs);
			}
			else {
				retValue = false;
			}

			// Update aggressor eyes
			int newAggressorEyes = aggressor.getNumberOfEyes() - aggressorEyesLost;
			if (newAggressorEyes >= 0) {
				aggressor.setNumberofEyes(newAggressorEyes);
			}
			else {
				retValue = false;
			}

			// Update victim eyes
			int newVictimEyes = victim.getNumberOfEyes() - victimEyesLost;
			if (newVictimEyes >= 0) {
				victim.setNumberofEyes(newVictimEyes);
			}
			else {
				retValue = false;
			}

		}
		else {
			retValue = false;
		}

		System.out.println("The fight function worked properly: " + retValue);
		return retValue;
	}
	
	public String toString(){
		String outString;
		
		outString = numberOfMonsters + " monsters in the zoo";
		
		for (int i = 0; i <= numberOfMonsters -1; i++)
			outString += "\n\t" + monsters.get(i).toString() + "\n";

		return outString;
	}

	public String toStringShort(){
		String outString;

		outString = numberOfMonsters + " monsters in the zoo\n";

		for (int i = 0; i <= numberOfMonsters -1; i++)
			outString += monsters.get(i).toStringShort() + "\n";

		return outString;
	}
}
