import java.lang.Math;

public class RobHouse {
	
	public int maxAmountRobbed(int houseMoney[])
	{
	
	int moneyRobbedEven = 0;
	int moneyRobbedOdd = 0;
	int arrayLength = houseMoney.length;
	int index = 0;
	
	if (arrayLength==1 || arrayLength==2)
		return houseMoney[index];
	for(index=0;index<arrayLength;index=index+2)
	{
		moneyRobbedEven += houseMoney[index]; 
		
	}
	for(index=1;index<arrayLength;index=index+2)
	{
		moneyRobbedOdd += houseMoney[index]; 
	}
	return(Math.max(moneyRobbedEven,moneyRobbedOdd));
	}	
}

