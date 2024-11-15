package com.pluralsight.KioskInterface;

public interface IPricable {
    default double calculatePrice() {
        return 0;
    }
}

