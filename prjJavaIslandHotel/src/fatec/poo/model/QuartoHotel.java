package fatec.poo.model;

//@author paula.moraes

public class QuartoHotel { 
    private int numQuarto;
    private double valorDiaria;
    private boolean situacao;
    private String dataEntrada;
    private double totalFaturado;
    private Hospede hospede;
    private Atendente atendente;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
    }
    
    public void reservar(Hospede h, Atendente a){
        situacao = true;
        hospede = h;
        atendente = a;
        hospede.setQuartoHotel(this);
        atendente.addQuartoHotel(this);
    }
    
    public double liberar(int dias, double tx){
        double totalDiaria = 0, desconto = 0;
        
        totalDiaria = valorDiaria * dias;
        desconto = totalDiaria * tx;
        totalDiaria = totalDiaria - desconto;
        
        totalFaturado += totalDiaria;
        situacao = false;
        dataEntrada = null;
        hospede.setQuartoHotel(null);
        atendente.removeQuartoHotel(this);
        
        return totalDiaria;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean situacao() {
        return situacao;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public Atendente getAtendente() {
        return atendente;
    }
    
    public Hospede getHospede() {
        return hospede;
    }
    
    
}
