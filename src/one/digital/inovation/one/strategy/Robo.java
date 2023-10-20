package one.digital.inovation.one.strategy;

public class Robo {
    private Comportamento comportamento;

    public void SetComportamento( Comportamento comportamento ){
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
