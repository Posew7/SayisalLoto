package com.posew7.sayisalloto.mb;

import com.posew7.sayisalloto.entity.Loto;
import com.posew7.sayisalloto.session.LotoFacade;
import java.util.Arrays;
import java.util.Random;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "lotoMB")
@RequestScoped
public class LotoMB {

    @EJB
    private LotoFacade lotoFacade;

    private int no;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    private int sayilar[] = new int[6];

    public LotoMB() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public static final int MIN_DEGER = 1;
    public static final int MAX_DEGER = 49;
    public static final int ARRAY_BOY = 6;

    private int rastgeleSayiOlustur() {

        Random rand = new Random();

        return rand.nextInt(MAX_DEGER) + 1;

    }

    private boolean arrayDeVarMi(int p_sayi, int[] p_array) {

        Arrays.sort(p_array);

        int sonuc = Arrays.binarySearch(p_array, p_sayi);

        if (sonuc >= 0) {
            return true;
        } else {
            return false;
        }

    }

    private int[] arrayOlustur() {

        int[] sayilar = new int[6];

        int sayi = 0;

        for (int i = 0; i < sayilar.length; i++) {
            do {
                sayi = rastgeleSayiOlustur();
            } while (arrayDeVarMi(sayi, sayilar));
            sayilar[0] = sayi;
        }
        Arrays.sort(sayilar);
        return sayilar;
    }

    public String cevir() {

        int sayilar[] = arrayOlustur();

        a = sayilar[0];
        b = sayilar[1];
        c = sayilar[2];
        d = sayilar[3];
        e = sayilar[4];
        f = sayilar[5];

        Loto l = new Loto();

        l.setA(a);
        lotoFacade.create(l);
        l.setB(a);
        lotoFacade.create(l);
        l.setC(a);
        lotoFacade.create(l);
        l.setD(a);
        lotoFacade.create(l);
        l.setE(a);
        lotoFacade.create(l);
        l.setF(a);

        lotoFacade.create(l);

        return "";
    }

}
