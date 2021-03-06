package com.mobeigi.flappysiavash;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mobeigi.flappysiavash.states.GameStateManager;
import com.mobeigi.flappysiavash.states.MenuState;

public class FlappySiavashGame extends ApplicationAdapter {
	public static final int WIDTH = 480;
	public static final int HEIGHT = 800;
	public static final String TITLE = "Flappy Siavash";
	public static final String VERSION = "1.0.0";

	private GameStateManager gsm;
	private SpriteBatch sb;

	@Override
	public void create () {
		gsm = new GameStateManager();
		sb = new SpriteBatch();

		Gdx.gl.glClearColor(0f, 0.0f, 0.4f, 0.5f);

		gsm.push(new MenuState(gsm));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(sb);
	}

	@Override
	public void dispose () {
		sb.dispose();
	}
}
