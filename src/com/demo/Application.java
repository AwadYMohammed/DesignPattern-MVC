package com.demo;

import javax.swing.SwingUtilities;

import com.demo.controller.Controller;
import com.demo.model.Model;
import com.demo.view.View;


public class Application {
	public static void main(String[] args) {
		
		Game game = new Game();
		
		// Game loop
		while(true) {
			game.update();
		}
	}

}