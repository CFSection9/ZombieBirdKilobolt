package com.red.ZombieBird;

import com.badlogic.gdx.Game;
import com.red.Screens.GameScreen;
import com.red.ZBHelpers.AssetLoader;

public class ZBGame extends Game {
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		AssetLoader.load();
		setScreen(new GameScreen());
	}
	
	@Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }

}
