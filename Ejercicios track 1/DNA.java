//DNA Sequencing
public class DNA{
  public static void main(String[] args){
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;

    //Find the length of dna:
    int length = dna.length();

    System.out.println("Length: " + length);
    //Find start codon:
    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);
    //Find final codon
    int end = dna.indexOf("TGA");
    System.out.println("End: " + end);

    if((start != -1) && (end != -1) && (length % 3 == 0)){
      System.out.println("The conditions 1, 2 and 3 are satisfied");
      String protein = dna.substring(start,end+3);
      System.out.println("Protein: " + protein);
    }else{
      System.out.println("No protein");
    }
  }
}