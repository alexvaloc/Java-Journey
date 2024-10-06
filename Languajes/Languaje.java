import java.util.ArrayList;

public class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String name, int numSpeakers, String regionsSpoken,
  String wordOrder){
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }
  
  public void getInfo(){
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The lenguage follows the word order: " + this.wordOrder);
  }

  public void setNewNumOfSpeakers(int newNumSpeakers){
    this.numSpeakers = newNumSpeakers;
    System.out.println("The new number of speakers is : " + this.numSpeakers);
  }

  public static void main(String[] args){
    Language spanish = new Language("Spanish", 47000000, "Europe and South America", "Subject - Verb - Object");
    spanish.getInfo();

    Language mocho = new Mayan("Mocho'", 126);
    mocho.getInfo();

    Language mandarinChinese = new SinoTibetan("Mandarin Chinese", 300000);
    Language burmese = new SinoTibetan("Burmese",5000);

    mandarinChinese.getInfo();
    burmese.getInfo();
    System.out.println("-------------------------");
  //Creando un ArrayList de Lenguages con todos mis lenguajes creados
    ArrayList<Language> languages = new ArrayList<>();
        languages.add(mocho);
        languages.add(mandarinChinese);
        languages.add(burmese);

    for(Language lang: languages){
      lang.getInfo();
    }

    //Lamando al setter setNewNumSpeakers
    mocho.setNewNumOfSpeakers(500);
  }
}