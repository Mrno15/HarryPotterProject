package com.isep.hpah.core.Baguette;

import com.isep.hpah.core.PersonnageEtMonstre.Sorcier;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Wand {
    Core core = null;
    private Length length;


}
