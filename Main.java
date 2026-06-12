import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Car {
    String make;
    String model;
    String trim;
    int horsepower;
    String EngineType;
    String Drivetrain;
    int year;
    double price;
    double acceleration;
    double topSpeed;

    public Car(String make, String model, String trim, int horsepower, String engineType, String drivetrain , int year, double price, double acceleration, double topSpeed) {
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.horsepower = horsepower;
        this.EngineType = engineType;
        this.Drivetrain = drivetrain;
        this.year = year;
        this.price = price;
        this.acceleration = acceleration;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + " " + trim + " | Horsepower: " + horsepower + " HP | Engine: " + EngineType + " | Drivetrain: " + Drivetrain + " | Price: $" + price + " | 0-60 mph: " + acceleration + " sec | Top Speed: " + topSpeed + " mph";
    }
}

class Customer {
    String name;
    int age;
    double monthlyIncome;

    public Customer(String name, int age, double monthlyIncome) {
        this.name = name;
        this.age = age;
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public String toString() {
        return "Customer: " + name + " | Age: " + age + " | Monthly Income: $" + monthlyIncome;
    }
}

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Customer> customerQueue = new PriorityQueue<>(Comparator.comparingDouble(c -> -c.monthlyIncome));

        // Task 1: Making a linked list for the Cars.
        LinkedList<Car> carLineup = new LinkedList<>();

        // Lexus Models
        carLineup.add(new Car("Lexus", "LFA", "Founders Edition", 572, "4.8L V10", "RWD", 2012, 531890, 3.7, 180));
        carLineup.add(new Car("Lexus", "RC F", "Track Edition", 472, "5.0L V8", "RWD", 2021, 67000, 3.9, 168));
        carLineup.add(new Car("Lexus" , "LC 500" , "Gazoo Racing Edition", 581, "5.0L V8", "RWD", 2023, 94560, 3.67, 177));
        

        //Genesis Models
        carLineup.add(new Car("Genesis", "G70", " Magma Sport", 497, "3.0 I6 Twin-Turbo", "AWD", 2026, 68000, 3.4, 177));
        carLineup.add(new Car("Genesis", "GV70", "Magma", 613, "3.0L I6 Twin-Turbo", "AWD", 2026, 88000, 3.3, 184));
        carLineup.add(new Car("Genesis", "G80", "Magma", 797, "4.4 V8 Twin-Turbo Hybrid", "AWD", 2026, 104000, 2.8, 185));
        carLineup.add(new Car("Genesis", "GV80", "Magma Sport", 614, "4.4L V8 Twin-Turbo Hybrid", "AWD", 2025, 95000, 3.8, 179));
        carLineup.add(new Car("Genesis", "GV80 Coupe", "Magma Sport", 614, "4.4L V8 Twin-Turbo Hybrid", "AWD", 2025, 98000, 3.6, 180));
        carLineup.add(new Car("Genesis", "G90", "Magma", 838, "4.4 L V8 Twin-Turbo Hybrid", "AWD", 2024, 140000, 2.7, 190)); 


        // Audi Models
        carLineup.add(new Car("Audi", "RS6", "Avant", 633, "4.0L V8 Turbo", "Quattro AWD", 2025, 137800, 3.2, 190));
        carLineup.add(new Car("Audi", "R8 V10", "Spyder", 611, "5.2L V10", "Quattro AWD", 2019, 174900, 3.1, 215));
        carLineup.add(new Car("Audi", "RSQ8", "Mansory ", 800, "4.0L V8 Turbo", "Quattro AWD",2024, 160000, 3.4, 190));
        carLineup.add(new Car("Audi", "e-tron GT", "RS", 637, "Dual-Motor Electric", "AWD", 2023, 145000, 3.1, 155));
        carLineup.add(new Car("Audi", "S8", "Plus", 563, "4.0L V8 Turbo", "Quattro AWD", 2022, 130000, 3.6, 190));

        // Rolls Royce Models
        carLineup.add(new Car("Rolls Royce", "Cullinan", "Mansory", 557 , "6.75L V12 Twin-Turbo", "AWD", 2022, 654000, 4.0  , 165));
        carLineup.add(new Car("Rolls Royce", "Ghost", "Black Badge", 603, "6.75L V12 Twin-Turbo", "RWD", 2024, 510000, 4.4, 155));
        carLineup.add(new Car("Rolls Royce", "Spectre", "Henessey", 563, "Electric", "AWD", 2026, 450000, 3.7, 155));

        // Mercedes Benz Models
        carLineup.add(new Car("Mercedes Benz", "S-Class", "AMG S63", 798, "4.0L V8 Biturbo", "4MATIC+ AWD", 2025, 180000, 2.9, 186));
        carLineup.add(new Car("Mercedes Benz", "GT", "AMG 63s", 815, "4.0L V8 Biturbo", "4MATIC+ AWD", 2025, 172000, 2.7, 198));
        carLineup.add(new Car("Mercedes Benz", "AMG", "Brabus Rocket 900", 903, "4.0L V8 Biturbo", "4MATIC+ AWD", 2023, 210000, 2.64, 205));
        carLineup.add(new Car("Mercedes Benz", "GLE", "AMG 63s", 603, "4.0L V8 Biturbo", "4MATIC+ AWD", 2024, 115000, 3.7, 174));
        carLineup.add(new Car("Mercedes Benz", "GLS", "AMG 63s", 603, "4.0L V8 Biturbo", "4MATIC+ AWD", 2024, 130000, 4.1, 174));

        // Porsche Models
        carLineup.add(new Car("Porsche", "Cayenne", "Turbo GT", 646, "4.0L V8 Twin-Turbo", "AWD", 2023, 190000,2.7, 196));
        carLineup.add(new Car("Porsche", "911", "Turbo S", 640, "3.8L Flat-6 Twin-Turbo", "AWD", 2025, 230000, 2.5, 205));
        carLineup.add(new Car("Porsche", "Taycan", "Turbo S", 1100, "Tri-Motor", "AWD", 2026, 149990, 2.1, 200));
        carLineup.add(new Car("Porsche", "911", "GT3 RS", 490, "4.0L Flat-6 Naturally Aspirated", "RWD", 2020, 110000, 3.5, 193));
        carLineup.add(new Car("Porsche", "Panamera", "Turbo S E-Hybrid", 743, "4.0L V8 Twin-Turbo + Electric Motor", "AWD", 2025, 199000, 2.85, 192));

        // Cadillac Models
        carLineup.add(new Car("Cadillac", "Escalade", "V", 682, "6.2L V8 Supercharged", "AWD", 2025, 160000, 4.4, 130));
        carLineup.add(new Car("Cadillac", "CT5-V", "Blackwing", 668, "6.2L V8 Supercharged", "RWD", 2021, 90000, 3.4, 200));
        carLineup.add(new Car("Cadillac", "Escalade IQ", "1000 e4", 900, "Electric", "AWD", 2026, 186000, 3.6, 155));
        

        // BMW Models
        carLineup.add(new Car("BMW", "M5", "Competition Sport Edition 1", 722, "4.4L V8 Twin-Turbo", "xDrive AWD", 2022, 135000, 2.6, 209));
        carLineup.add(new Car("BMW", "M3", "Competition Sport", 543, "3.0L Inline-6 Twin-Turbo", "xDrive AWD", 2024, 102000,2.8, 180));
        carLineup.add(new Car("BMW", "M4", "Competition Sport Lightweight", 503, "3.0L Inline-6 Twin-Turbo", "xDrive", 2023, 139000, 3.0, 180));
        carLineup.add(new Car("BMW", "M8", "Competition", 617, "4.4L V8 Twin-Turbo", "xDrive AWD", 2024, 160000, 2.8, 190));
        carLineup.add(new Car("BMW", "X6 M", "Mansory", 750, "4.4L V8 Twin-Turbo", "xDrive AWD", 2024, 195000, 3.0, 197));
        carLineup.add(new Car("BMW", "X5 M", "Nurburgring Edition", 617, "4.4L V8 Twin-Turbo", "xDrive AWD", 2021, 140000, 3.6, 187));
        

        // Bentley Models
        carLineup.add(new Car("Bentley", "Bentayga", "Speed", 626, "6.0L W12 Twin-Turbo", "AWD", 2024, 250000, 3.7, 190));
        carLineup.add(new Car("Bentley", "Continental GT", "Speed", 650, "6.0L W12 Twin-Turbo", "AWD", 2020, 199000, 3.3, 208));
        carLineup.add(new Car("Bentley", "Flying Spur", "W12 S", 626, "6.0L W12 Twin-Turbo", "AWD", 2023, 220000, 3.4, 198));

        // Lamborghini Models
        carLineup.add(new Car("Lamborghini", "Aventador", "SVJ", 759, "6.5L V12 Naturally Aspirated", "AWD", 2015, 512770, 2.4, 217));
        carLineup.add(new Car("Lamborghini", "Huracan", "EVO", 631, "5.2L V10 Naturally Aspirated", "AWD", 2018, 261274, 2.7    , 202));
        carLineup.add(new Car("Lamborghini", "Urus", "Performante", 641, "4.0L V8 Twin-Turbo", "AWD", 2022, 238000, 3.2, 190));
        carLineup.add(new Car("Lamborghini", "Revuelto", "LP 840-4", 819, "V12 Hybrid", "AWD", 2024, 550000, 2.5, 205));
        carLineup.add(new Car("Lamborghini", "Countach", "LPI 800-4", 814, "V12 Hybrid", "AWD", 2022, 2700000, 2.8, 221));

       //Electric Vehicles
        // Tesla Models
        carLineup.add(new Car("Tesla", "Model S", "Plaid Apex Edition", 1020, "Tri-Motor Electric", "AWD", 2025, 149990, 1.99, 200));
        carLineup.add(new Car("Tesla", "Model X", "Plaid", 1020, "Tri-Motor Electric", "AWD", 2024, 110000, 2.5, 163));
        carLineup.add(new Car("Tesla", "Roadster", "Space-X Edition", 1000, "Tri-Motor Electric", "AWD", 2026, 250000, 1.9, 250));

        // Lucid Models
        carLineup.add(new Car("Lucid", "Air", "Sapphire", 1234 , "Tri-Motor Electric", "AWD", 2025, 249000, 1.89, 205));
        carLineup.add(new Car("Lucid", "Gravity", "Dream Edition", 1050, "Dual-Motor Electric", "AWD", 2026, 120000, 2.5, 158));

        System.out.println("Welcome to Exotic Luxury Sports");
        System.out.println("We have a wide range of perforcance vehicles available in our lineup:");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        //Getting the Customer Info

        System.out.print("Enter number of customers: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter monthly income: ");
            double income = Double.parseDouble(scanner.nextLine());

            customerQueue.add(new Customer(name, age, income));
        }

        // Queue of Customers that was based on monthly income.

        Customer topCustomer = customerQueue.peek();
        if (topCustomer != null) {
            System.out.println("Welcome to Exotic Lux Sports " + topCustomer.name);
        } else {
            System.out.println("No customers available.");
        }

        System.out.println("\nHere is our exotic car lineup:");
        for (Car car : carLineup) {
            System.out.println(car);
        }

       
        System.out.println("You can drive off in your dream car as soon as today!, " + (topCustomer != null ? topCustomer.name : "") + "!");
        System.out.println ("We need a bit more information from you!");
       

       
while (!customerQueue.isEmpty()) {

    Customer currentCustomer = customerQueue.poll(); 
    System.out.println("\n==============================================");
    System.out.println("Welcome to Exotic Lux Sports, " + currentCustomer.name + "!");
    System.out.println("==============================================");

    System.out.print("Enter your budget: $");
    double budget = Double.parseDouble(scanner.nextLine());

    LinkedList<Car> affordableCars = new LinkedList<>();
    boolean found = false;

    System.out.println("\nCars within your budget:\n");

    for (Car c : carLineup) {
        if (c.price <= budget) {
            affordableCars.add(c);
            System.out.println(c);
            found = true;
        }
    }
// cars not found withing budget
    if (!found) {
        System.out.println("No cars match your budget. Moving to next customer.");
        continue; // next customer
    }
// when customer searches for a specific model, it ignores lower/ uppercase and spaces
    System.out.print("\nEnter the car Model you desire: ");
    String modelInput = scanner.nextLine().trim().toLowerCase();
    String cleanedInput = modelInput.replaceAll("\\s+", "");

    Car selectedCar = null;

    for (Car c : affordableCars) {
        String cleanedModel = c.model.toLowerCase().replaceAll("\\s+", "");
        if (cleanedModel.equals(cleanedInput)) {
            selectedCar = c;
            break;
        }
    }
// goes to next customer if no car found
    if (selectedCar == null) {
        System.out.println("No matching car found. Moving to next customer.");
        continue;
    }

    System.out.println("\nExcellent choice!");
    System.out.println("You selected: " + selectedCar);

// pricing and fees with finance formula.

    double destinationFreightCostBeforeTaxes = selectedCar.price + 1500.00;
    double salesTaxRate = 0.0625;
    double salesTax = destinationFreightCostBeforeTaxes * salesTaxRate;
    double totalCost = destinationFreightCostBeforeTaxes + salesTax;

    System.out.println("\nMSRP: $" + selectedCar.price);
    System.out.println("Destination & Freight: $1500.00");
    System.out.println("Sales Tax: $" + salesTax);
    System.out.println("Total Cost: $" + totalCost);

    System.out.print("\nWould you like to Finance or Pay in Full? ");
    String paymentOption = scanner.nextLine().trim().toLowerCase();

    if (paymentOption.equals("finance")) {

        System.out.print("Enter down payment amount: $");
        double downPayment = Double.parseDouble(scanner.nextLine());

        double financedAmount = totalCost - downPayment;
        double annualInterestRate = 0.06;
        int loanTermMonths = 36;
        double monthlyInterestRate = annualInterestRate / 12;

        double monthlyPayment = (financedAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));

        double totalPaid = monthlyPayment * loanTermMonths;
        double totalInterest = totalPaid - financedAmount;

        System.out.printf("Monthly Payment (%d months): $%.2f%n", loanTermMonths, monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);

    } else if (paymentOption.equals("pay in full")) {

        System.out.println("Total amount due today: $" + totalCost);

    } else {
        System.out.println("Invalid payment option.");
    }

    System.out.println("\nTransaction complete for " + topCustomer.name + "!");

    System.out.println("Thank you for choosing Exotic Lux Sports. We hope you enjoy your new ride, If more information is needed, we will contact you.");
   
}
    }
}
