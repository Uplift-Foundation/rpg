package com.senecafoundation.CharacterSelection;

import com.senecafoundation.CharacterTypes.Character;

public interface ICharacterSelection {
    public String pickName();
    public int pickAge();
    public String pickSex();
    public Character picker() throws Exception;
}
