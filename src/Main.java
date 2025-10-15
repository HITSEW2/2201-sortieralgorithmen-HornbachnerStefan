
public class Main {
    public static void main(String[] args) {

        //Freundes String Liste
        String[] namen = {
                "Anna", "Max", "Laura", "Felix", "Lena", "Paul", "Sophie", "Jonas", "Marie", "Luca",
                "Emma", "Leon", "Mia", "Elias", "Lea", "Tim", "Clara", "Noah", "Nina", "Ben",
                "Julia", "Moritz", "Hannah", "Philipp", "Amelie", "Niklas", "Lina", "Julian", "Maya", "David",
                "Emily", "Tom", "Sarah", "Fabian", "Lisa", "Jan", "Franziska", "Simon", "Katharina", "Tobias",
                "Melina", "Sebastian", "Johanna", "Kevin", "Theresa", "Marco", "Vanessa", "Patrick", "Isabell", "Christian",
                "Jana", "Dominik", "Carolin", "Dennis", "Stefanie", "Andreas", "Nadine", "Rene", "Kathrin", "Daniel",
                "Nora", "Marcel", "Sandra", "Alexander", "Melanie", "Oliver", "Sabrina", "Pascal", "Verena", "Julius",
                "Annika", "Martin", "Selina", "Adrian", "Constantin", "Lucas", "Carina", "Florian", "Tanja", "Bastian",
                "Miriam", "Stefan", "Kristina", "Johannes", "Ricarda", "Marvin", "Tamara", "Benjamin", "Robin", "Marlene",
                "Erik", "Alina", "Markus", "Sina", "Celine", "Nicole", "Thomas", "Anja", "Dirk", "Jennifer",
                "Sven", "Nadja", "Kai", "Jacqueline", "Manuel", "Mareike", "Chris", "Eva", "Jens", "Michelle",
                "Thorsten", "Carla", "Nico", "Ina", "Andre", "Helena", "Vivien", "Björn", "Jasmin", "Lars",
                "Antonia", "Timo", "Ramona", "Kevin", "Theresa", "Rico", "Monika", "Ralf", "Elena", "Peter",
                "Heike", "Holger", "Diana", "Frank", "Birgit", "Georg", "Selma", "Tobias", "Nele", "Finn"
        };

        String[] namen2 = {
                "Anna", "Max", "Laura", "Felix", "Lena", "Paul", "Sophie", "Jonas", "Marie", "Luca",
                "Emma", "Leon", "Mia", "Elias", "Lea", "Tim", "Clara", "Noah", "Nina", "Beny",
                "Julia", "Moritz", "Hannah", "Philipp", "Amelie", "Niklas", "Lina", "Julian", "Maya", "David",
                "Emily", "Tom", "Sarah", "Fabian", "Lisa", "Jan", "Franziska", "Simon", "Katharina", "Tobias",
                "Melina", "Sebastian", "Johanna", "Kevin", "Theresa", "Marco", "Vanessa", "Patrick", "Isabell", "Christian",
                "Jana", "Dominik", "Carolin", "Dennis", "Stefanie", "Andreas", "Nadine", "Rene", "Kathrin", "Daniel",
                "Nora", "Marcel", "Sandra", "Alexander", "Melanie", "Oliver", "Sabrina", "Pascal", "Verena", "Julius",
                "Annika", "Martin", "Selina", "Adrian", "Constantin", "Lucas", "Carina", "Florian", "Tanja", "Bastian",
                "Miriam", "Stefan", "Kristina", "Johannes", "Ricarda", "Marvin", "Tamara", "Benjamin", "Robin", "Marlene",
                "Erika", "Alina", "Markus", "Sina", "Celine", "Nicole", "Thomas", "Anja", "Dirk", "Jennifer",
                "Seven", "Nadja", "Kai", "Jacqueline", "Manuel", "Mareike", "Chris", "Eva", "Jens", "Michelle",
                "Thorsten", "Carla", "Nico", "Ina", "Andre", "Helena", "Vivien", "Björn", "Jasmin", "Lars",
                "Antonia", "Timo", "Ramona", "Kevin", "Theresa", "Rico", "Monika", "Ralf", "Elena", "Peter",
                "Heike", "Holger", "Diana", "Frank", "Birgit", "Georg", "Selma", "Tobias", "Nele", "Finn"
        };


        //Ausgabe unsortiert
        ausgabe(namen);

        //Selection Sort
        selectionSort(namen);

        //Ausgabe sortiert
        ausgabe(namen);


        //Ausgabe unsortiert
        ausgabe2(namen2);

        //Quick Sort
        quickSort(namen2);

        //Ausgabe sortiert
        ausgabe2(namen2);

    }

    public static void ausgabe(String[] namen){

        for (String freund : namen) {
            System.out.print(freund + " ");
        }

        System.out.println(" ");
    }

    public static void ausgabe2(String[] namen2){

        for (String freund : namen2) {
            System.out.print(freund + " ");
        }

        System.out.println(" ");
    }

//namen[min] > namen[j]
    public static void selectionSort(String[] namen){

        for (int i = 0; i < namen.length - 1; i++) {

            int min = i;
            for (int j = 0; j < namen.length; j++) {

                if (namen[min].compareToIgnoreCase(namen[j]) > 0) min = j;
            }

            //Austauschen
            String temp = namen[i];
            namen[i] = namen[min];
            namen[min] = temp;
        }

        System.out.println(namen.length);


    }

    public static void quickSort(String[] namen2){

    }

}
