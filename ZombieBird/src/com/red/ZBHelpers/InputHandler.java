package com.red.ZBHelpers;

import com.badlogic.gdx.InputProcessor;
import com.red.GameObjects.Bird;

public class InputHandler implements InputProcessor {
	public Bird myBird;
	
	 // Ask for a reference to the Bird when InputHandler is created.
    public InputHandler(Bird bird) {
        // myBird now represents the gameWorld's bird.
        myBird = bird;
    }
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {

		myBird.onClick();
        return true; // Return true to say we handled the touch.
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
