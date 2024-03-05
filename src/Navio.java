import java.util.*;

public abstract class Navio {

    private String matricula, nome;
    private float comprimento;
    private final int id=1;

    public Navio(String matricula, String nome, float comprimento){

        this.matricula=matricula;
        this.nome=nome;
        this.comprimento=comprimento;

    }

    public void setNome(String nome){
        nome=this.nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setComprimento(float comprimento){
        comprimento=this.comprimento;
    }

    public float getComprimento(){
        return this.comprimento;
    }

    public int getId() {
        return id;
    }

    public int getNrMaxCont(){
        return -1;
    };

    public float getCapacidadeCarga() {
        return -1;
    }

}
