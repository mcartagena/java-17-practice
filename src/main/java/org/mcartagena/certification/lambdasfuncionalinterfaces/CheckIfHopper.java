package org.mcartagena.certification.lambdasfuncionalinterfaces;

public class CheckIfHopper implements CheckTrait{
    public boolean test(Animal a) {
        return a.canHop();
    }
}
