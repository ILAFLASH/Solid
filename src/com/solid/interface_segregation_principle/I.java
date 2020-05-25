package com.solid.interface_segregation_principle;

import java.util.Date;

public class I implements I1, I2 {
    @Override
    public String getName() {
        return "name2";
    }

    @Override
    public Date getDate() {
        return new Date();
    }
}
