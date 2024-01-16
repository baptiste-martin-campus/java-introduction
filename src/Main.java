import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //enumerate_while(100);
        //enumerate_for(100);
        //enumerate_even(100);
        //carre_sup(63);
        //carre_inf(63);
        //fibo(10);
        approximation_fibo(0.01);
        //describe();
        String txt = "000T000000000000000000000000000000o0000u00000000000j0o0000000u0000000000r00s0000\n" +
                "c00o0000d00000e000000000000r000000000000000000\n" +
                "00000c0000000000o000m00000000000000m0e000 000000000s00i0000000000 0l000e00000000\n" +
                "g000000000000a00000000000000000r0s0000\n" +
                "000000000000000000000000000q00000u0000000000000000000000000i00000000\n" +
                "000f000i0ni00000r0000000a 000p00000a00000r0000000000000000000000000000000m00000000000000a000in0t000000e00n000000000i00r0000000000000000\n" +
                "00000000000v00000000000o0000000t00r0000000e000000000 0c000o00d000000000e000000000\n" +
                "00e0000000000000000000000000000000000s0t0000000000000000000 0000000000000u0n00000\n" +
                "0000000000000000000000000000000ps00000000y000000000000000000c0h0000000op00000a0t000\n" +
                "0h0e0\n" +
                "000000000000000v00000000000i00000000000000000000000000000000000000o0000l0000en00t\n" +
                "0000000q0u000000000i 00000000sa00000it00000 000où0000000000\n" +
                "000000v0000000o0000000000u000000000000000s000000000000000000\n" +
                "00000v00000000000000i00000000v0000000000000000000000000000e0000000000z0000000\n" +
                "00(000000c0i0000000000000000000ta0ti0o00000000n 000000d000000000000000000e00\n" +
                "00J000o00000000000000h0n00 0W00o000000000000o00000000000d0000000s0000000000)0.";
        //decrypt(txt);
    }

    // Exercice 1
    public static void enumerate_while(int max) {
        int i = 0;
        System.out.println("Boucle While : ");
        while (i < max) {
            System.out.println(i);
            i++;
        }
    }

    public static void enumerate_for(int max) {
        System.out.println("Boucle For : ");
        for (int i = 0; i < max; i++) {
            System.out.println(i);
        }
    }

    public static void enumerate_even(int max) {
        System.out.println("Nombres pairs : ");
        for (int i = 0; i < max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


    // Exercice 2

    public static void carre_sup(int repide) {
        int n = (int) Math.ceil(Math.sqrt(repide));
        System.out.println("Plus petit carré supérieur : " + (n * n));
    }

    public static void carre_inf(int repide) {
        int n = (int) Math.floor(Math.sqrt(repide));
        System.out.println("Plus grand carré inférieur : " + (n * n));
    }

    // Exercice 3

    public static int[] fibo(int count) {
        int n1 = 0, n2 = 1, n3;
        int[] arr = new int[0];
        //System.out.print(n1 + " " + n2);
        arr = push(arr, n1);
        arr = push(arr, n2);
        for (int i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            arr = push(arr, n3);
            n1 = n2;
            n2 = n3;
        }
        //System.out.println("Suite Fibonacci" + Arrays.toString(arr));
        return arr;
    }

    public static int[] push(int[] arr, int x) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = x;
        return newArr;
    }

    public static double[] approximation_fibo(double epsilon) {
        int[] arr = fibo(20);
        double[] finalArr = new double[2];
        float phi = (float) (1 + Math.sqrt(5)) / 2;

//        for (int i = 2; Math.abs(((float)arr[i]/(float)arr[i-1]) - phi) > epsilon; i++) {
//            finalArr[0] = arr[i];
//            finalArr[1] = arr[i-1];
//            }

        int i = 2;
        while (Math.abs( ((float)arr[i]/(float)arr[i-1]) - phi) > epsilon){
            //float nter = Math.abs( ((float)arr[i]/(float)arr[i-1]));
            i++;
        }
        finalArr[0] = arr[i];
        finalArr[1] = arr[i-1];
        System.out.println("Suite Fibonacci Epsilon" + Arrays.toString(finalArr));
        return finalArr;
    }


    // Exercice 4

    public static void describe() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Jean");
        arr.add("Ahmed");
        arr.add("Lea");
        arr.add("Blanca");
        for (String el : arr) {
            to_upper_case(arr);
            //el = el.toUpperCase();
            if (el.length() > 4) {
                System.out.println(el + ':' + el.length());
            }
        }
    }

    public static ArrayList[] to_upper_case(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i).toUpperCase());
        }
        return new ArrayList[]{arr};
    }


    // Exercice 5

    public static <string> String decrypt(String str) {
        str = str.replace("0", "");
        System.out.println(str);
        return str;
    }

}