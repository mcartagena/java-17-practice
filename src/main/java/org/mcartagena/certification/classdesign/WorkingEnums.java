package org.mcartagena.certification.classdesign;

enum Season{
    WINTER{
        public String getHours(){
            return "10am-3pm";
        }
    }, SPRING {
        public String getHours(){
            return "9am-5pm";
        }
    }, SUMMER {
        public String getHours(){
            return "9am-7pm";
        }
    }, FALL {
        public String getHours(){
            return "9am-5pm";
        }
    };
    public abstract String getHours();
}
public class WorkingEnums {
    public static void main(String[] args) {
        for(var season: Season.values()){
            System.out.println(season.name() + " " + season.ordinal() + " " + season.getHours());
        }
    }
}
