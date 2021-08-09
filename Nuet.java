public class Nuet extends Character
{
    //Variables
    private int lockPickingBonus;
    private int lightArmorBonus;

    //Encapsulation
    public int getLockPickingBonus()
    {
        return this.lockPickingBonus;
    }
    public void setLockPickingBonus(int newLockPickingBonus)
    {
        this.lockPickingBonus = newLockPickingBonus;
    }

    public int getLightArmorBonus()
    {
        return this.lightArmorBonus;
    }
    public void setLightArmorBonus(int newLightArmorBonus)
    {
        this.lightArmorBonus = newLightArmorBonus;
    }

    //Constructor
    public Nuet(String name, int age, String sex, int lockPicking, int lightArmor)
    {
        super(name, age, sex);
        this.lockPickingBonus = lockPicking;
        this.lightArmorBonus = lightArmor;
    }

    //Method
    public String CharacterDetails() //override
    {
        return  (super.toString() + " Lockpicking: " + lockPickingBonus + " Light Armor: " + lightArmorBonus);
    }
}

