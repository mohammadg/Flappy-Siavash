package com.mobeigi.flappysiavash.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Ground {
    private Texture ground;
    private Vector2 dimensions;
    private Rectangle bounds;

    public Ground(int x, int y, int width, int height) {
        ground = new Texture("images/ground.png");
        dimensions = new Vector2(width, height);
        bounds = new Rectangle(x, y, width, height);
    }

    public void dispose() {
        ground.dispose();
    }

    //Getter
    public Texture getGround() {
        return ground;
    }

    public Vector2 getDimensions() {
        return dimensions;
    }

    public Rectangle getBounds() {
        return bounds;
    }
}
