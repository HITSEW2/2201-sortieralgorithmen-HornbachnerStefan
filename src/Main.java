
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
                "Erik", "Alina", "Markus", "Sina", "Celine", "Nicole", "Thomas", "Anja", "Lukas", "Jennifer",
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
                "Nora", "Marcel", "Sandra", "Alexander", "Melanie", "Oliver", "Sabrina", "Daniel", "Verena", "Julius",
                "Annika", "Martin", "Selina", "Adrian", "Constantin", "Lucas", "Carina", "Florian", "Tanja", "Bastian",
                "Miriam", "Stefan", "Kristina", "Johannes", "Ricarda", "Marvin", "Tamara", "Benjamin", "Robin", "Marlene",
                "Erika", "Alina", "Markus", "Sina", "Celine", "Nicole", "Thomas", "Anja", "Lukas", "Jennifer",
                "Seven", "Nadja", "Kai", "Jacqueline", "Manuel", "Mareike", "Chris", "Eva", "Jens", "Michelle",
                "Thorsten", "Carla", "Nico", "Ina", "Andre", "Helena", "Vivien", "Björn", "Jasmin", "Lars",
                "Antonia", "Timo", "Ramona", "Kevin", "Theresa", "Rico", "Monika", "Ralf", "Elena", "Peter",
                "Heike", "Holger", "Diana", "Frank", "Birgit", "Georg", "Selma", "Tobias", "Nele", "Finn"
        };


        //Ausgabe unsortiert
        System.out.println("-----Selction Sort-----");
        System.out.println("Unsortiert:");
        ausgabe(namen);

        //Selection Sort
        selectionSort(namen);

        //Ausgabe sortiert
        System.out.println("Sortiert");
        ausgabe(namen);


        //Ausgabe unsortiert
        System.out.println("----Quick Sort----");
        System.out.println("Unsortiert:");
        ausgabe2(namen2);

        //Quick Sort
        quickSort(namen2, 0, namen2.length - 1);

        //Ausgabe sortiert
        System.out.println("Sortiert");
        ausgabe2(namen2);

    }

    public static void ausgabe(String[] namen){

        for (String freund : namen) {
            System.out.print(freund + " ");
        }

        System.out.println(" ");
        System.out.println("---------------------------------------------");
    }

    public static void ausgabe2(String[] namen2){

        for (String freund : namen2) {
            System.out.print(freund + " ");
        }

        System.out.println(" ");
        System.out.println("-------------------------------------------");
    }



//namen[min] > namen[j]
    public static void selectionSort(String[] namen){

        for (int i = 0; i < namen.length - 1; i++) {

            int min = i;
            for (int j = i + 1; j < namen.length; j++) {

                if (namen[min].compareToIgnoreCase(namen[j]) > 0) min = j;
            }

            //Austauschen
            String temp = namen[i];
            namen[i] = namen[min];
            namen[min] = temp;
        }


    }



    public static void quickSort(String[] namen2, int start, int end){

        if (end <= start) return; //base Case

        int pivot = partition(namen2, start, end);
        quickSort(namen2, start, pivot - 1);
        quickSort(namen2, pivot + 1, end);

    }



    public static int partition(String[] namen2, int start, int end){

        String pivot = namen2[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {

            if (namen2[j].compareToIgnoreCase(pivot) < 0){
                i++;
                String temp = namen2[i];
                namen2[i] = namen2[j];
                namen2[j] = temp;
            }

        }
        i++;
        String temp = namen2[i];
        namen2[i] = namen2[end];
        namen2[end] = temp;

        return i;

    }


}
