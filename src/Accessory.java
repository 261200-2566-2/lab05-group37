public class Accessory implements AccessoryInterface{
    protected int atk, spd, mp; // this is stat
    private Character wearer;

    public Character wearer() {
        return wearer;
    }

    public void equip(Character c) {
        wearer = c;
        c.atk += atk;
        c.spd += spd;
        c.maxmp += mp;
        c.mp += mp;
    }

    public void unequip(){
        if (wearer!=null) {
            wearer.atk -= atk;
            wearer.spd -= spd;
            wearer.mp -= mp;
            wearer.maxmp -= mp;
            wearer = null;
        }
    }
}
