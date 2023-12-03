public class Monk extends Character{
    public Monk(String n){
        name = n;
        maxhp = 100;
        hp = maxhp;
        maxmp = 150;
        mp = maxmp;
        atk = 30;
        spd = 40;
    }

    @Override
    public void lvup(){
        lv++;
        maxhp+=10;
        maxmp+=15;
        hp+=10;
        mp+=15;
        atk+=3;
        spd+=2;
    }

    public void prayer(Character f){
        if(mp>=40){
            f.maxhp+=20;
            f.hp+=20;

            f.maxmp+=25;
            f.mp+=25;

            f.atk+=30;
            f.spd+=20;

            mp-=40;
        }

    }

    public void heal(Character f){
        if(mp>=40){
            f.HPcompute(maxhp/3);
            mp-=40;
        }
    }
}
