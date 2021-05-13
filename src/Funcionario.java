public class Funcionario extends Pessoa {
    private String telefoneCtt;
    private String telefoneCel;
    private String datalIni;
    private String cargo;
    private float salarioBase;
    private String login;
    private String senha;

    public String getTelefoneCtt() {
        return telefoneCtt;
    }

    public void setTelefoneCtt(String telefoneCtt) {
        this.telefoneCtt = telefoneCtt;
    }

    public String getTelefoneCel() {
        return telefoneCel;
    }

    public void setTelefoneCel(String telefoneCel) {
        this.telefoneCel = telefoneCel;
    }

    public String getDatalIni() {
        return datalIni;
    }

    public void setDatalIni(String datalIni) {
        this.datalIni = datalIni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
