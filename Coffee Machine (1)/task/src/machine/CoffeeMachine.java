package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int money = 550;
    static int milk = 540;
    static int coffee = 120;
    static int cups = 9;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        processCommand();

    }

    private static void processCommand() {
        String command;
        do {
            System.out.print("Write action (buy, fill, take, remaining, exit): \n> ");
            command = scanner.nextLine();
            switch (command) {
                case "buy":
                    buyDrink();
                    break;
                case "fill":
                    fillMachine();
                    break;
                case "take":
                    takeMoney();
                    break;
                case "remaining":
                    printInventory();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        }
        while (!command.equals("exit"));

    }

    private static void takeMoney() {
        System.out.printf("I gave you $ %d\n", money);
        money = 0;
    }

    private static void fillMachine() {
        System.out.print("Write how many ml of water do you want to add: \n" +
                "> ");
        water += scanner.nextInt();
        System.out.print("Write how many ml of milk do you want to add: \n" +
                "> ");
        milk += scanner.nextInt();
        System.out.print("Write how many grams of coffee beans do you want to add: \n" +
                "> ");
        coffee += scanner.nextInt();
        System.out.print("Write how many disposable cups of coffee do you want to add: \n" +
                "> ");
        cups += scanner.nextInt();


    }

    private static void buyDrink() {

        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: \n" +
                "> ");
        String option = scanner.nextLine();
        switch (option) {

            case "1":
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (coffee < 16) {
                    System.out.println("Sorry, not enough coffee!");
                    break;
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }

                water -= 250;
                coffee -= 16;
                money += 4;
                cups -= 1;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "2":
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if (coffee < 20) {
                    System.out.println("Sorry, not enough coffee!");
                    break;
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }

                water -= 350;
                coffee -= 20;
                milk -= 75;
                money += 7;
                cups -= 1;
                System.out.println("I have enough resources, making you a coffee!");

                break;
            case "3":
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if (coffee < 12) {
                    System.out.println("Sorry, not enough coffee!");
                    break;
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }
                water -= 200;
                milk -= 100;
                coffee -= 12;
                money += 6;
                cups -= 1;
                System.out.println("I have enough resources, making you a coffee!");

                break;
            case "back":
                break;
            default:
                System.out.println("Please make a valid choice");
                buyDrink();
                break;
        }

    }

    private static void printInventory() {
        System.out.printf("The coffee machine has:\n" +
                "%d of water\n" +
                "%d of milk\n" +
                "%d of coffee beans\n" +
                "%d of disposable cups\n" +
                "%d of money\n\n", water, milk, coffee, cups, money);


    }
}

