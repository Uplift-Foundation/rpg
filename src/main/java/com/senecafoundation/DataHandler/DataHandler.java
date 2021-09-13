package com.senecafoundation.DataHandler;

import com.senecafoundation.CharacterTypes.Character;
import com.senecafoundation.CharacterTypes.ICharacter;

public abstract class DataHandler implements IDataHandler
{
    @Override
    public abstract boolean Create(ICharacter character);

    @Override
    public abstract ICharacter Read(String id) throws Exception;

    @Override
    public abstract ICharacter Update(ICharacter character);

    @Override
    public abstract boolean Delete(String id) throws Exception;
}