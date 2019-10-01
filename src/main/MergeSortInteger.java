package main;

public class MergeSortInteger {

    public void sort(int[] array, int indiceInicio, int indiceFim) {
        if (indiceInicio < indiceFim) {
            int indiceMedio = (indiceInicio + indiceFim) / 2;

            sort(array, indiceInicio, indiceMedio);
            sort(array, indiceMedio + 1, indiceFim);

            merge(array, indiceInicio, indiceMedio, indiceFim);
        }
    }

    private void merge(int[] array, int indiceInicio, int indiceMedio, int indiceFim) {

        int tamanhoArrayEsquerda = indiceMedio - indiceInicio + 1;
        int tamanhoArrayDireita = indiceFim - indiceMedio;

        int[] arrayTempEsquerda = new int[tamanhoArrayEsquerda];
        int[] arrayTempDireita = new int[tamanhoArrayDireita];

        for (int i = 0; i < tamanhoArrayEsquerda; i++) {
            arrayTempEsquerda[i] = array[indiceInicio + i];
        }
        for (int j = 0; j < tamanhoArrayDireita; j++) {
            arrayTempDireita[j] = array[indiceMedio + 1 + j];
        }

        int i = 0, j = 0;
        int k = indiceInicio;
        while (i < tamanhoArrayEsquerda && j < tamanhoArrayDireita) {
            if (arrayTempEsquerda[i] <= arrayTempDireita[j]) {
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
