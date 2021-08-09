public class Human extends Character
{
    //Variables
    private int restorationBonus;
    private int blockBonus;

    //Encapsulation
    public int getRestorationBonus()
    {
        return this.restorationBonus;
    }
    public void setRestorationBonus(int newRestorationBonus)
    {
        this.restorationBonus = newRestorationBonus;
    }

    public int getBlockBonus()
    {
        return this.blockBonus;
    }
    public void setBlockBonus(int newBlockBonus)
    {
        this.blockBonus = newBlockBonus;
    }

    

    //Constructor
    public Human(String name, int age, String sex, int restoration, int block)
    {
        super(name, age, sex);
        this.restorationBonus = restoration;
        this.blockBonus = block;
    }

    //Method
    public String CharacterDetails() //override
    {
        return  (super.toString() + " Restoration: " + restorationBonus + " Block: " + blockBonus);
    }
}
