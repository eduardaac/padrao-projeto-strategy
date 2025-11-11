package padroescomportamentais.strategy;

public class Pedido {
    private float valorFrete;

    public float getValorFrete() {
        return valorFrete;
    }

    public void calcularFreteExpresso(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteExpresso());
    }

    public void calcularFretePadrao(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FretePadrao());
    }
}