interface StorageCondition { }
interface LockedShelves extends StorageCondition { }
interface SecurityTag extends StorageCondition { }
// NO PROBLEM: multiple interfaces are allowed
abstract class Item implements LockedShelves, SecurityTag { }


class Dairy extends Item implements Refrigerated { }
class Milk extends Dairy { } // inherits being Refrigerated

class Perfume extends Item implements { }
class AirFreshner extends Perfume { } // does not inherit security measures

class ExpensivePerfume extends Item implements LockedShelves, SecurityTag { }
class CalvinKleinPerfume extends ExpensivePerfume { } // inherits security measures

interface Cooled {
    void setOptimumTemp(int temp);
}
interface Refrigerated extends Cooled {
    void setMinTemp(int temp);
}
interface Frozen extends Refrigerated  {
    void setMaxTemp(int temp);
}


class Milk extends Item implements Refrigerated {
    int minTemp;
    int maxTemp;
    int optimumTemp;

    void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    void setOptimumTemp(int optimumTemp) {
        this.optimumTemp = optimumTemp;
    }
}



interface SecurityTag {
    void tripAlarm();
    boolean attachTag();
    boolean removeTag();
    boolean getSecurityTagStatus();
}



class ExpensivePerfume implements SecurityTag {
    boolean attachedTag;

    void tripAlarm() {
        // throw an Exception / Error
    }

    boolean attachTag() {
        if (this.attachedTag == false) {
            this.attachedTag = true;
            return true;
        }
        // attaching two tags is not supported
        // throw an Exception / Error
        return false;
    }

    boolean removeTag() {
        if (this.attachedTag == true) {
            this.attachedTag = false;
            return true;
        }
        // cannot remove tag if item is not locked
        // throw an Exception / Error
        return false;
    }

    boolean getSecurityTagStatus() {
        return this.attachedTag;
    }
}






class RFIDSecurity implements SecurityTag {
    String ID;
    boolean locked;

    void tripAlarm() {
        // send data to the alarm system about RFID tag
        // e.g. ID, current timestamp, etc.
    }

    boolean attachTag() { }
    boolean removeTag() { }
    boolean getSecurityTagStatus() { }
}



void checkOut(Item[] billedItems) {
    for(Item item: billedItems) {
        if (item instanceOf SecurityTag) {
            // Method 1 - create ad-hoc variable
            SecurityTag securedItem = (SecurityTag) item;
            securedItem.removeTag();
            // Method 2 - cast in-place
            (SecurityTag item).removeTag();
            // ---^^^^^^^^^^^^^-----------------> note casting + calling method
        }
    }
}




interface PriceReduction {
    double reducePrice(Item[] items);
}

class Sale implements PriceReduction {
    double percent;
    int minAmount;

    double reducePrice(Item[] items) {
        double totalAmount = calculateTotal(items); // assume this exists
        if (totalAmount >= minAmount) {
            return totalAmount - (totalAmount * percent);
        }
        return totalAmount;
    }
}





Item[] basket = {
    new Milk("Avenmore Fresh", 5, 1.90, 12),
    new Bread("Bretzel Tortano", 7, 4.50),
    new Perfume("Lynx Vanilla", 500, 7),
    new PlasticCup("Tea Mug", 1200, 12)
};


SecurityTag[] checkAge = {
    new Perfume("Lynx Vanilla", 500, 7),
    new Alcohol("Red Wine", 180, 12)
};




void checkExpensiveItemsAreLocked(Item[] items) {
    for(Item item : items) {
        if (item instanceOf SecurityTag && item.getSecurityTagStatus() == false) {
            // handle security issue here
            // e.g. item.attachTag();
        }
    }
}



void sortInventoryByStorage(Item[] items) {
    for(Item item : items) {
        if (item instanceOf Refrigerated) {
            // add to Refrigerated shelf
        } else if (item instanceOf Frozen) {
            // add to Frozen shelf
        } //  ... and so on
    }
}








abstract class Item {
    final String name;
    double price;
    int expiryInDays;
    StorageCondit
}


