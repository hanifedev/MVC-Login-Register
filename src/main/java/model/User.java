package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int kul_id;
	private String isim;
	private String soyisim;
	private String email;
	private String kuladi;
	private String parola;
	
	public User(){
	}
	public User(String isim, String soyisim, String email, String kuladi, String parola) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.kuladi = kuladi;
        this.parola = parola;
    }
	public int getKul_id() {
		return kul_id;
	}
	public void setKul_id(int kul_id) {
		this.kul_id = kul_id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getKuladi() {
		return kuladi;
	}
	public void setKuladi(String kuladi) {
		this.kuladi = kuladi;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	
	
}
