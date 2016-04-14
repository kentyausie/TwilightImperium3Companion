package com.myapps.kent.ti3_stats;

import java.util.ArrayList;

import Races.ArborecRace;
import Races.Race;
import unit.Unit;

/**
 * Created by kent on 2016-02-16.
 */
public class MainData {
    private ArrayList<Unit> units;
    private Race race;
    private ArrayList<String> raceAbilities;
    private ArrayList<String> techAbilities;

    public MainData(String raceName){
        units = new ArrayList<>();
        units.add(0, new Unit("dreadnought", "Dreadnought", 5, 5, 1));
        units.get(0).addSpecialAttribute("Bombardment");
        units.get(0).addSpecialAttribute("Sustain Damage");

        units.add(1, new Unit("carrier", "Carrier", 3, 9, 1));
        units.get(1).addSpecialAttribute("Capacity: 6");

        units.add(2, new Unit("cruiser", "Cruiser", 2, 7, 2));

        units.add(3, new Unit("destroyer", "Destroyer", 1, 9, 2));
        units.get(3).addSpecialAttribute("Anti-Fighter Barrage");

        units.add(4, new Unit("fighter", "Fighter (x2)", 1, 9, 0));

        units.add(5, new Unit("warsun", "War Sun", 12, 3, 2));
        units.get(5).addSpecialAttribute("Bombardment");
        units.get(5).addSpecialAttribute("Capacity: 6");
        units.get(5).addSpecialAttribute("Sustain Damage");

        units.add(6, new Unit("groundforce", "Ground Force (x2)", 1, 8, 0));

        units.add(7, new Unit("pds", "PDS", 2, 6, 0));
        units.get(7).addSpecialAttribute("Planetary Shield");
        units.get(7).addSpecialAttribute("Space Cannon");

        units.add(8, new Unit("spacedock", "Space Dock", 4, 0, 0));
        units.get(8).addSpecialAttribute("Produce Units");
        units.get(8).addSpecialAttribute("Fighter Capacity: 3");

        raceAbilities = new ArrayList<>();
        switch (raceName){
            case "arborec":
                race = new ArborecRace(this);
                break;
        }

        race.apply();

        techAbilities = new ArrayList<>();
    }

    public ArrayList<Unit> getUnitStats() {
        return units;
    }

    public Unit getUnit(String _name){
        for(int i = 0; i < units.size(); i++){
            if(units.get(i).getName().equals(_name)){
                return units.get(i);
            }
        }

        return null;
    }

    public void setRaceAbilities(String _ability){
        raceAbilities.add(_ability);
    }

    public ArrayList<String> getRaceAbilities(){
        return raceAbilities;
    }

    public void setTechAbilities(String _tech){techAbilities.add(_tech);}

    public ArrayList<String> getTechAbilities(){return techAbilities;}
}
