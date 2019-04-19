package sample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "baiviet")
public class Posts implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idbaiviet;
	private int idchude;
	private String tuade;
	private String tacgia;
	@Temporal(TemporalType.TIMESTAMP)
	private Date ngayviet;
	private String tieude;
	private String noidung;
	private String hinhanh;
	private String video;
	
	public Posts() {}

	public Posts(int idchude, String tuade, String tacgia, Date ngayviet, String tieude, String noidung, String hinhanh,
			String video) {
		super();
		this.idchude = idchude;
		this.tuade = tuade;
		this.tacgia = tacgia;
		this.ngayviet = ngayviet;
		this.tieude = tieude;
		this.noidung = noidung;
		this.hinhanh = hinhanh;
		this.video = video;
	}

	public int getIdbaiviet() {
		return idbaiviet;
	}

	public void setIdbaiviet(int idbaiviet) {
		this.idbaiviet = idbaiviet;
	}

	public int getIdchude() {
		return idchude;
	}

	public void setIdchude(int idchude) {
		this.idchude = idchude;
	}

	public String getTuade() {
		return tuade;
	}

	public void setTuade(String tuade) {
		this.tuade = tuade;
	}

	public String getTacgia() {
		return tacgia;
	}

	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}

	public Date getNgayviet() {
		return ngayviet;
	}

	public void setNgayviet(Date ngayviet) {
		this.ngayviet = ngayviet;
	}

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}
	
	
}
