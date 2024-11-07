package FilesManager;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String pathIn = "C:\\Users\\IB\\Desktop\\Dev\\ib_java\\ExerciceCar\\src\\main\\java\\FilesManager\\fichier_sortie.txt";
        String pathOut = "C:\\Users\\IB\\Desktop\\Dev\\ib_java\\ExerciceCar\\src\\main\\java\\FilesManager\\fichier_entree.txt";

        try (FileWriter fileIn = new FileWriter(pathIn);
        FileReader fileOut = new FileReader(pathOut);
        BufferedReader bufferedReader = new BufferedReader(fileOut);
        ) {
            int i = 0;
            System.out.println("\n" +
                    "Lignes lues :\n");
            while (bufferedReader.ready()) {
                i += 1;
                String buffer = bufferedReader.readLine();
                fileIn.write(i + " " + buffer + "\n");
                System.out.println(i + " " + buffer + "\n");
            }
            System.out.println("Écriture terminée avec succès dans " + pathIn);
        }  catch (FileNotFoundException e) {
            System.out.println("Le fichier d'entrée n'existe pas." + e.getMessage());
        }catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }


//        String pathIn = "C:\\Users\\IB\\Desktop\\Dev\\ib_java\\ExerciceCar\\src\\main\\java\\FilesManager\\fichier_sortie.txt";
//        String pathOut = "C:\\Users\\IB\\Desktop\\Dev\\ib_java\\ExerciceCar\\src\\main\\java\\FilesManager\\fichier_entree.txt";
//
//        try (FileWriter fileIn = new FileWriter(pathIn);
//             FileReader fileOut = new FileReader(pathOut);
//             BufferedReader bufferedReader = new BufferedReader(fileOut);
//             ) {
//            int i = 0;
//            System.out.println("\n" +
//                    "Lignes lues :\n");
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("\n" +
//                    "Entrez le mot :\n");
//            String search = scanner.nextLine();
//            while (bufferedReader.ready()) {
//                String buffer = bufferedReader.readLine();
//                if (buffer.contains(search)) {
//                    i++;
//                    fileIn.write(i + " " + buffer + "\n");
//                    System.out.println(i + " " + buffer + "\n");
//                }
//            }
//            System.out.println("Écriture terminée avec succès dans " + pathIn);
//        }  catch (FileNotFoundException e) {
//            System.out.println("Le fichier d'entrée n'existe pas." + e.getMessage());
//        }catch (IOException e) {
//            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
//        }
    }
}
