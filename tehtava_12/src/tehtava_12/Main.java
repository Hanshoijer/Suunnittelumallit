package tehtava_12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Image> valokuvakansio = new ArrayList();
		Boolean loop = true;
		ListIterator<Image> listIterator;
		
		//Add photos
		for(int i=0; i<15;i++) {
			valokuvakansio.add(new ProxyImage("HiRes_10MB_Photo" + (i+1)));
		}
		listIterator = valokuvakansio.listIterator();
		
		//Print file titles
		System.out.println("Photos: ");
        valokuvakansio.forEach(Image::showData);
        
        //Browse
        Scanner scanner = new Scanner(System.in);
        
        while(loop) {
        	System.out.println("n: next photo, p: previous photo, e: exit");
        	switch (scanner.next()) {
	        	case "n":
	        		if (listIterator.hasNext()){
                        listIterator.next().displayImage();
                	}
                	else {
                        System.out.println("No next photo");
                    }
	        		break;
	        	case "p":
	        		if (listIterator.hasPrevious()){
                        listIterator.previous().displayImage();
                	}
                	else {
                        System.out.println("No previous photo");
                    }
	        		break;
	        	case "e":
	        		System.out.println("Exiting");
	        		loop = false;
	        		break;
        		
        	
        	}
        	
        }

	}

}
