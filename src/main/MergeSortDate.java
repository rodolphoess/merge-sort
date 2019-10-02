package main;

import java.time.LocalDate;

public class MergeSortDate {

    public void sort(LocalDate[] array, int indiceInicio, int indiceFim) {
        if (indiceInicio < indiceFim) {
            int indiceMedio = (indiceInicio + indiceFim) / 2;

            sort(array, indiceInicio, indiceMedio);
            sort(array, indiceMedio + 1, indiceFim);

            merge(array, indiceInicio, indiceMedio, indiceFim);
        }
    }

    private void merge(LocalDate[] array, int indiceInicio, int indiceMedio, int indiceFim) {
        int tamanhoArrayEsquerda = indiceMedio - indiceInicio + 1;
        int tamanhoArrayDireita = indiceFim - indiceMedio;

        LocalDate[] arrayTempEsquerda = new LocalDate[tamanhoArrayEsquerda];
        LocalDate[] arrayTempDireita = new LocalDate[tamanhoArrayDireita];

        System.arraycopy(array, indiceInicio, arrayTempEsquerda, 0, tamanhoArrayEsquerda);
        for (int j = 0; j < tamanhoArrayDireita; j++) {
            arrayTempDireita[j] = array[indiceMedio + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = indiceInicio;
        while (i < tamanhoArrayEsquerda && j < tamanhoArrayDireita) {
            if (arrayTempEsquerda[i].isBefore(arrayTempDireita[j]) || arrayTempEsquerda[i].isEqual(arrayTempDireita[j])) {
                array[k] = arrayTempEsquerda[i];
                i++;
            } else {
                array[k] = arrayTempDireita[j];
                j++;
            }
            k++;
        }

        while (i < tamanhoArrayEsquerda) {
            array[k] = arrayTempEsquerda[i];
            i++;
            k++;
        }

        while (j < tamanhoArrayDireita) {
            array[k] = arrayTempDireita[j];
            j++;
            k++;
        }
    }
}
