/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizdispersa;

/**
 *
 * @author sala306
 */
public class Tripleta {

    //Atributos
    private int Tri[][];

    //Metodos
    public Tripleta(int N) {
        Tri = new int[N][3];
    }

    public int[][] getTri() {
        return Tri;
    }

    public void setTri(int[][] Tri) {
        this.Tri = Tri;
    }

    public int getTri(int f, int c) {
        return Tri[f][c];
    }

    ;
          
    public void setTri(int f, int c, int d) {
        Tri[f][c] = d;
    }

    public void crear(int n, int m, int d, int Mat[][]) {
        int k = 1;
        Tri[0][0] = n;
        Tri[0][1] = m;
        Tri[0][2] = d;

        for (int i = 0; i < n; i++) {
            for (int j = 0; i < m; j++) {
                if (Mat[i][j] != 0) {
                    Tri[k][0] = n;
                    Tri[k][1] = m;
                    Tri[k][2] = Mat[i][j];
                    k++;
                }

            }
        }
    }

    public void mostrar() {
        for (int k = 0; k < Tri[0][2]; k++) {
            System.out.println("[" + Tri[k][0] + "|" + Tri[k][1] + "|" + Tri[k][2] + "]");
        }
    }

}
