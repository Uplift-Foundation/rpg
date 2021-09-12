package com.senecafoundation.DataHandler;

import com.senecafoundation.CharacterTypes.Character;
import com.senecafoundation.CharacterTypes.ICharacter;

public interface IDataHandlerRead 
{
    public ICharacter Read(String id) throws Exception;
}
