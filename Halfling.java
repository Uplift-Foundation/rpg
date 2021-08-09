public class Halfling extends Character
{
    //Variables
    private int archeryBonus;
    private int pickPocketBonus;

    //Encapsulation
    public int getArcheryBonus()
    {
        return this.archeryBonus;
    }
    public void setArcheryBonus(int newArcheryBonus)
    {
        this.archeryBonus = newArcheryBonus;
    }

    public int getPickPocketBonus()
    {
        return this.pickPocketBonus;
    }
    public void setPickPocketBonus(int newPickPocketBonus)
    {
        this.pickPocketBonus = newPickPocketBonus;
    }

    //Constructor
    public Halfling(String name, int age, String sex, int archery, int pickpocket)
    {
        super(name, age, sex);
        this.archeryBonus = archery;
        this.pickPocketBonus = pickpocket;
    }

    //Method
    public String CharacterDetails() //override
    {
        return  (super.toString() + " Archery: " + archeryBonus + " Pickpocket: " + pickPocketBonus);
    }
}
