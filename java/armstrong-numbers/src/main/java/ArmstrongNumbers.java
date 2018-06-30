class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int initial = numberToCheck;
		int l = String.valueOf(numberToCheck).length();
		int sum = 0;
		//for(int i=0; i < l; i++)
		while(numberToCheck > 0)
		{
			int digit = numberToCheck%10;
			numberToCheck = numberToCheck/10;
			sum+= Math.pow(digit,l);
		}

		return (initial == sum);

	}

}
