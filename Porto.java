public class Porto {

    private Navio[] porto;
    private int capacidadePorto;

    public Porto(int capacidadePorto){

        this.capacidadePorto=capacidadePorto;
        this.porto= new Navio[capacidadePorto];

    }

    public void addNavio(Navio A){

        for(int a= 0; a<porto.length; a++){

            if(porto[a]!=null && A.getNome().equals(porto[a].getNome())){
                System.out.println("Ja existe um navio com essa matricula");

                break;
            }

            if(porto[a]== null){
                porto[a]=A;

                break;
            }
        }



    }

    public int getCapacidadePorto() {
        return capacidadePorto;
    }

    public void setCapacidadePorto(int capacidadePorto) {
        this.capacidadePorto = capacidadePorto;
    }

    public String getNavioNome(int x) {
        return porto[x-1].getNome();
    }

    public int totalContentores(){

        int totalContentores = 0;

        for(int a= 0; a<porto.length; a++){

            if(porto[a]!= null && porto[a].getId() == 2){

                totalContentores= totalContentores + porto[a].getNrMaxCont();

            }
        }

        return totalContentores;
    }

    public float totalCarga(){

        float totalCarga = 0;

        for(int a= 0; a<porto.length; a++){

            if(porto[a]!= null && porto[a].getId() == 2){

                totalCarga= totalCarga + 10;

            }

            if(porto[a]!= null && porto[a].getId() == 3){

                totalCarga= totalCarga + porto[a].getCapacidadeCarga();

            }

        }

        return totalCarga;

    }

}
