package Lab3_3;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.Spring;

class CatIsNotGoodException  extends Exception {
	private String cat;

	public CatIsNotGoodException(String cat) {
		this.cat = cat;
	}
	public String Message() {
		String message = "Cat is... Errored?";
		return message;
	}
}

public class Dispatcher {
    static void PatCat(String cat) throws CatIsNotGoodException
    {
        if (cat == null)
        {
            throw new NullPointerException("Cat is... Gone...");
        }
        else if(cat == "error")
        {
            throw new CatIsNotGoodException("Cat is... Errored?");
        }
        else
        {
        	System.out.println("Good boy, " + cat + "!");
            System.out.println("");
        }
    }
	public static void main(String[] args) throws CatIsNotGoodException {
        String cat_1 = "Vognezir";
        String cat_2 = null;
        String cat_3 = "Paporotelapka";
        String cat_4 = "error";
        try {
            PatCat(cat_1);
            PatCat(cat_2);
        }
        catch (NullPointerException ex)
        {
        	System.out.println("Cat is... Gone...");
        	System.out.println("");
        }

        try {
            PatCat(cat_3);
            PatCat(cat_4);
        }
        catch (CatIsNotGoodException ex)
        {
        	System.out.println(ex.Message());
        	System.out.println("");
        }
	}
}