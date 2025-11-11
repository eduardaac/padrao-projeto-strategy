package padroescomportamentais.strategy;

public class FretePadrao implements CalculoFrete {
    @Override
    public float calcular(float peso, float distancia) {
        return (peso + distancia) / 2;
    }
}