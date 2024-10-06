public class Magic {
	public static void main(String[] args) {
    /* Exercise 1
      We will refer to myNumber as the original number from now on
    */
        // int myNumber = 245;

        // int stepOne = myNumber * myNumber; 
        // int stepTwo = stepOne + myNumber;
        // int stepThree = stepTwo/myNumber;
        // int stepFour = stepThree + 17;
        // int stepFive = stepFour - myNumber;
        // int stepSix = stepFive/6;

        // System.out.println(stepSix);
            
    /*
    Exercise 2
    Trying to create the same example only with 2 variables
    */
        int myNumber = 8;
        int magicNumber = myNumber * myNumber;
        
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber +=17;
        magicNumber -= myNumber;
        magicNumber /=6;

    System.out.println(magicNumber);
	}
}