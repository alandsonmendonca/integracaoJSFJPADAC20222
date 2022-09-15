package entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Bicicleta {
	@Id
	@GeneratedValue
	private Integer id;
	private String marca;
	private String modelo;
	@Column(name = "tamanho_aro")
	private Integer tamanhoAro;
	@Column(name = "tamanho_quadro")
	private String tamanhoQuadro;
	private String descricao;
	private Double valor;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCompra = new Date();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getTamanhoAro() {
		return tamanhoAro;
	}
	public void setTamanhoAro(Integer tamanhoAro) {
		this.tamanhoAro = tamanhoAro;
	}
	public String getTamanhoQuadro() {
		return tamanhoQuadro;
	}
	public void setTamanhoQuadro(String tamanhoQuadro) {
		this.tamanhoQuadro = tamanhoQuadro;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
}
