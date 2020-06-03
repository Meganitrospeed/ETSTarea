
package deporte;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Competicion {
     private String nombre;
     HashSet<Partido> torneo = new HashSet<>();
     HashMap<String, Integer> jugadores= new HashMap<String, Integer>();

    public Competicion(String nombre) {
        this.nombre = nombre;
       
    }
     
   
    public HashSet<Partido> getCompeticion() {
        return torneo;        
    }

    public void setCompeticion(HashSet<Partido> torneo) {  
        Gol g = new Gol();
        //String jug;
        int gol = 0;
        Iterator iter = torneo.iterator();
        // Iterator i = this.jugadores.entrySet().iterator();
        while (iter.hasNext())
        {
           Partido p=(Partido) iter.next();        
           this.torneo.add(p);
           
           Iterator itLocal = p.getLocal().getEquipo().iterator();
           Iterator itVisitante = p.getVisitante().getEquipo().iterator();
           while(itLocal.hasNext()){
                Jugador j = (Jugador) itLocal.next();
                this.jugadores.put(j.getNombre(), gol);     
                }
           while(itVisitante.hasNext()){
                Jugador j = (Jugador) itVisitante.next();
                this.jugadores.put(j.getNombre(), gol);     
                }
               
                
           }
          actualizarGoles(torneo);
        
        
    }
    void actualizarGoles(HashSet<Partido> torneo){
        Gol g = new Gol();
        String jug;
        int gol;
         Iterator iter = torneo.iterator();
         while (iter.hasNext())
        {
           Partido p=(Partido) iter.next();   
        Iterator it = p.getGoles().entrySet().iterator();
        Iterator i = this.jugadores.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entradaGoles = (Map.Entry)it.next();
                g=(Gol)entradaGoles.getValue(); 
                while(i.hasNext()){
                    Map.Entry entradaJugaodores = (Map.Entry)i.next();
                    jug = (String) entradaJugaodores.getKey();
                    gol = (int) entradaJugaodores.getValue();
                    if(jug == g.j.getNombre()){
                        gol++;
                         this.jugadores.put(jug, gol);
                          

                    }
                    }
        }
    }
    }
  
    
    
    public void Pichichi(){
       
        int gol = 0;
        Iterator i = this.jugadores.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry entrada = (Map.Entry)i.next();
            if(gol < (int) entrada.getValue()){
                gol = (int) entrada.getValue();
            }
        }
      
        MostrarPichichi(gol);
    }
    
    void MostrarPichichi(int gol){
         System.out.println("El/Los jugadores que han marcado más goles son:");
          Iterator i = this.jugadores.entrySet().iterator();
           while(i.hasNext()){
            
            Map.Entry entrada = (Map.Entry)i.next();
            if(gol == (int) entrada.getValue()){
                
                System.out.println(entrada.getKey());
            }
        }
           System.out.println("Con "+gol+" goles");
    }
    //-------------------------------------------------------------
    public void mostrarCompeticion(){
        System.out.println("Competicion:"+this.nombre);
        Iterator iter = this.torneo.iterator();
        while (iter.hasNext())
        {
            Partido p=(Partido) iter.next();            
            p.mostrarGoles();            
        }
    }  
    //---------------------------------------------------------
    public String getNombre() {
        return nombre;
    }
     
}
