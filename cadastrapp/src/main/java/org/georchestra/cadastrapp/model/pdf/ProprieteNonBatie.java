package org.georchestra.cadastrapp.model.pdf;


import javax.xml.bind.annotation.XmlAttribute;

public class ProprieteNonBatie extends Propriete{
	
	// Numéro de parcelle prémitive
	private String dparpi;
	
	// Domanialité, représentation du plan
	private String gpafpd;
	
	// Lettres indicatives de su
	private String ccosub;
	
	// Groupe de nature de culture
	private String cgrnum;
	
	// Sous-groupe alphabétique
	private String dsgrpf;
	
	// Classe dans le groupe et la série-tarif
	private String dclssf;
	
	// Code nature de culture spéciale
	private String cnatsp;
	
	// Contenance de la suf, en centiares
	private int dcntsf;
	
	// Revenu cadastral revalorisé en valeur deu 01-01 de l'année 
	private float drcsuba;
	
	// Référence pdl
	private String pdl;
	
	// Numéro du lot 
	private String dnulot;
	
	// Référence au livre Foncier en Alsace-Moselle
	private String dreflf;
	
	// Tarif de la commune
	private String ccostn;

	/**
	 * @return the dparpi
	 */
	public String getDparpi() {
		return dparpi;
	}

	@XmlAttribute
	/**
	 * @param dparpi the dparpi to set
	 */
	public void setDparpi(String dparpi) {
		this.dparpi = dparpi;
	}

	/**
	 * @return the gpafpd
	 */
	public String getGpafpd() {
		return gpafpd;
	}

	@XmlAttribute
	/**
	 * @param gpafpd the gpafpd to set
	 */
	public void setGpafpd(String gpafpd) {
		this.gpafpd = gpafpd;
	}

	/**
	 * @return the ccosub
	 */
	public String getCcosub() {
		return ccosub;
	}

	@XmlAttribute
	/**
	 * @param ccosub the ccosub to set
	 */
	public void setCcosub(String ccosub) {
		this.ccosub = ccosub;
	}

	/**
	 * @return the cgrnum
	 */
	public String getCgrnum() {
		return cgrnum;
	}

	@XmlAttribute
	/**
	 * @param cgrnum the cgrnum to set
	 */
	public void setCgrnum(String cgrnum) {
		this.cgrnum = cgrnum;
	}

	/**
	 * @return the dsgrpf
	 */
	public String getDsgrpf() {
		return dsgrpf;
	}

	@XmlAttribute
	/**
	 * @param dsgrpf the dsgrpf to set
	 */
	public void setDsgrpf(String dsgrpf) {
		this.dsgrpf = dsgrpf;
	}

	/**
	 * @return the dclssf
	 */
	public String getDclssf() {
		return dclssf;
	}

	@XmlAttribute
	/**
	 * @param dclssf the dclssf to set
	 */
	public void setDclssf(String dclssf) {
		this.dclssf = dclssf;
	}

	/**
	 * @return the cnatsp
	 */
	public String getCnatsp() {
		return cnatsp;
	}

	@XmlAttribute
	/**
	 * @param cnatsp the cnatsp to set
	 */
	public void setCnatsp(String cnatsp) {
		this.cnatsp = cnatsp;
	}

	/**
	 * @return the dcntsf
	 */
	public int getDcntsf() {
		return dcntsf;
	}

	@XmlAttribute
	/**
	 * @param dcntsf the dcntsf to set
	 */
	public void setDcntsf(int dcntsf) {
		this.dcntsf = dcntsf;
	}

	/**
	 * @return the drcsuba
	 */
	public float getDrcsuba() {
		return drcsuba;
	}

	@XmlAttribute
	/**
	 * @param drcsuba the drcsuba to set
	 */
	public void setDrcsuba(float drcsuba) {
		this.drcsuba = drcsuba;
	}

	/**
	 * @return the pdl
	 */
	public String getPdl() {
		return pdl;
	}

	@XmlAttribute
	/**
	 * @param pdl the pdl to set
	 */
	public void setPdl(String pdl) {
		this.pdl = pdl;
	}

	/**
	 * @return the dnulot
	 */
	public String getDnulot() {
		return dnulot;
	}

	@XmlAttribute
	/**
	 * @param dnulot the dnulot to set
	 */
	public void setDnulot(String dnulot) {
		this.dnulot = dnulot;
	}

	/**
	 * @return the dreflf
	 */
	public String getDreflf() {
		return dreflf;
	}

	@XmlAttribute
	/**
	 * @param dreflf the dreflf to set
	 */
	public void setDreflf(String dreflf) {
		this.dreflf = dreflf;
	}	

	/**
	 * @return the ccostn
	 */
	public String getCcostn() {
		return ccostn;
	}

	@XmlAttribute
	/**
	 * @param ccostn the ccostn to set
	 */
	public void setCcostn(String ccostn) {
		this.ccostn = ccostn;
	}
	
}
