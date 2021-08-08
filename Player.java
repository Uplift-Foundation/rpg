public class Player implements IPlayer
{
    //Variables
    private String name;
    private int age;
    private String sex;
    

    //Encapsulation
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public String getSex()
    {
        return sex;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

  
    
        

    //Constructor
    public Player(String n, int a, String s)
    {
        this.name = n;
        this.age = a;
        this.sex = s;
       
    }

    //Methods
    public String PlayerDetails() //virtual
    {
        return "Player Name: " + name +  " Player Age: " + age + " Sex: " + sex;
    }

}