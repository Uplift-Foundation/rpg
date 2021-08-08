import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception 
    {
        //ArrayList to withhold Player Races
        ArrayList<IPlayer> characters = new ArrayList<IPlayer>();

        //Default Character Races
        Orc one = new Orc("N/A",0,"N/A",25,20);
        Nord two = new Nord("N/A", 0, "N/A", 25, 20);
        Khajit three = new Khajit("N/A", 0, "N/A", 25, 20);
        HighElf four = new HighElf("N/A",0,"N/A", 25,20);
        Argonian five = new Argonian("N/A",0,"N/A", 25,20);
        WoodElf six = new WoodElf("N/A",0,"N/A", 25,20);
        Breton seven = new Breton("N/A",0,"N/A", 25,20);
        DarkElf eight = new DarkElf("N/A",0,"N/A", 25,20);
        Imperial nine = new Imperial("N/A",0,"N/A", 25,20);
        Redguard ten = new Redguard("N/A",0,"N/A", 25,20);

        //Adds to characters list
        characters.add(one);
        characters.add(two);
        characters.add(three);
        characters.add(four);
        characters.add(five);
        characters.add(six);
        characters.add(seven);
        characters.add(eight);
        characters.add(nine);
        characters.add(ten);
        
        //Default Place Maker/City
        Skyrim place = new Skyrim("N/A");


        //Introduction
        System.out.println(place.WelcomeScreen("Whiterun"));
        place.Directions();

        for(int i = 0; i < characters.size(); i++)
        {
            IPlayer word = characters.get(i);
            System.out.println(word.PlayerDetails());
        }
        
    }
}
