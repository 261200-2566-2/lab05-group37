public class Devil extends Character{

    public Devil(String n){
        name = n;
        maxhp = 100;
        hp = maxhp;
        maxmp = 100;
        mp = maxmp;
        atk = 60;
        spd = 50;
    }

    @Override
    public void lvup(){
        lv++;
        maxhp+=10;
        maxmp+=10;
        hp+=10;
        mp+=10;
        atk+=6;
        spd+=3;
    }

    public void growl(Character e){
        if(mp>=25){
            e.atk-=20;
            e.spd-=15;
            if(e.atk<0) e.atk=0;
            if(e.spd<0) e.spd=0;
            mp-=25;
        }
    }

    public void lifeSteal(Character e){
        if(mp>=30){
            e.HPcompute(-atk*3/2);
            HPcompute(atk*3/2);
            mp-=30;
        }
    }
}
