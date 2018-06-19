package com.mbarz.samplegame;

import com.mbarz.framework.Screen;
import com.mbarz.framework.implementation.AndroidGame;

public class SampleGame extends AndroidGame {

    @Override
    public Screen getInitScreen() {
        return new LoadingScreen(this);
    }

    @Override
    public void onBackPressed() {
        getCurrentScreen().backButton();
    }
}
