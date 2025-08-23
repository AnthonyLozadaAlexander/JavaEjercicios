package Logica;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int firstE = nums[i];
                int secondE = nums[j];

                if ((firstE + secondE) == 9) {
                    solution[0] = i;
                    solution[1] = j;
                    break;
                }
            }

        }
        System.out.println("--------------------------------------");
        System.out.println("Indices de la suma == 9, encontrados: ");
        System.out.println("--------------------------------------");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("solution[" + i + "] = " + solution[i]);
        }
        System.out.println("--------------------------------------");
    }
}
