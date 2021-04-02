import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner3 =new Scanner(System.in);

        System.out.println("Nhập cân nặng của bạn");
        double weight = scanner3.nextDouble();
        System.out.println("Nhập chiều cao của bạn");
        double height = scanner3.nextDouble();

        double bmi = weight/(height*height);

        if (bmi<18.5){
            System.out.printf("%-20.2f%s",bmi,"UnderWeight"  );
        }else if(bmi<=25.0){
            System.out.printf("%-20.2f%s",bmi,"Normal"  );
        }else if(bmi<=30.0){
            System.out.printf("%-20.3f%s",bmi,"OverWeight");

        }else System.out.printf("%-10.3%s",bmi, "Obese");
    }
}
