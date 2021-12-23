package knu.mypackage;

import java.util.*;

public class FarmMnt {
    
    FarmHandler fhandler;
	
	public FarmMnt() {
		fhandler = new FarmHandler();
		
		Vector citizens = fhandler.getAllCitizen();
		printVectorContents("getAllCitizen()", citizens);
		
		Vector crops = fhandler.getAllCrop();
		printVectorContents("getAllCrop()", crops);
		
		Vector environments = fhandler.getAllEnvironment();
		printVectorContents("getAllEnvironment()", environments);
		
		Vector deliverys = fhandler.getAllDelivery();
		printVectorContents("getAllDelivery()", deliverys);
		
		Vector vegetables = fhandler.getAllVegetable();
		printVectorContents("getAllVegetable()", vegetables);
		
		Vector fruits = fhandler.getAllFruit();
		printVectorContents("getAllFruit()", fruits);
		
		Vector dogyes = fhandler.getAllDogye();
		printVectorContents("getAllDogye()", dogyes);
		
		Vector madals = fhandler.getAllMadal();
		printVectorContents("getAllMadal()", madals);
		
		Vector temperatures = fhandler.getAllTemperature();
		printVectorContents("getAllTemperature()", temperatures);
		
		Vector humiditys = fhandler.getAllHumidity();
		printVectorContents("getAllHumidity()", humiditys);
		
		Vector divisions = fhandler.getAllDivision();
		printVectorContents("getAllDivision()", divisions);
		
		Vector idnames = fhandler.getAllIdName();
		printVectorContents("getAllIdName()", idnames);
		
		Vector idnamea = fhandler.getAllIdNameA();
		printVectorContents("getAllIdNameA()", idnamea);
		
		Vector idnamed = fhandler.getAllIdNameD();
		printVectorContents("getAllIdNameD()", idnamed);
	}
	
	public void printVectorContents(String header, Vector v) {
		System.out.println("* "+ header );
		for (int i = 0; i < v.size(); i++) {
			Object obj = v.get(i);
			System.out.println(obj.toString()); // HTML
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FarmMnt();

	}

}
