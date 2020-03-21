package com.company;

import java.util.ArrayList;
import java.util.List;

public class Factura implements ISalvare{
    private String descriereFactura;
    private int codFactura;
    private int numarProduseAchizitionate;

    public Factura(String descriereFactura, int codFactura, int numarProduseAchizitionate) {
        this.descriereFactura = descriereFactura;
        this.codFactura = codFactura;
        this.numarProduseAchizitionate = numarProduseAchizitionate;
    }

    public Factura(){}

    public String getDescriereFactura() {
        return descriereFactura;
    }

    public void setDescriereFactura(String descriereFactura) {
        this.descriereFactura = descriereFactura;
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public String getNumarProduseAchizitionate() {
        return getNumarProduseAchizitionate();
    }

    public void setNumarProduseAchizitionate(int numarProduseAchizitionate) {
        this.numarProduseAchizitionate = numarProduseAchizitionate;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "descriereFactura='" + descriereFactura + '\'' +
                ", codFactura=" + codFactura +
                ", numarProduseAchizitionate=" + numarProduseAchizitionate +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> valoriFactura=new ArrayList<>();
        valoriFactura.add(0,this.descriereFactura);
        valoriFactura.add(1,""+this.numarProduseAchizitionate);
        valoriFactura.add(2,""+this.codFactura);

        return valoriFactura;
    }


}
