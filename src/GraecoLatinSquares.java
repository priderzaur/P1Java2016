/**
 * Created by riordachioaia on 12.02.2016.
 */

import java.util.concurrent.ThreadLocalRandom;

public class GraecoLatinSquares{

    /*public static void afisareInput(int n, int m, String[] S, String[] T) {
        System.out.println(n);
        System.out.println(m);
        System.out.println(String.join(",",S));
        System.out.println(String.join(",",T));
    }*/
    public static void afisareInput(int n, int m, String S, String T) {
        System.out.println(n);
        System.out.println(m);
        System.out.println(S);
        System.out.println(T);
    }

    public static void afisareExemplu(){
        System.out.println("|A\u03B1|B\u03B3|C\u03B2|");
        System.out.println("|B\u03B2|C\u03B1|A\u03B3|");
        System.out.println("|C\u03B3|A\u03B2|B\u03B1|");
        System.out.println();
    }
    public static void main(String[] args) {

        afisareExemplu();
        int n, m;

        /*char[] S, T;
        if (args.length != 4){
            n=ThreadLocalRandom.current().nextInt(0, 23 + 1);
            m=1;
            S=new char[n];
            T=new char[n];
            for (int i=0;i<n;i++){
                S[i]=(char)(97+i);
                T[i]=(char)(0x03B1+i);
            }
            System.out.println(n);
            System.out.println(m);
            System.out.println(S);
            System.out.println(T);
        }*/

        String S;
        String T;
        if (args.length != 4){
            n = ThreadLocalRandom.current().nextInt(0, 26 + 1);
            m=1;
            StringBuilder builderS = new StringBuilder();
            StringBuilder builderT = new StringBuilder();
            for (int i=0;i<n;i++){
                /*S[i]=Character.toString((char)(97+i));
                T[i]=Character.toString((char)(0x03B1+i));*/
                builderS.append((char)(65+i));
                builderT.append((char)(0x03B1+i));
            }
            S=builderS.toString();
            T=builderT.toString();
            afisareInput(n,m,S,T);
        }
        else {
            try {
                n = Integer.parseInt(args[0]);
                m = Integer.parseInt(args[1]);
                S = args[2];
                T = args[3];
                afisareInput(n,m,S,T);
            }
            catch (NumberFormatException exc) {
                System.out.println("n si m trebuie sa fie numere!");
            }
        }


    }
}
