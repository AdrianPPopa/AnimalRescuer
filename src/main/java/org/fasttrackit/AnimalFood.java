package org.fasttrackit;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class AnimalFood {
    String name;
    double price;
    int quantity;
    int stockAvailability;
    String expirationDate;
    LocalDate createdDate;
    LocalDate localDate = LocalDate.now();
    String pattern = "yyyy-MM-dd";
    public SimpleDateFormat simpleDateFormat;

    public AnimalFood() {
        simpleDateFormat = new SimpleDateFormat(pattern);
    }
}
