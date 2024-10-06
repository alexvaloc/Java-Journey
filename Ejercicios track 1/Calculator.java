public class Calculator{
/*
We will create a calculator in order to calculate some mathemathic operations sending 2 parameters
*/
  public Calculator(){

  }

  public int add(int a, int b){
    return a + b;
  }

  public int subtract(int a, int b){
    return a - b;
  }

  public int multiply(int a, int b){
    return a*b;
  }

  public double divide(int a, int b){
    return a/b;
  }

  public int modulo(int a, int b){
    return a%b;
  }

  

  public static void main (String[] args){
    Calculator myCalculator = new Calculator();

    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(5,5));
    System.out.println(myCalculator.divide(9,3));
    System.out.println(myCalculator.modulo(11,2));
  }
}