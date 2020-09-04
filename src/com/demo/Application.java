package com.demo;

import javax.swing.SwingUtilities;

import com.demo.controller.Controller;
import com.demo.model.Model;
import com.demo.view.View;


public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				runApp();
			}
			
		});
	}
	
	public static void runApp() {
		Model model = new Model();
		View view = new View(model);

		Controller controller = new Controller(view, model);
	}

}