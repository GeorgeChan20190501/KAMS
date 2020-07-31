package com.kams.bean;

public class SmGonggao {
	private Integer id;

	private String title;

	private String discrib;

	private String timestamp;

	private String type;

	private String contenttype;

	private String href;

	private String views;

	private String favo;

	private String commnum;

	private String author;

	private String isHot;

	private String bg;

	private String updateTime;

	private String chk;

	private String artical;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getDiscrib() {
		return discrib;
	}

	public void setDiscrib(String discrib) {
		this.discrib = discrib == null ? null : discrib.trim();
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp == null ? null : timestamp.trim();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	public String getContentType() {
		return contenttype;
	}

	public void setContentType(String contenttype) {
		this.contenttype = contenttype == null ? null : contenttype.trim();
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href == null ? null : href.trim();
	}

	public String getViews() {
		return views;
	}

	public void setViews(String views) {
		this.views = views == null ? null : views.trim();
	}

	public String getFavo() {
		return favo;
	}

	public void setFavo(String favo) {
		this.favo = favo == null ? null : favo.trim();
	}

	public String getCommnum() {
		return commnum;
	}

	public void setCommnum(String commnum) {
		this.commnum = commnum == null ? null : commnum.trim();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author == null ? null : author.trim();
	}

	public String getIsHot() {
		return isHot;
	}

	public void setIsHot(String isHot) {
		this.isHot = isHot == null ? null : isHot.trim();
	}

	public String getBg() {
		return bg;
	}

	public void setBg(String bg) {
		this.bg = bg == null ? null : bg.trim();
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

	public String getArtical() {
		return artical;
	}

	public void setArtical(String artical) {
		this.artical = artical == null ? null : artical.trim();
	}
}