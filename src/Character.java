public class Character implements CharacterInterface {
    protected int lv;
    protected int maxhp, maxmp, hp, mp, atk, spd; // this is stat!!
    protected String name;
    protected Ring ring;
    protected Gauntlet gauntlet;
    protected Boot boot;

    public void lvup() {
        lv++;
    }


    public void equipRing(Ring r) {
        if(ring != null){
            unequipRing();
        }
        if(r.wearer() != null){
            r.wearer().unequipRing();
        }
        ring = r;
        r.equip(this);
    }


    public void equipGauntlet(Gauntlet g) {
        if(gauntlet != null){
            unequipGauntlet();
        }
        if(g.wearer() != null){
            g.wearer().unequipGauntlet();
        }
        gauntlet = g;
        g.equip(this);
    }


    public void equipBoot(Boot b){
        if(boot != null){
            unequipBoot();
        }
        if(b.wearer() != null){
            b.wearer().unequipBoot();
        }
        boot = b;
        b.equip(this);
    }


    public void unequipRing(){
        if (ring!=null) {
            ring.unequip();
            ring = null;
        }
    }

    public void unequipGauntlet(){
        if (gauntlet!=null) {
            gauntlet.unequip();
            gauntlet = null;
        }
    }

    public void unequipBoot(){
        if (boot!=null) {
            boot.unequip();
            boot = null;
        }
    }

    protected void HPcompute(int h){
         hp+=h;
         if(hp<0){
             hp = 0;
         } else if (hp>maxhp) {
             hp = maxhp;
         }
    }

    public void attack(Character enemy){
        System.out.println(name+" attack "+enemy.name);

        if(atk>0) {
            System.out.println(enemy.name+" is received "+atk+" damage.");
            enemy.hp -= atk;
        }
        else {
            System.out.println(enemy.name+" takes no damage.");
        }

        if (enemy.hp<=0) {
            enemy.hp=0;
            System.out.println(enemy.name+" is died");
        }
    }

    public void showStatus(){
        System.out.println("---------------- Hero Name : "+name+" ----------------");
        System.out.println("LV : "+lv);
        System.out.println("Hp : "+hp+"/"+maxhp);
        System.out.println("Mp : "+mp+"/"+maxmp);
        System.out.println("Attack : "+atk);
        System.out.println("Speed : "+spd);
        System.out.println("--------------------------------------------------");
    }

}
