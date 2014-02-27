package com.red.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.red.GameWorld.GameRenderer;
import com.red.GameWorld.GameWorld;
import com.red.ZBHelpers.InputHandler;

public class GameScreen implements Screen {

	private GameWorld world;
	private GameRenderer renderer;
	private float runTime = 0;
	
	public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();      
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);
        
        int midPointY = (int) (gameHeight / 2);

        world = new GameWorld(midPointY);
		renderer = new GameRenderer(world,(int) gameHeight, midPointY); // initialize renderer
		
		Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
	}
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		runTime += delta;
		world.update(delta); // GameWorld updates 
		renderer.render(runTime); // GameRenderer renders
	}

    @Override
    public void resize(int width, int height) {
        System.out.println("GameScreen - resizing");
    }

    @Override
    public void show() {
        System.out.println("GameScreen - show called");
    }

    @Override
    public void hide() {
        System.out.println("GameScreen - hide called");     
    }

    @Override
    public void pause() {
        System.out.println("GameScreen - pause called");        
    }

    @Override
    public void resume() {
        System.out.println("GameScreen - resume called");       
    }

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
