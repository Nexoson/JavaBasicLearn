package com.max.learn.design_patterns.build_method.demo02;

import com.max.learn.design_patterns.build_method.demo02.sub.AlloyFrame;
import com.max.learn.design_patterns.build_method.demo02.sub.DermisSeat;
import com.max.learn.design_patterns.build_method.demo02.sub.SolidTire;

/**
 * @ClassName MobikeBuilder
 * @Auther huangX
 * @Date 2020/4/30 10:03
 * @Version 1.0
 * @Descripition mBike具体的builder类
 **/
public class MobikeBuilder extends Builder {

    private Bike mBike = new Bike();


    @Override
    void buildFrame() { mBike.setFrame(new AlloyFrame());}

    @Override
    void buildSeat() {
        mBike.setSeat(new DermisSeat());
    }

    @Override
    void buildTire() {
        mBike.setTire(new SolidTire());
    }

    @Override
    Bike createBike() {
        return mBike;
    }
}
