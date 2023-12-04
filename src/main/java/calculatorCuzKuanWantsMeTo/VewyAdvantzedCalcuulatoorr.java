package calculatorCuzKuanWantsMeTo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class VewyAdvantzedCalcuulatoorr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Brud was willsch rechne? Eingabe: ");
        String input = sc.next();

        BigDecimal finNum;
        BigDecimal tempNum;
        BigDecimal tempNum2;
        int tempIntNum;

        switch (input){
            case "^2":
                tempNum = sc.nextBigDecimal();
                finNum = tempNum.multiply(tempNum);
                System.out.print(finNum);
                break;
            case "+":
                tempNum = sc.nextBigDecimal();
                tempNum2 = sc.nextBigDecimal();
                finNum = tempNum.add(tempNum2);
                System.out.println(finNum);
                break;
            case "-":
                tempNum = sc.nextBigDecimal();
                tempNum2 = sc.nextBigDecimal();
                finNum = tempNum.subtract(tempNum2);
                System.out.println(finNum);
                break;
            case "/":
                tempNum = sc.nextBigDecimal();
                tempNum2 = sc.nextBigDecimal();
                finNum = tempNum.divide(tempNum2);
                System.out.println(finNum);
                break;
            case "*":
                tempNum = sc.nextBigDecimal();
                tempNum2 = sc.nextBigDecimal();
                finNum = tempNum.multiply(tempNum2);
                System.out.println(finNum);
                break;
            case "v":
                tempNum = sc.nextBigDecimal();
                System.out.print("enter precision: ");
                int precision = sc.nextInt();
                finNum = tempNum.sqrt(new MathContext(precision));
                System.out.println(finNum);
                break;
            case "!":
                tempIntNum = sc.nextInt();
                //nummer bekommen (rizz == false)
                finNum = BigDecimal.valueOf(1);
                //finnum definieren (1)
                for (int i = tempIntNum; i > 0; i--){
                    finNum = finNum.multiply(BigDecimal.valueOf(i));
                }
                System.out.println(finNum);
                break;
        }
    }



}
