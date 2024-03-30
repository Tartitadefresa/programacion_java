import java.util.ArrayList;

import exceptions.AgregarClubException;
import interfaces.IClub;

public class Club implements IClub {
    private String nombre;
    private int sede;
    private int añoFundacion;
    private ArrayList<Equipo> equipos;

    public Club(String nombre, int sede, int añoFundacion) {
        this.nombre = nombre;
        this.sede = sede;
        this.añoFundacion = añoFundacion;
        this.equipos = new ArrayList<Equipo>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getSede() {
        return sede;
    }

    public int getAñoFundacion() {
        return añoFundacion;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSede(int sede) {
        this.sede = sede;
    }

    public void setAñoFundacion(int añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void agregarEquipo(Equipo equipo) throws AgregarClubException {
        if (buscarEquipo(equipo.getNombre()) != null) {
            throw new AgregarClubException();
        }

        this.equipos.add(equipo);
    }

    private Equipo buscarEquipo(String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(nombre)) {
                return equipo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String base = "-  Club: " + this.getNombre() + "\n-  Año de fundacion:" +
        this.getAñoFundacion() + "\n-  Total equipos: " + this.getEquipos().size(); 
        
        for (Equipo equipo : this.getEquipos()) {
            base += "\n" + equipo.toString();
        }

        return base;
    }

}