package Boletin96;

import javax.swing.JOptionPane;

public class Empresa {

    private float soldo;
    private float percent;

    public float pedirSoldo() {
        float s;
        String dato = JOptionPane.showInputDialog(null, "Soldo=");
        s = Float.parseFloat(dato);
        if (s < 0) {
            JOptionPane.showMessageDialog(null, "dato no válido");
        }
        return s;
    }

    public void Calcular() {
        int contador = 0;
        int contador3 = 0;
        int contador2 = 0;
        soldo = this.pedirSoldo();
        while (soldo != 0) {
            if (soldo >= 1000 && soldo <= 1750) {
                contador++;
            }
            if (soldo > 1750) {
                contador3++;
            }
            if (soldo < 1000 && soldo > 0) {
                contador2++;
                percent = (contador2 * 100) / (contador + contador2 + contador3);
            }
            soldo = this.pedirSoldo();
        }
        JOptionPane.showMessageDialog(null, "Soldos comprendidos entre[1000 e 1750]=" + contador + "\n" + 
                "Porcentaxe de soldos menores de 1000€=" + percent + "%");
    }
}
