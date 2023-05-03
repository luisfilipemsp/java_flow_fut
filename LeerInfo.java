import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Scanner;

public class LeerInfo {

    private ArrayList<Jugador> listaJ;
    private TreeSet<Equipo> treeE;

    public static void main(String[] args) {
        LeerInfo l = new LeerInfo();
       
        l.partidos();
    }

    public void partidos() {
        List<Equipo> ll = new ArrayList<Equipo>(treeE);
        Collections.shuffle(ll);
        for (int i = 0; i < ll.size(); i++) {
            Equipo e1 = ll.get(i);
            Equipo e2 = ll.get(i + 1);
            System.out.println(e1.getNombre() + " vs " + e2.getNombre());
            if(compete(e1, e2) == 1) 
                System.out.println("El equipo " + e1.getNombre() + " ha ganado.");
            else 
                System.out.println("El equipo " + e2.getNombre() + " ha ganado.");
            i++;
        }
    }

    public ArrayList<Jugador> jugadoresEquipo(Equipo e) {
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        for (Jugador j : listaJ) {
            if (j.getEquipo().equals(e.getNombre()))
                jugadores.add(j);
        }
        return jugadores;
    }

    public int compete(Equipo e1, Equipo e2) {
        ArrayList<Jugador> jugadoresE1 = jugadoresEquipo(e1);
        ArrayList<Jugador> jugadoresE2 = jugadoresEquipo(e2);

        return (puntuacionGeneral(jugadoresE1) > puntuacionGeneral(jugadoresE2)) ? 1 : 2;
    }

    public double puntuacionGeneral(ArrayList<Jugador> jugadores) {
        int puntGeneral = 0;
        for (Jugador jugador : jugadores) {
            puntGeneral += jugador.getControlBalon() + jugador.getDefensa() + jugador.getFinalizacion() + jugador.getPotential();
        }
        return (double) puntGeneral / jugadores.size();
    }
    public void mercadoFichaje() {
        Collections.shuffle(listaJ);

        for (Equipo e : treeE) {

        }
    }

    public LeerInfo() {
        try {
            FileInputStream archivo = new FileInputStream(new File("./FIFA_18_Players2.csv"));
            Scanner sc = new Scanner(archivo);
            String columna = sc.nextLine();
            listaJ = new ArrayList<Jugador>();
            treeE = new TreeSet<Equipo>();

            while (sc.hasNextLine()) {
                columna = sc.nextLine().replaceAll("\"", "");
                byte by[] = columna.getBytes("ISO-8859-1");
                columna = new String(by, "UTF-8");
                String valores[] = columna.split(",");

                Jugador j = new Jugador(valores[1],
                        Integer.parseInt(valores[2]),
                        valores[3],
                        Integer.parseInt(valores[4]),
                        Integer.parseInt(valores[5]),
                        Integer.parseInt(valores[42]),
                        Integer.parseInt(valores[43]),
                        Integer.parseInt(valores[21]),
                        Integer.parseInt(valores[22]),
                        Integer.parseInt(valores[24]),
                        valores[46],
                        valores[6],
                        Integer.parseInt(valores[9]));
                listaJ.add(j);

                Equipo e = new Equipo(valores[6],
                        valores[7],
                        valores[8]);
                treeE.add(e);
            }
            sc.close();
            archivo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Jugador> getListaJ() {
        return listaJ;
    }

    public void setListaJ(ArrayList<Jugador> listaJ) {
        this.listaJ = listaJ;
    }

    public TreeSet<Equipo> getTreeE() {
        return treeE;
    }

    public void setTreeE(TreeSet<Equipo> treeE) {
        this.treeE = treeE;
    }

}
