package unit;

import java.util.ArrayList;

/**
 * Created by kent on 2016-02-16.
 */
public class Unit {
    private String name;
    private String styleName;
    private int cost;
    private boolean isBattleable;
    private int battle;
    private int battleQuantity;
    private boolean isMoveable;
    private int movement;
    private ArrayList<String> special;

    public Unit(String _name, String _style, int _cost, int _battle, int _movement){
        if(_name.equals("")){
            throw new IllegalArgumentException("The unit must have a name");
        } else {
            name = _name;
        }
        if(_style.equals("")) {
            styleName = _name;
        } else {
            styleName = _style;
        }
        if(_cost > 0){
            cost = _cost;
            if(_battle > 0){
                isBattleable = true;
                battle = _battle;
                if(_movement > 0){
                    isMoveable = true;
                    movement = _movement;
                } else {
                    isMoveable = false;
                    movement = 0;
                }
            } else {
                isBattleable = false;
                battle = 0;
            }
        } else {
            throw new IllegalArgumentException("Cost must be greater than 0");
        }
        special = new ArrayList<>();
    }

    public void addSpecialAttribute(String _attribute){
        special.add(_attribute);
    }

    public String getSpecialAttributeString(){
        String newString = "";
        for(int index = 0; index < special.size(); index++){
            if(index == 0){
                newString = special.get(index);
            } else {
                newString = newString + ", " + special.get(index);
            }
        }
        return newString;
    }

    public String getName(){
        return name;
    }

    public String getStyleName(){
        return styleName;
    }

    public int getCost(){
        return cost;
    }

    public void updateCost(int _updateValue){
        cost = cost + _updateValue;
    }

    public boolean checkBattleable(){
        return isBattleable;
    }

    public void makeBattleable(int _battle){
        if(!isBattleable) {
            if (_battle > 0) {
                isBattleable = true;
                battle = _battle;
            } else {
                throw new IllegalArgumentException("Battle must be greater than 0 to make it battleable");
            }
        } else {
            throw new IllegalArgumentException("Unit is already battleable");
        }
    }

    public int getBattle(){
        return battle;
    }
    public String getBattleString(){
        if(battleQuantity > 1){
            return battle+"(x"+battleQuantity+")";
        } else {
            return ""+battle;
        }
    }

    public void updateBattle(int _updateValue){
        battle = battle + _updateValue;
    }

    public int getBattleQuantity(){ return battleQuantity;}

    public void updateBattleQuantity(int _quantity){battleQuantity = _quantity;}

    public boolean checkMoveable(){
        return isMoveable;
    }

    public void makeMoveable(int _move){
        if(!isMoveable) {
            if (_move > 0) {
                isMoveable = true;
                movement = _move;
            } else {
                throw new IllegalArgumentException("Movement must be greater than 0 to make it moveable");
            }
        } else {
            throw new IllegalArgumentException("Unit is already moveable");
        }
    }

    public int getMovement(){
        return movement;
    }

    public void updateMovement(int _updateValue){
        movement = movement + _updateValue;
    }
}
