package org.mcartagena.certification.classdesign;

public class Rodent {

    public Rodent(){}  // created for compatibility with Beaver class

    public Rodent(Integer x){}

    protected static Integer chew() throws Exception{
        System.out.println("Rodent is chewing");
        return 1;
    }
}

class Beaver extends Rodent{
    // public Number chew() throws RuntimeException{  //  attempting to use incompatible return type
    // public Integer chew() throws RuntimeException{  // cannot override static method
    public static Integer chew() throws RuntimeException{
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}
