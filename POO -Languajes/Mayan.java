public class Mayan extends Language{
  public Mayan(String name, int numSpeakers){
    super(name, numSpeakers, "Central America",
  "verb-object-subject");
  }

  @Override
  public void getInfo(){
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println(" The lenguage follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + " is an ergative language.");
  }
}