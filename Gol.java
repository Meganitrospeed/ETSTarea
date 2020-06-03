
package deporte;

public class Gol {
    private int minuto;
    Partido p;
    Jugador j;
    private Integer id;
    static Integer k=0;
    
    public void relacion(Partido p, Jugador j,int minuto){
        this.p=p;
        this.j=j;
        this.minuto=minuto;       
        k++;
        this.id=k;
       
       // System.out.println(p.getResultado()+" "+j.getNombre()+" "+minuto);
        p.setGol(this); // Lista de goles del partido
        j.setGol(this); // Lista de goles del jugador
     
        golesPartido(this.p,this.j);
    }
    public Integer getId() {
        return this.id;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public Partido getPartido() {
        return this.p;
    } 

    public Jugador getJ() {
        return j;
    }
    
    
    public void golesPartido(Partido p, Jugador j){
         
         if(this.j.equipo == this.p.local){
          this.p.setGolesLocales(this.p.local);
        }
        if(this.j.equipo == this.p.visitante ){
        this.p.setGolesVisitante(this.p.visitante);
        }
    }
}
