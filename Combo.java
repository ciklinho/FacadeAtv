public class Combo {
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public Combo(){
        burguer = new Burguer();
        sobremesa = new Sobremesa();
        bebida = new Bebida();
    }

    public void CriarCombo(int tipo){
        switch(tipo) {
            case 1:
                burguer.setDescricao("Cheese Burguer");
                burguer.setPreco(19.90);
                burguer.setGramas(150);
                sobremesa.setDescricao("Sorvete Casquinha");
                sobremesa.setPreco(4.50);
                sobremesa.setTamanho("Pequeno");
                bebida.setDescricao("Fanta Uva");
                bebida.setPreco(3);
                bebida.setMl(350);
                break;
            case 2:
                burguer.setDescricao("X-Burguer");
                burguer.setPreco(25);
                burguer.setGramas(250);
                sobremesa.setDescricao("Milk Shake");
                sobremesa.setPreco(10.99);
                sobremesa.setTamanho("Médio");
                bebida.setDescricao("Coca-Cola");
                bebida.setPreco(8.60);
                bebida.setMl(1500);
                break;
            default:
                break;
        }
    }
    public String MostrarCombo(){
        return "\nDescrição: " + burguer.getDescricao() + "\n" + "Preço: R$ " + burguer.getPreco() + "\n" +  "Gramas: " + burguer.getGramas() + "g" + "\n\n" +
                "Descrição: " + sobremesa.getDescricao() + "\n" + "Preço: " + sobremesa.getPreco() + "\n" + "Tamanho: " + sobremesa.getTamanho() + "\n\n" +
                "Descrição: " + bebida.getDescricao() + "\n" + "Preço: " + bebida.getPreco() + "\n" + "ml: " + bebida.getMl() + "ml";
    }

    @Override
    public String toString(){
        return MostrarCombo();
    }
}