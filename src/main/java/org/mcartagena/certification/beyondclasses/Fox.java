package org.mcartagena.certification.beyondclasses;

public class Fox {
    private class Den {}
    public void goHome(){
        new Den();
    }

    public static void visitFriend() {
        new Fox().new Den();  // cannot be referenced from a static context without new Fox()
    }
}
