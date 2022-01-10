package view;

import Controller.Controller;
import Repository.BestellungenRepository;
import Repository.ProdukteRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private Controller controller;

    public View() {
        ProdukteRepository produkteRepository = new ProdukteRepository();
        BestellungenRepository bestellungenRepository = new BestellungenRepository();
        this.controller = new Controller(produkteRepository, bestellungenRepository);
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""
                     
                     0. Exit Program \r
                     1. Add a product \r
                     2. Add an order \r
                     3. Delete a product \r
                     4. Delete an order \r
                     5. Update a produkt \r
                     6. Update an order \r
                     7. Sort orders by price \r
                     8. Filter orders by products \r
                    """);
            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                case 0:

                    break loop;
                case 1:
                    addProduct();
                    break;
                case 2:
                    deleteProduct();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
            }

        }
    }

    private void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name:");
        String name = scanner.nextLine();
        System.out.println("Enter product price:");
        int preis = scanner.nextInt();
        scanner.nextLine(); //throw away the \n not consumed by nextInt()

        controller.addProdukt(name, preis);
    }

    private void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name:");
        String name = scanner.nextLine();
        controller.deleteProdukt(name);
    }
}

