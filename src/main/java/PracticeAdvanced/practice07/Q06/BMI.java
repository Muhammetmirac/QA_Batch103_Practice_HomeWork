package PracticeAdvanced.practice07.Q06;

public class BMI {
    private double boy;
    private double kilo;


    public BMI(double boy, double kilo) {
        this.boy = boy;
        this.kilo = kilo;
    }

    public BMI() {
    }

    public double getBoy() {
        return boy;
    }

    public double getKilo() {
        return kilo;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public void BMIHesapla(){
        double bmi= kilo/(boy*boy);
        System.out.println("BMI = " + bmi);
        if (bmi>0 && bmi<18.5){
            System.out.println("Zayif");
        }else if (bmi<25){
            System.out.println("Normal");
        }else if (bmi<30){
            System.out.println("Fazla Kilolu");
        }else if (bmi>=30){
            System.out.println("Obez");
        }else {
            System.out.println("Degersiz veri girildi");
        }
    }

    @Override
    public String toString() {
        return "BMI{" +
                "boy=" + boy +
                ", kilo=" + kilo +
                '}';
    }
}
