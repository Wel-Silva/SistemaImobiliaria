public class ImovelResidencial extends Imovel {
    private int qtdQuartos;
    private int qtdSuite;
    private int qtdSalaEstar;
    private int qtdVagas;
    private float area;
    private boolean possuiArmario;
    private String descricao;

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    public int getQtdSuite() {
        return qtdSuite;
    }

    public void setQtdSuite(int qtdSuite) {
        this.qtdSuite = qtdSuite;
    }

    public int getQtdSalaEstar() {
        return qtdSalaEstar;
    }

    public void setQtdSalaEstar(int qtdSalaEstar) {
        this.qtdSalaEstar = qtdSalaEstar;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public boolean isPossuiArmario() {
        return possuiArmario;
    }

    public void setPossuiArmario(boolean possuiArmario) {
        this.possuiArmario = possuiArmario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
