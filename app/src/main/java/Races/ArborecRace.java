package Races;

import com.myapps.kent.ti3_stats.MainData;

import Races.Race;

/**
 * Created by kent on 2016-03-08.
 */
public class ArborecRace extends Race {

    public ArborecRace(MainData _data){
        super("THE ARBOREC","arborec",_data);
        this.addRaceAbility("You may not build Ground Forces with your Space Dock.");
        this.addRaceAbility("Your Ground Forces have a build capacity of 1. You may not build " +
                "units with Ground Forces that have not moved during the same activation.");
        this.addRaceAbility("At the Start of the Status Phace, place 1 Ground Force on one planet you control.");
    }
    @Override
    public void apply() {
        for(int i = 0; i < this.getAbilities().size(); i++){
            this.getData().setRaceAbilities(this.getAbilities().get(i));
        }
        this.getData().getUnit("groundforce").addSpecialAttribute("Produce Units");
    }
}
