package com.base.designpattern;
public interface State
{
    public void handlePush(Context context);

    public void handlePull(Context context);

    public String getColor();
}

