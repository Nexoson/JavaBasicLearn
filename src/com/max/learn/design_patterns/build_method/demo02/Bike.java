package com.max.learn.design_patterns.build_method.demo02;


import com.max.learn.design_patterns.build_method.demo02.sub.IFrame;
import com.max.learn.design_patterns.build_method.demo02.sub.ITire;
import com.max.learn.design_patterns.build_method.demo02.sub.Iseat;

/**
 * @ClassName Bike
 * @Auther huangX
 * @Date 2020/4/30 9:59
 * @Version 1.0
 * @Descripition 产品类(共享单车)
 **/
public class Bike {

    private IFrame frame;
    private Iseat seat;
    private ITire tire;

    public IFrame getFrame() {
        return frame;
    }

    public void setFrame(IFrame frame) {
        this.frame = frame;
    }

    public Iseat getSeat() {
        return seat;
    }

    public void setSeat(Iseat seat) {
        this.seat = seat;
    }

    public ITire getTire() {
        return tire;
    }

    public void setTire(ITire tire) {
        this.tire = tire;
    }
}
