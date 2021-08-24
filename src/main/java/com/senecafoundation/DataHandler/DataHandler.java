package com.senecafoundation.DataHandler;

import com.senecafoundation.Character;

public abstract class DataHandler implements IDataHandler
{

    @Override
    public abstract boolean Create(Character character);

    @Override
    public abstract Character Read(String id) throws Exception;

    @Override
    public abstract boolean Update(Character character);

    @Override
    public abstract boolean Delete(String id);
}