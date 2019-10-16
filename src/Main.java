

public class Main {
    static int[] arrayOfInts = {0,1,2,3,4};

    static void change (int[] t){
        t[0] = 5;
    }

    public static void main(String args[]){
        change(arrayOfInts);
        //System.out.println(arrayOfInts[0]);
        //Q1- La fonction change prend en parametre une copie de l'adresse du tableau, ce qui lui permet d'avoir un accès directe au contenu du tableau

        //Création d'un tableau vide
        IntTab liste=new IntTab();
        //Ajout d'élément à la fin du tableau
        liste.addLast(3);
        liste.addLast(7);
        liste.addLast(1);
        liste.addLast(8);  
        liste.addLast(2);

        //affichage du tableau avant toute opération
        System.out.println(liste.getSize());
        System.out.println(liste.toString());

        //récupération et modification d'un élément dans le tableau
        System.out.println(liste.get(3)); //resultat attendu est 8
        //liste.set(5, 3); //resultat attendu est tab=[3,7,1,5,2]

        //suppression d'un élément du tableau
        //liste.remove(2);  //resultat attendu est Tab=[3,7,8,2]

        //Insertion à la position i
        //liste.insert(6, 2); //resultat attendu est Tab=[3,7,6,1,8,2]

        //Redimenssionner le tableau
        //liste.resize(8); //resultat attendu est Tab=[3,7,6,1,8,2,0,0,0]

        System.out.println(liste.getSize());
        System.out.println(liste.toString());
    }
}
