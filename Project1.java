import java.util.Scanner;

public class Project1 {
    static double BMI(double w,double h){
        return (double) w/(h*h);
    }
    static int count(int n){
        if(n==0){
            return 0;
        }return 1+count(n-1);
    }
    static int total(int[] arr){
        int sum =0;
        for(int x:arr){
            sum+=x;
        }return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name= scanner.nextLine();

        System.out.print("Enter height in meters : ");
        double height = scanner.nextDouble();

        System.out.print("Enter Weight in KGs : ");
        double weight = scanner.nextDouble();

        System.out.print("Enter Reps : ");
        int reps = scanner.nextInt();

        double bmi = BMI(weight, height);

        String[] exercises = {"Squats", "Push-ups", "Sit-ups", "Lunges","Burpees", "Crunches"};

        for(String j : exercises){
            System.out.println(j);
        }
        System.out.print("Enter exercise number (1-6): ");
        int choice = scanner.nextInt();

        if(choice<1 || choice >6){
            System.out.println("Invalid choice");
            scanner.close();
            return ;
        }
        int workout[] = new int[6];
        workout[choice-1]=reps;
        System.out.println("Excersice = "+exercises[choice-1]);

        int completed = 0;
        for(int i:workout){
            if(i>0){
                completed++;
            }
        }
        int sum = total(workout);
        double average = (completed==0)? 0:(double)sum/completed;
        int[][] weekly = {{10, 20}, {15, 25}};

        int weeklyTotal=0;
         for (int[] day : weekly){
            for (int x : day){
                weeklyTotal += x;
            }
         }

        System.out.println("\n===== FITNESS REPORT =====");
        System.out.println("Name: " + name);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Reps: " + count(reps));
        System.out.println("Calories: " + (0.005 * weight * reps));
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Weekly Total: " + weeklyTotal);

        System.out.println(reps >= 20 ? "Goal Achieved" : "Goal Not Achieved");

        scanner.close();
    }
}
