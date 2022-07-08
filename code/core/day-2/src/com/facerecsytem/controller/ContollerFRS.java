package com.facerecsytem.controller;

import com.facerecsytem.db.Face;

//pooja
public class ContollerFRS {

	public static void main(String[] args) {
		Face face=new Face();
		face.saveFacePixcelToDb();
		
		com.facerecsytem.ui.Face face2=new com.facerecsytem.ui.Face();
		face2.printFacePixelOnUI();
	}
}
