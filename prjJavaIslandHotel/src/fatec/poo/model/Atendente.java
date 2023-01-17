package fatec.poo.model;
import java.util.ArrayList;
//@author paula.moraes
 
public class Atendente extends Pessoa{
    private String regFunc;
    private String turno;
    private ArrayList<QuartoHotel> quartoHotel;
// alterei a ordem do construtor
    public Atendente(String regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        quartoHotel = new ArrayList<QuartoHotel>();
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getRegFunc() {
        return regFunc;
    }

    public String getTurno() {
        return turno;
    }
    
    public void addQuartoHotel(QuartoHotel qh){
        quartoHotel.add(qh);
    }
    
    public void removeQuartoHotel(QuartoHotel qh){
        quartoHotel.remove(qh);
    }
}
