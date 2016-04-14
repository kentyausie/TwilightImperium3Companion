package Races;

import com.myapps.kent.ti3_stats.MainData;

import java.util.ArrayList;

/**
 * Created by kent on 2016-03-08.
 */
public abstract class Race {
    private String styledName;
    private String name;
    private ArrayList<String> abilities;
    private MainData data;

    public Race(String _style, String _name, MainData _data){
        styledName = _style;
        name = _name;
        data = _data;
        abilities = new ArrayList<>();
    }

    public String getStyledName(){
        return styledName;
    }

    public String getName(){
        return name;
    }

    protected void addRaceAbility(String _ability){
        abilities.add(_ability);
    }

    protected ArrayList<String> getAbilities(){
        return abilities;
    }

    protected MainData getData(){
        return data;
    }

    abstract public void apply();
}
