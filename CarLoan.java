public class CarLoan {
  /*
  This program will calculate the monthly payment for a car loan depending of the loan length calculating the amount with the total interest. 
  */
 	public static void main(String[] args) {
      int carLoan = 10000;
      int loanLength = 3;
      int interestRate = 5;
      int downPayment = 2000;


    if (loanLength <= 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan.");
    }else if (downPayment >= carLoan){
      System.out.println("The car can be paid in full.");
    }else{
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      //monthlyBalance represents the monthly payment without interest included
      int monthlyBalance = remainingBalance/months;
      int interest = (monthlyBalance * interestRate)/100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
    

	}
}