package com.kams.bean;

public class SmUseraction {
	private Integer id;

	private String reader;

	private Integer articalid;

	private String author;

	private String dianz;

	private String shouc;

	private String views;

	private String updateTime;

	private String chk;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReader() {
		return reader;
	}

	public void setReader(String reader) {
		this.reader = reader == null ? null : reader.trim();
	}

	public Integer getArticalId() {
		return articalid;
	}

	public void setArticalId(Integer articalid) {
		this.articalid = articalid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author == null ? null : author.trim();
	}

	public String getDianz() {
		return dianz;
	}

	public void setDianz(String dianz) {
		this.dianz = dianz == null ? null : dianz.trim();
	}

	public String getShouc() {
		return shouc;
	}

	public void setShouc(String shouc) {
		this.shouc = shouc == null ? null : shouc.trim();
	}

	public String getViews() {
		return views;
	}

	public void setViews(String views) {
		this.views = views == null ? null : views.trim();
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime == null ? null : updateTime.trim();
	}

	public String getChk() {
		return chk;
	}

	public void setChk(String chk) {
		this.chk = chk == null ? null : chk.trim();
	}

	public SmUseraction isRepeatView(SmUseraction smUseraction) {
		// TODO Auto-generated method stub
		return null;
	}
}