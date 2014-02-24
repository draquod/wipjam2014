package com.draquod.WipJam2014MD;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class WipJam2014MD extends Game {

	
	Stage stage;
	@Override
	public void create() {
		// TODO Auto-generated method stub
		
		stage = new Stage(1280, 720);
		
		
		
	}
	
	
	void gameLogic(float delta){
		
	}

	@Override
	public void render() {
		
		float delta = Gdx.graphics.getDeltaTime();
		
		gameLogic(delta);
		stage.act(delta);
		stage.draw();
		
		super.render();
	}
}
