package Ordenamientos;

import java.util.ArrayList;

public class BubbleShort {

    public void ordenarList(ArrayList<Integer> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) { // bucle externo.
            for (int j = 0; j < n - i - 1; j++) { // Bucle interno
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

    }

}
