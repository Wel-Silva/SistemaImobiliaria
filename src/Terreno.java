public class Terreno extends Imovel{
    private float area;
    private float largura;
    private float comprimento;
    private boolean aclive;
    private boolean declive;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public boolean isAclive() {
        return aclive;
    }

    public void setAclive(boolean aclive) {
        this.aclive = aclive;
    }

    public boolean isDeclive() {
        return declive;
    }

    public void setDeclive(boolean declive) {
        this.declive = declive;
    }
}
