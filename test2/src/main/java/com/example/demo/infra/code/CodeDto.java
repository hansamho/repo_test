package com.example.demo.infra.code;

import java.sql.Date;

public class CodeDto {              

	private String seq;
	private String name;
	private Date codeCreate;
	private Integer codeDelete;
	
	private String code_seq; //그룹코드seq
	private String cg_name; //그룹코드name
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCodeCreate() {
		return codeCreate;
	}
	public void setCodeCreate(Date codeCreate) {
		this.codeCreate = codeCreate;
	}
	public Integer getCodeDelete() {
		return codeDelete;
	}
	public void setCodeDelete(Integer codeDelete) {
		this.codeDelete = codeDelete;
	}
	public String getCode_seq() {
		return code_seq;
	}
	public void setCode_seq(String code_seq) {
		this.code_seq = code_seq;
	}
	public String getCg_name() {
		return cg_name;
	}
	public void setCg_name(String cg_name) {
		this.cg_name = cg_name;
	}
	
	
}