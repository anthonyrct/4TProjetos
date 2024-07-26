import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.*;

import com.anthony.Inventario;
import com.anthony.Produto;

public class InventarioTest {
    private Inventario inventario;

    @Before
    public void setup(){
        inventario = new Inventario(); 
    }
    @Test
    public void testeAdicionar(){
        Produto produto = new Produto(1,"teste", 10, "teste", 99.99);
        inventario.adicionar(produto);
        List<Produto> lista = inventario.Listar();
        assertEquals(1, lista.size());
    }

    @Test
    public void testeRemover(){
        testeAdicionar();
        inventario.remover(1);
        List<Produto> lista = inventario.Listar();
        assertEquals(0, lista.size());
    }
    @Test
    public void testeAtulizar(){
        testeAdicionar();
        List<Produto> lista = inventario.Listar();
        inventario.atualizar(1, 20, 200);
        Produto produtoAtualizado = lista.get(0);
    }

}
