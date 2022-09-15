package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import static util.MessageUtil.addErrorMessage;
import static util.MessageUtil.addInfoMessage;
import dao.BicicletaDao;
import entidade.Bicicleta;

@ManagedBean
public class BicicletaBean {
	private Bicicleta bicicleta = new Bicicleta();
	private List<Bicicleta> lista;
	
	public String salvar() {
		try {
			BicicletaDao.salvar(bicicleta);
			addInfoMessage("Sucesso", "Bicicleta salva com sucesso.");
			bicicleta = new Bicicleta();
		} catch (Exception e) {
			addErrorMessage("Erro", "Erro ao salvar a bicicleta.");
		}
		
		return null;
	}
	
	public Bicicleta getBicicleta() {
		return bicicleta;
	}
	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}
	public List<Bicicleta> getLista() {
		if (lista == null) {
			lista = BicicletaDao.listar();
		}
		return lista;
	}
	public void setLista(List<Bicicleta> lista) {
		this.lista = lista;
	}
}
