package View;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    public static void main(String[] args) {
        String[] options = {"1- sign in",
                "2- Sign up",
                "3- Show Article",
                "4- Sign out",
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 4) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        signIn();
                        break;
                    case 2:
                        signUp();
                        break;
                    case 3:
                        showArticle();
                        break;
                    case 4:
                        exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }
    }

    // Options
    private static void signIn() {
        String[] options = {"1- Show my article",
                "2- Edit my article",
                "3- Add a new article",
                "4- View my unpublished articles",
                "5- Sign out"
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 5) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        showArticle();
                        break;
                    case 2:
                        editMyArticle();
                        break;
                    case 3:
                        addNewArticle();
                        break;
                    case 4:
                        viewUnpublishedArticle();
                        break;
                    case 5:
                        exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }
    }

    private static void signUp() {
        System.out.println("Thanks for choosing option 2");
    }

    private static void showArticle() {
        System.out.println("Thanks for choosing option 3");
    }

    private static void editMyArticle() {
        System.out.println("Thanks for choosing option 3");
    }

    private static void addNewArticle() {
        System.out.println("Thanks for choosing option 3");
    }
    private static void viewUnpublishedArticle() {
        System.out.println("Thanks for choosing option 3");
    }

}