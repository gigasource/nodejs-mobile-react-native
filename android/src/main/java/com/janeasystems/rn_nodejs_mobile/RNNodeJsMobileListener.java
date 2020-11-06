package com.janeasystems.rn_nodejs_mobile;

public interface RNNodeJsMobileListener {
    public void registerNodeEvent(String event);
    public void triggerEvent(String event);
    public boolean checkEvent(String event);
}
