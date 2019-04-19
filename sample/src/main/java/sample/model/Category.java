package sample.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "chude")
public class Category implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idchude;
	private String tenchude;
	
	public Category() {}
	
	public Category(String tenchude) {
		super();
		this.tenchude = tenchude;
	}
	
	public int getIdchude() {
		return idchude;
	}
	public void setIdchude(int idchude) {
		this.idchude = idchude;
	}
	public String getTenchude() {
		return tenchude;
	}
	public void setTenchude(String tenchude) {
		this.tenchude = tenchude;
	}

	@Override
	public String toString() {
		return "Category [idchude=" + idchude + ", tenchude=" + tenchude + "]";
	}
	
	
}
