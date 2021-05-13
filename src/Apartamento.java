public class Apartamento extends ImovelResidencial{
    private int andar;
    private float valorCond;
    private boolean possuiPortaria;

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float getValorCond() {
        return valorCond;
    }

    public void setValorCond(float valorCond) {
        this.valorCond = valorCond;
    }

    public boolean isPossuiPortaria() {
        return possuiPortaria;
    }

    public void setPossuiPortaria(boolean possuiPortaria) {
        this.possuiPortaria = possuiPortaria;
    }
}
