package com.moneymoney.app.console.bootstrap;

import java.io.IOException;

import com.moneymoney.app.console.view.MMBankView;

/**
 * @author Sangeeta
 * 
 *         contains the main method to start the money money bank application
 *
 */
public class Bootstrap {

	public static void main(String[] args) {
		try {
			new MMBankView().start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
