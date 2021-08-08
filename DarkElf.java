public class DarkElf extends Player 
{
    //Variables
    private int destructionBonus;
    private int alterationBonus;

    //Encapsulation
    public int getDestructionBonus()
    {
        return this.destructionBonus;
    }
    public void setDestructionBonus(int newDestructionBonus)
    {
        this.destructionBonus = newDestructionBonus;
    }

    public int getAlterationBonus()
    {
        return this.alterationBonus;
    }
    public void setAlterationBonus(int newAlterationBonus)
    {
        this.alterationBonus = newAlterationBonus;
    }

    //Constructor
    public DarkElf(String name, int age, String sex, int destruction, int alteration)
    {
        super(name, age, sex);
        this.destructionBonus = destruction;
        this.alterationBonus = alteration;
    }

    //Method
    public String PlayerDetails() //override
    {
        return  (super.toString() + " Destruction: " + destructionBonus + " Alteration: " + alterationBonus);
    }
}