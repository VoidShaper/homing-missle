package com.voidshaper.homingmissile;

import com.voidshaper.homingmissile.infrastructure.rest.RoomsResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HomingMissileApp extends Application<HomingMissileConfig> {
    public static void main(String[] args) throws Exception {
        new HomingMissileApp().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HomingMissileConfig> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HomingMissileConfig configuration,
                    Environment environment) {
        environment.jersey().register(new RoomsResource());
    }

}
