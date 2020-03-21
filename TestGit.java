package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestGit {

    public static void main(String[] args) {

        List<String> valoriFactura=new ArrayList<>();

        System.out.println("Hello Git ! Denumirea proiectului de licență este 'Aplicație apex pentru gestiunea documentelor '");
        Factura factura=new Factura("'Factura Lactate'",1,30);



        System.out.println(factura.toString());
        saveObject(factura);



    }

    public static void saveObject(ISalvare objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Salvare " + objectToSave.write().get(i) + " in memorie");
        }
    }


}








