package deporte;
import java.util.HashSet;
public class Deporte {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Raul");
        Jugador j2 = new Jugador("Butragueño");
        Jugador j3 = new Jugador("Santillana");
        Jugador j4 = new Jugador("Messi");
        Jugador j5 = new Jugador("Ronaldiño");
        Jugador j6 = new Jugador("Pinto");
        Jugador j7= new Jugador("Guize");
        Jugador j8= new Jugador("Ayoze");
        Jugador j9= new Jugador("Tenesor");
        Jugador j10= new Jugador("Reguilón");
        Jugador j11= new Jugador("Jesús Navas");
        Jugador j12= new Jugador("Fernando");
       // HashSet<Jugador>  rellenar = new HashSet<>();
        /*rellenar.add(j1);            
        rellenar.add(j2);
        rellenar.add(j3);*/
        //------------------------------------------------------------------
        Equipo[] e= new Equipo[4];
        e[0]=new Equipo("Real Madrid");
        //  e1.setEquipo(rellenar);
        j1.agregarEquipo(e[0]);
        j2.agregarEquipo(e[0]);
        j3.agregarEquipo(e[0]);
       // e1.mostrarEquipo();
       /* rellenar.remove(j1); // Los elimina de la lista pero no del equipo RM
        rellenar.remove(j2);
        rellenar.remove(j3);*/
     
       /* rellenar.add(j1);            
        rellenar.add(j2);
        rellenar.add(j3);*/
        e[1]= new Equipo("Barcelona");
        //e2.setEquipo(rellenar);
        j4.agregarEquipo(e[1]);
        j5.agregarEquipo(e[1]);
        j6.agregarEquipo(e[1]);
       // e2.mostrarEquipo();
       
        e[2]= new Equipo("Las Palmas");
        //e2.setEquipo(rellenar);
        j7.agregarEquipo(e[2]);
        j8.agregarEquipo(e[2]);
        j9.agregarEquipo(e[2]);
        e[3]= new Equipo("Sevilla");
        //e2.setEquipo(rellenar);
        j10.agregarEquipo(e[3]);
        j11.agregarEquipo(e[3]);
        j12.agregarEquipo(e[3]);
        //-------------------------------------------------------------
        // Creamos un partido
        /* String resultado,String fecha,local,visitante;*/        
        Partido p=new Partido("24-04-2020",e[0],e[1]);  
        Partido p2=new Partido("30-04-2020",e[1],e[0]);
        Partido p3=new Partido("30-04-2020",e[3],e[2]);
        Partido p4=new Partido("30-04-2020",e[0],e[2]);
        Gol g1=new Gol();       Gol g2=new Gol();       Gol g3=new Gol(); Gol g4=new Gol();
        Gol g5=new Gol();
        //(Partido p, Jugador j,int minuto)
        g1.relacion(p2,j5,20); // Marta del Barcelona marcó en el minuto 20 
        g2.relacion(p2,j4,30);
        g3.relacion(p,j3,76);
        g4.relacion(p2,j1,1);
        g5.relacion(p3, j7, 90);
       // j3.mostrarGoles();
       // j2.mostrarGoles();
        //--------------------------------------------------------
        HashSet<Partido> torneo = new HashSet<>();
        torneo.add(p); // Ida
        torneo.add(p2); // Vuelta
        Competicion[] c=new Competicion[4];
        c[0]=new Competicion("Supercopa");
        c[0].setCompeticion(torneo);
       c[0].mostrarCompeticion();
        c[0].Pichichi();
        c[1]=new Competicion("Copa del Rey");
        torneo.remove(p); // Ida
        torneo.remove(p2); // Vuelta
        torneo.add(p4);
        c[1].setCompeticion(torneo);
        c[1].mostrarCompeticion();
        c[1].Pichichi();
        c[2]=new Competicion("Liga");
        torneo.remove(p4);
        torneo.add(p3);
        c[2].setCompeticion(torneo);
        c[2].mostrarCompeticion();
        c[2].Pichichi();
        c[3]=new Competicion("Champions");
        c[3].setCompeticion(torneo);
        c[3].mostrarCompeticion();
        c[3].Pichichi();
          
        //System.out.println("------------------------------------------------------");
        //p2.mostrarGoles();
       
    }    
}
