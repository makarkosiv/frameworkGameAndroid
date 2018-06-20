package com.mbarz.samplegame;

import android.graphics.Rect;

public class Projectile {
    private int x, y, speedX;
    private boolean visible;

    private Rect r;

    public Projectile(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        speedX = 7;
        visible = true;

        r = new Rect(0, 0, 0, 0);
    }

    public void update() {
        x += speedX;
        r.set(x, y, x + 10, y + 5);
        if (x > 800) {
            visible = false;
            r = null;
        }
        if (x < 800){
            checkCollision();
        }
    }

    private void checkCollision() {
        for (int i = 0; i < GameScreen.hbs.size(); i++) {
            Heliboy hb = GameScreen.hbs.get(i);
            if (Rect.intersects(r, hb.r)) {
                visible = false;
                if (hb.health > 0) {
                    hb.health -= 1;
                }
                if (hb.health == 0) {
                    hb.setCenterX(-100);
                }
            }
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
