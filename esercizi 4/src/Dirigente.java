public class Dirigente extends Dipendente {

    public int oreLavorate;

    //costruttore
    public Dirigente(int oreLavorate, String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = 80;
    }
    
}
