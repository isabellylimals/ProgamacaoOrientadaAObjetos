package ListaReusodeClasses.Questao61.Questao62;

public class DataHora {
    private int hora;
    private String data;

    public DataHora(String data, int hora) {
        this.data = data;
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public String getData() {
        return data;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "[hora=" + hora + ", data=" + data + "]";
    }


}
