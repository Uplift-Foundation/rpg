public class DemiHuman extends Character 
{
    //Variables
    private int sneakBonus;
    private int alchemyBonus;

    //Encapsulation
    public int getSneak()
    {
        return this.sneakBonus;
    }
    public void setSneak(int newSneakBonus)
    {
        this.sneakBonus = newSneakBonus;
    }

    public int getAlchemyBonus()
    {
        return this.alchemyBonus;
    }
    public void setAlchemyBonus(int newAlchemyBonus)
    {
        this.alchemyBonus = newAlchemyBonus;
    }

    //Constructor
    public DemiHuman(String name, int age, String sex, int sneak, int alchemy)
    {
        super(name, age, sex);
        this.sneakBonus = sneak;
        this.alchemyBonus = alchemy;
    }

    //Method
    public String CharacterDetails() //override
    {
        return  (super.toString() + " Sneak: " + sneakBonus + " Alchemy: " + alchemyBonus);
    }
}
