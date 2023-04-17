package org.mcartagena.certification.beyondclasses;

import java.time.LocalDate;

public record RabbitFood(int size, String brand, LocalDate expires) {
    public static int MAX_STORAGE = 100;
    public RabbitFood(){
        this(0, "brand", LocalDate.now());
        if(expires.isAfter(LocalDate.now())) throw new RuntimeException();
    }
}
