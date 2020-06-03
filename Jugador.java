package deporte;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Jugador {
    Equipo equipo;
    private String nombre;
    HashMap<Integer,Gol> goles = new HashMap<Integer,Gol>(); // Inicializamos para que no sea null
    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    } 
    public String getNombreEquipo() {
        return equipo.getNombre();
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
     void setGol(Gol g)
     {
        //System.out.println("*** Almacena gol del jugador:"+this.nombre+" idGol:"+g.getId()+" "+g.getMinuto());
        this.goles.put(g.getId(), g);     
     }
     //------------------------------
     public void mostrarGoles(){
         System.out.println("Goles marcados por:"+this.nombre);
         Gol g=new Gol();
         Partido p; //=new Partido();
         String local,visitante;
         Iterator i=this.goles.entrySet().iterator();
          while(i.hasNext()){
             Map.Entry entrada=(Map.Entry)i.next();
             g=(Gol)entrada.getValue();
           //  System.out.println("------"+((Gol)g).getId()+" "+((Gol)g).getMinuto());
             p=g.getPartido();
             local=p.getLocal().getNombre();
             visitante=p.getVisitante().getNombre();
            System.out.println("Partido:"+local+"-"+visitante+" "+p.getFecha()+" minuto:"+((Gol)g).getMinuto());
     
         }
         
     }
     //------------------------------
      public void agregarEquipo(Equipo e){
          this.equipo=e;// Ojo
          e.equipo.add(this);
      }     
     //------------------------------    
}
