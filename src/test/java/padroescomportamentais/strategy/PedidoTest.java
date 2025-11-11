package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularFreteExpresso() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteExpresso(80.0f, 1.1f);
        assertEquals(44.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFretePadrao() {
        Pedido pedido = new Pedido();
        pedido.calcularFretePadrao(70.0f, 80.0f);
        assertEquals(75.0f, pedido.getValorFrete());
    }

}