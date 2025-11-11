package Logica;

public class ConvertidorIntToString {
    public String intToString(int num) {
        if (num < 0) {
            return "(" + String.valueOf(num) + ")";
        }

        return String.valueOf(num);
    }

    public String StringToInt(String str) {

    }

    public static void main(String[] args) {

    }

}
