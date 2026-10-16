package Uts;
public class KomporListrik extends Elektronik{
    private boolean knob;

    KomporListrik(int daya, boolean knob){
        super(daya);
        this.knob = knob;
    }

    void nyalakanKompor(){
        knob = true;
        System.out.println("Kompor dinyalakan");
    }

    void matikanKompor(){
        knob = false;
        System.out.println("Kompor dimatikan");
    }

    boolean getKnob(){
        return knob;
    }
}
