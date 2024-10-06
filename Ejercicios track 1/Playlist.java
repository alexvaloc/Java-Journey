import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
//Making an Array to collect my favorite songs 
class Playlist {
  public static void main(String[] args){
    String[] favoriteSongs = new String[10];
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();

    favoriteSongs[0]="Walk above the city - The paper kites";
    favoriteSongs[1]="Chihiro - Billie Eilish";
    favoriteSongs[2]="Imagíname sin ti - Luis Fonsi";
    favoriteSongs[3]="Bohemian Rhapsody - Queen";
    favoriteSongs[4]="That's what you get - Paramore";
    favoriteSongs[5]="Perfect - Simple plan";
    favoriteSongs[6]="Can I get it - Adele";
    favoriteSongs[7]="Lunch - Billie Eilish";
    favoriteSongs[8]="Hayley's comet - Billie Eilish";
    favoriteSongs[9]="The A Team - Ed Sheeran";

    System.out.println(favoriteSongs[0]);
    System.out.println(favoriteSongs[1]);
    System.out.println(favoriteSongs[2]);

    desertIslandPlaylist.add("Come and play - Billie Eilish");
    desertIslandPlaylist.add("I love you - Billie Eilish");
    desertIslandPlaylist.add("Mientras me curo el corazón - Karol G");
    desertIslandPlaylist.add("Heaven - Novoamor");
    desertIslandPlaylist.add("Crush crush crush - Paramore");

    System.out.println(desertIslandPlaylist);

    //Añadiendo el array a la arrayList
    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Crush crush crush - Paramore");
    desertIslandPlaylist.remove("Imagíname sin ti - Luis Fonsi");
    desertIslandPlaylist.remove("That's what you get - Paramore");
    desertIslandPlaylist.remove("Can I get it - Adele");
    desertIslandPlaylist.remove("Bohemian Rhapsody - Queen");
    desertIslandPlaylist.remove("Mientras me curo el corazón - Karol G");
    desertIslandPlaylist.remove("Perfect - Simple plan");
    desertIslandPlaylist.remove("The A Team - Ed Sheeran");
    desertIslandPlaylist.remove("Heaven - Novoamor");
    desertIslandPlaylist.remove("Hayley's comet - Billie Eilish");
    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);

    //Cambiando dos canciones de lugar entre sí
    int songA = desertIslandPlaylist.indexOf("I love you - Billie Eilish");
    int songB = desertIslandPlaylist.indexOf("Come and play - Billie Eilish");
    System.out.println("Indice de la cancion A: " + songA +". Indice de la canción B: " + songB);
    String tempA = desertIslandPlaylist.get(songA);
    desertIslandPlaylist.set(1,"Come and play - Billie Eilish");

    //System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(0,tempA);
     System.out.println(desertIslandPlaylist);

    //Desordenar arrayList
    Collections.shuffle(desertIslandPlaylist);
    System.out.println("Lista desordenada: " + desertIslandPlaylist);

    Collections.reverse(desertIslandPlaylist);
    System.out.println("Invirtiendo el orden de la lista: " + desertIslandPlaylist);
  }
}