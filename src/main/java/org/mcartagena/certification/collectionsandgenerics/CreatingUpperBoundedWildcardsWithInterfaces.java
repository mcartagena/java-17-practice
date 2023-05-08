package org.mcartagena.certification.collectionsandgenerics;

import java.util.ArrayList;
import java.util.List;

interface Flyer{
    void fly();
}
class HangGlider implements Flyer{
    public void fly(){

    }
}
class Goose implements Flyer{
    public void fly(){

    }
}
public class CreatingUpperBoundedWildcardsWithInterfaces {
    private void anyFlayer(List<Flyer> flyer){

    }
    private void groupOfFlyers(List<? extends Flyer> flyer){

    }

    public static void main(String[] args) {
        Goose goose = new Goose();
        Flyer hangGlider = new HangGlider();

        List<Flyer> listFlyer = new ArrayList<>();
        listFlyer.add(goose);

        List<Goose> listGoose = new ArrayList<>();
        listGoose.add(goose);

        var obj = new CreatingUpperBoundedWildcardsWithInterfaces();
        obj.anyFlayer(listFlyer);
        obj.groupOfFlyers(listGoose);
    }
}
