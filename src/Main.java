import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
public class Main {
    public static void main(String[] args) {
        Scanner lerNumero = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = lerNumero.nextInt();


        if (num <9 && num>=1) {
            System.out.println("Este numero tem 1 digito");
        }
        else if (num <100 && num>10) {
                System.out.println("ESte numero tem 2 digitos");
            }
        else if (num <1000 && num>=100) {
            System.out.println("Este numero tem 3 digitos");
            }
        else if(num <10000 && num>=1000) {
                System.out.println("Este numero tem 4 digitos");
            }
        else if (num <100000 && num>=10000) {
            System.out.println("Este numero tem  digitos");
        }

        }


    }













