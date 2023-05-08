public class carrera{
    private String nombreCircuito;
    private int numeroCoches;
    private boolean lluvia;
    
    public carrera(String nomCir, int numCo){
        nombreCircuito = nomCir;
        numeroCoches = numCo;
        lluvia = false;
    }
    
    public String getNombreCircuito(){
        return nombreCircuito;
    }
    
    public int getNumeroCoches(){
        return numeroCoches;
    }
    
    public boolean getLluvia(){
        return lluvia;
    }
    
    public void setNombreCircuito(String nuevoNombre){
        nombreCircuito = nuevoNombre;
    }
    
    public void setCochesAcabanCarrera(int numeroAbandonos){
        numeroCoches = numeroCoches - numeroAbandonos;
    }
    
    public void setCambiarLluvia(){
        lluvia = !lluvia;
    }
    
    public void imprimirDetalles(){
        if(lluvia = false){
        System.out.println("Nombre del circuito: " + nombreCircuito + "| Numero de coches: " + numeroCoches + "| Luvia: no");
        }
        else{
            System.out.println("Nombre del circuito: " + nombreCircuito + "| Numero de coches: " + numeroCoches + "| Luvia: si");
        }
    }
    
    public String getDetalles(){
        if(lluvia = false){
        return "Nombre del circuito: " + nombreCircuito + "| Numero de coches: " + numeroCoches + "| Luvia: no";
        }
        else{
            return "Nombre del circuito: " + nombreCircuito + "| Numero de coches: " + numeroCoches + "| Luvia: si";
        }
    }
}