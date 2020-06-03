
package deporte;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Partido {
    // Competicion competicion; sin implementar.
     private String fecha;    
     Equipo local;
     Equipo visitante;
     Competicion c;
      int golesPartidoLocal = 0;
     int golesPartidoVisitante = 0;
     HashMap<Integer,Gol> goles = new HashMap<Integer,Gol>(); // Inicializamos para que no sea un puntero null

    public Partido( String fecha, Equipo local, Equipo visitante) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
    }    

     void setGol(Gol g)
     {
       // System.out.println(" Partido id gol:"+g.getId()+" minuto: "+g.getMinuto());
        this.goles.put(g.getId(), g);
        
        
     }
    

    public String getFecha() {
        return fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public HashMap<Integer, Gol> getGoles() {
        return goles;
    }
    
    
    void setGolesLocales(Equipo local){
        golesPartidoLocal++;
    }
    
    void setGolesVisitante(Equipo visitante){
        golesPartidoVisitante++;
    }
    
    //----------------------------------------------------------------------------------
       public void mostrarGoles(){
           
         String cadena;
         cadena=this.getFecha()+" "+this.local.getNombre()+"-"+this.visitante.getNombre()+" "+this.golesPartidoLocal+"-"+this.golesPartidoVisitante;
         System.out.println("Goles marcados en el partido:"+cadena);
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
            // System.out.println("Partido:"+local+"-"+visitante+" "+p.getFecha()+" minuto:"+((Gol)g).getMinuto());
             System.out.println("MINUTO:"+((Gol)g).getMinuto()+" JUGADOR:"+((Gol)g).j.getNombre()+" EQUIPO:"+((Gol)g).j.getNombreEquipo());
             
         } 
      }
    //----------------------------------------------------------------------------------      
     
}
