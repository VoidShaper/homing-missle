package com.voidshaper.homingmissile;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class HomingMissileConfig extends Configuration {
    @NotEmpty
    private String testParam = "This is test parameter";

    @JsonProperty
    public String getTestParam() {
        return testParam;
    }
}
