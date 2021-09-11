package com.senecafoundation.DataHandler;

import com.senecafoundation.CharacterTypes.Character;

public interface IDataHandlerRead 
{
    public Character Read(String id) throws Exception;
}
