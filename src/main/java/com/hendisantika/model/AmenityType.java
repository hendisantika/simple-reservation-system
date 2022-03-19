package com.hendisantika.model;

/**
 * Created by IntelliJ IDEA.
 * Project : simple-reservation-system
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/03/22
 * Time: 09.04
 * To change this template use File | Settings | File Templates.
 */
public enum AmenityType {
    POOL("POOL"), SAUNA("SAUNA"), GYM("GYM");

    private final String name;

    AmenityType(String value) {
        name = value;
    }

    @Override
    public String toString() {
        return name;
    }
}
