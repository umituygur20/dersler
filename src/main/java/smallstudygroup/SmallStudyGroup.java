

package smallstudygroup;

import java.util.Scanner;

public class SmallStudyGroup {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight ");
        double weight = input.nextInt();
        System.out.println("Please enter your height");
        double   height = input.nextInt();
        double bmi = weight / height * height;


        if (bmi < 18) {
            System.out.println("If BMI is less than 18.5 , you re weak");
        } else if (bmi > 18.5 && bmi< 25) {
            System.out.println("If BMI is between 18.5 and 25 , your weight is ideal");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("If BMI is between 25 and 30, you re fat");
        } else if (bmi >= 30) {
            System.out.println("If BMI is more than or equal to 30, obese");
        }else {
            System.out.println("Opsss");
        }
    }
}

