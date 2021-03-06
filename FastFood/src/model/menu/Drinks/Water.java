package model.menu.Drinks;

import model.DrinksMenuType;

public class Water extends DrinksMenuType {

    public Water(){
        this.menuCode = "DR3";
        this.name = "Bottled Water";
        this.description = "The cool, refreshing and fresh drink for rehydration. " +
                "This is safe to drink specially for babies and elders. ";
        this.price = 50.00f;
    }
}
