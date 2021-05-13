public class Corretor extends Funcionario {
    private String dataCorretor;
    private String cursoCorretor;
    private float comissaoSal;


    public void calculaSalario(float valor){

    }

    public String getDataCorretor() {
        return dataCorretor;
    }

    public void setDataCorretor(String dataCorretor) {
        this.dataCorretor = dataCorretor;
    }

    public String getCursoCorretor() {
        return cursoCorretor;
    }

    public void setCursoCorretor(String cursoCorretor) {
        this.cursoCorretor = cursoCorretor;
    }

    public float getComissaoSal() {
        return comissaoSal;
    }

    public void setComissaoSal(float comissaoSal) {
        this.comissaoSal = comissaoSal;
    }
}
