package com.mobeigi.flappysiavash.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mobeigi.flappysiavash.AssetManager;

import java.util.Stack;

public class GameStateManager {

    private Stack<State> states;
    AssetManager assetManager;

    public GameStateManager() {
        this.states = new Stack<State>();
        this.assetManager = new AssetManager();
    }

    public void push(State state) {
        this.states.push(state);
    }

    public State pop() {
        return this.states.pop();
    }

    //Set new state (pops current stage calling dispose and pushes new state).
    public void set(State state) {
        this.states.pop().dispose();
        this.states.push(state);
    }

    public void update(float dt) {
        this.states.peek().update(dt);
    }

    public void render(SpriteBatch sb) {
        this.states.peek().render(sb);
    }
}
