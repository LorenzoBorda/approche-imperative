package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args){
        int[] tableauInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(tableauInt[0]);
        System.out.println(tableauInt.length);
        System.out.println(tableauInt[tableauInt.length-1]);
        tableauInt[4] = 8;
    }
}
