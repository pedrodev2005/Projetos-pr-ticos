import java.util.List;

public interface CadastroDAO {
    void salvar(Object obj);
    void atualizar(Object obj);
    void deletar(int id);
    Object getObjetoPorId(int id);
    List<Object> listarObjetos();
}
