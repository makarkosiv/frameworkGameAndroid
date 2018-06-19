package com.mbarz.framework;

import static com.mbarz.framework.Graphics.*;

public interface Image {

    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();

}
