package com.zipcode.justcode.clamfortress.ClamFortress.models.game.models.items.medical;


public class Antibiotic extends AbstractMedicalItem {

    public Antibiotic() {
        super("Antibiotic", "Vastly improves Healing.");
    }

    @Override
    public Antibiotic clone() {
        return new Antibiotic();
    }
}
