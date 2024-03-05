public class PortaContentores extends Navio{


    private int nrMaxCont;
    private final int id=2;


    public PortaContentores( String matricula, String nome, float comprimento,int nrMaxCont) {
        super(matricula, nome, comprimento);
        this.nrMaxCont = nrMaxCont;
    }



    @Override
    public int getNrMaxCont() {
        return nrMaxCont;
    }

    public void setNrMaxCont(int nrMaxCont) {
        this.nrMaxCont = nrMaxCont;
    }

    @Override
    public int getId() {
        return this.id;
    }



}