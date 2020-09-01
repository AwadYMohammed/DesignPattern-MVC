package com.demo.view;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import com.demo.model.Model;

public class View extends JFrame {
	private Model model;

	public View(Model model) throws HeadlessException {
		super();
		this.model = model;
	}

}
