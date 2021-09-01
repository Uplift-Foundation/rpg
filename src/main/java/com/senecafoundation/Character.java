package com.senecafoundation;

import java.util.UUID;
import java.util.Scanner;

import com.senecafoundation.DataHandler.IDataHandler;


public abstract class Character implements ICharacter
{
    //Variables
    private String name;
    private int age;
    private String sex;
    private String id;
    private IDataHandler dataHandler;
    private Scanner input = new Scanner(System.in);
    
    //Encapsulation
    public IDataHandler getDataHandler() {
        return dataHandler;
    }
    public String getName()
    {
        return name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public Character(String n, int a, String s, IDataHandler dataHandler)
    {
        this.name = n;
        this.age = a;
        this.sex = s;
        this.setId(UUID.randomUUID().toString());
        this.dataHandler = dataHandler; 
    }

    //Methods
    public String PlayerDetails() //virtual
    {
        return "Player Name: " + name +  " Player Age: " + age + " Sex: " + sex;
    }

    public String toString() 
    {
        return this.getClass().getSimpleName() + "," + this.getId() + "," + this.getName() + ","  + this.getAge() + "," + this.getSex();
    }  
    
}