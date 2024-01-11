package com.MultilevelInheritanceEx2;
import java.util.Scanner;

class Applicant {
    private String name;
    private int age;

    public Applicant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayApplicantDetails() {
        System.out.println("Applicant: " + name + ", Age: " + age);
    }
}

class Loan extends Applicant {
    private double amount;

    public Loan(String name, int age, double amount) {
        super(name, age);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void displayLoanDetails() {
        displayApplicantDetails();
        System.out.println("Loan Amount: $" + amount);
    }
}

class Document extends Loan {
    private String documentType;

    public Document(String name, int age, double amount, String documentType) {
        super(name, age, amount);
        this.documentType = documentType;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void displayDocumentDetails() {
        displayLoanDetails();
        System.out.println("Document Type: " + documentType);
    }
}

public class MultilevelHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Applicant's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Applicant's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Loan amount: $");
        double loanAmount = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character

        System.out.print("Enter Document type: ");
        String documentType = scanner.nextLine();

        Document document = new Document(name, age, loanAmount, documentType);

        System.out.println("\nDetails of the Applicant, Loan, and Document:");
        document.displayDocumentDetails();
    }
}


