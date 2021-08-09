import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception 
    {
        //ArrayList to withhold Player Races
        ArrayList<ICharacter> characters = new ArrayList<ICharacter>();

        //Default Character Races
        Orc one = new Orc("N/A",0,"N/A",25,20);
        Viking two = new Viking("N/A", 0, "N/A", 25, 20);
        DemiHuman three = new DemiHuman("N/A", 0, "N/A", 25, 20);
        Elf four = new Elf("N/A",0,"N/A", 25,20);
        Nuet five = new Nuet("N/A",0,"N/A", 25,20);
        Halfling six = new Halfling("N/A",0,"N/A", 25,20);
        HalfElf seven = new HalfElf("N/A",0,"N/A", 25,20);
        ShadowElf eight = new ShadowElf("N/A",0,"N/A", 25,20);
        Human nine = new Human("N/A",0,"N/A", 25,20);
        Tiefler ten = new Tiefler("N/A",0,"N/A", 25,20);

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
        Cealasia place = new Cealasia("N/A");


        //Introduction
        System.out.println(place.WelcomeScreen("The Fading Terrain"));
        place.Directions();

        for(int i = 0; i < characters.size(); i++)
        {
            ICharacter word = characters.get(i);
            System.out.println(word.CharacterDetails());
        }
        
    }
}
