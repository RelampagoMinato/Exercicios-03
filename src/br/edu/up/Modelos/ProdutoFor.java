package br.edu.up.Modelos;

import java.util.Random;

public class ProdutoFor {
    private float[] itens = new float[40];

    public ProdutoFor() {
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            itens[i] = random.nextFloat() * 100;
        }
    }

    public float getItem(int index) {
        return itens[index];
    }
}
