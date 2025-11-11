package padroescomportamentais.strategy;

public class FreteExpresso implements CalculoFrete {
    @Override
    public float calcular(float peso, float distancia) {
        return peso * distancia * 0.5f;
    }
}