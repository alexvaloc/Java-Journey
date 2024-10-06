// Import statement:
import java.util.Arrays;
import java.util.ArrayList;

//Program to create an ArrayList with prime numbers in an Array
class PrimeDirective {
  
  // Add your methods here:
  //Method to check if a number is a prime number
  public boolean isPrime(int number){
    if(number == 2){
      return true;
    }else if(number <2){
      return false;
    }

    for (int i = 2; i<number;i++){
      if(number%i ==0){
        return false;
      }
    }
    
    return true;
  }
//Method to add prime number to an ArrayList
  public ArrayList<Integer> onlyPrimes(int [] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();

    for (int number : numbers){
      if(isPrime(number)){
        primes.add(number);
      }
    }
    return primes;
  }
//Method to add to an ArrayList the first n prime numbers
  public ArrayList<Integer> numberOfPrimes(int n){
    ArrayList<Integer> primes = new ArrayList<Integer>();
    int number = 2;

    while(primes.size()<n){
      if(isPrime(number)){
        primes.add(number);
      }
      number++;
    }
    
    return primes;
  }
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));

    System.out.println(pd.onlyPrimes(numbers));

    //Método que devuelve los primeros n números primos
    int n = 10;
    System.out.println("Primeros " + n + " números primos:" + pd.numberOfPrimes(n));

  }  

}