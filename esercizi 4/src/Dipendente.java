public abstract class Dipendente {

    protected String matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;


    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }



    //getter
    public String getMatricola() {
        return this.matricola;
    }


    //setter
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
        System.out.println("Cambio avvenuto con successo!");
    }

}
