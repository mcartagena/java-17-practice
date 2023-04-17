package org.mcartagena.certification.beyondclasses;

public class Ostrich {
    private int count;
    static class OstrichWrangler {
        public int stampede(){
            // return count;  // Non-static field 'count' cannot be referenced from a static context
            return 0;
        }
    }
}
