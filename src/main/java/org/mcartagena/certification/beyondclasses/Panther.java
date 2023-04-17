package org.mcartagena.certification.beyondclasses;

import java.util.*;

interface Walk {
    private static List move(){
        return null;
    }
}
interface Run extends Walk {
    public ArrayList move();
}
class Leopard implements Walk{
    public List move(){
        return null;
    }
}
public class Panther implements Run{
    public ArrayList move(){
        return null;
    }
}
