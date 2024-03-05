
public class Petroleiro extends Navio {

    private float capacidadeCarga;
    private final int id=3;

    public Petroleiro( String matricula, String nome, float comprimento, float capacidadeCarga) {
        super(matricula, nome, comprimento);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public float getCapacidadeCarga() {
        return this.capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public int getId() {
        return this.id;
    }



}