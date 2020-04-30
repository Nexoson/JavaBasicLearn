package com.max.learn.design_patterns.build_method.demo02;

import com.max.learn.design_patterns.build_method.demo02.sub.CarbonFrame;
import com.max.learn.design_patterns.build_method.demo02.sub.InflateTire;
import com.max.learn.design_patterns.build_method.demo02.sub.RubberSeat;

/**
 * @ClassName OfoBuilder
 * @Auther huangX
 * @Date 2020/4/30 10:05
 * @Version 1.0
 * @Descripition Ofo具体的建造类
 **/
public class OfoBuilder extends Builder{
    private Bike ofoBike = new Bike();
    @Override
    void buildFrame() {
        ofoBike.setFrame(new CarbonFrame());
    }

    @Override
    void buildSeat() {
        ofoBike.setSeat(new RubberSeat());
    }

    @Override
    void buildTire() {
        ofoBike.setTire(new InflateTire());
    }

    @Override
    Bike createBike() {
        return ofoBike;
    }
}
