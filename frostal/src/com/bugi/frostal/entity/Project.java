package com.bugi.frostal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="projects")
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="company_address")
	private String company_address;
	
	@Column(name="product_name")
	private String product_name;
	
	@Column(name="production_kg_per_h")
	private int production_kg_per_h;
	
	@Column(name="production_hours_per_day")
	private int production_hours_per_day;
	
	@Column(name="production_days_per_year")
	private int production_days_per_year;
	
	@Column(name="startups_per_year")
	private int startups_per_year;
	
	@Column(name="annual_production")
	private int annual_production;
	
	@Column(name="water_con")
	private int water_con;
	
	@Column(name="fat_con")
	private int fat_con;
	
	@Column(name="dryMatter_con")
	private int dryMatter_con;
	
	@Column(name="infeed_temp")
	private int infeed_temp;
	
	@Column(name="outfeed_temp")
	private int outfeed_temp;
	
	@Column(name="temp_diff")
	private int temp_diff;
	
	@Column(name="product_length")
	private int product_length;
	
	@Column(name="clearance_length")
	private int clearance_length;
	
	@Column(name="product_width")
	private int product_width;
	
	@Column(name="clearance_width")
	private int clearance_width;
	
	@Column(name="product_height")
	private int product_height;
	
	@Column(name="product_weight")
	private int product_weight;
	
	@Column(name="est_ret_time")
	private int est_ret_time;
	
	@Column(name="theo_lin_cons")
	private double theo_lin_cons;
	
	@Column(name="startup_cons")
	private double startup_cons;
	
	@Column(name="idling_cons")
	private double idling_cons;
	
	@Column(name="total_lin_kg")
	private double total_lin_kg;
	
	@Column(name="total_lin_year")
	private int total_lin_year;

	public double getTheo_lin_cons() {
		return theo_lin_cons;
	}

	public void setTheo_lin_cons(double theo_lin_cons) {
		this.theo_lin_cons = theo_lin_cons;
	}

	public double getStartup_cons() {
		return startup_cons;
	}

	public void setStartup_cons(double startup_cons) {
		this.startup_cons = startup_cons;
	}

	public double getIdling_cons() {
		return idling_cons;
	}

	public void setIdling_cons(double idling_cons) {
		this.idling_cons = idling_cons;
	}

	public double getTotal_lin_kg() {
		return total_lin_kg;
	}

	public void setTotal_lin_kg(double total_lin_kg) {
		this.total_lin_kg = total_lin_kg;
	}

	public int getTotal_lin_year() {
		return total_lin_year;
	}

	public void setTotal_lin_year(int total_lin_year) {
		this.total_lin_year = total_lin_year;
	}

	public Project() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_address() {
		return company_address;
	}

	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduction_kg_per_h() {
		return production_kg_per_h;
	}

	public void setProduction_kg_per_h(int production_kg_per_h) {
		this.production_kg_per_h = production_kg_per_h;
	}

	public int getProduction_hours_per_day() {
		return production_hours_per_day;
	}

	public void setProduction_hours_per_day(int production_hours_per_day) {
		this.production_hours_per_day = production_hours_per_day;
	}

	public int getProduction_days_per_year() {
		return production_days_per_year;
	}

	public void setProduction_days_per_year(int production_days_per_year) {
		this.production_days_per_year = production_days_per_year;
	}

	public int getStartups_per_year() {
		return startups_per_year;
	}

	public void setStartups_per_year(int startups_per_year) {
		this.startups_per_year = startups_per_year;
	}

	public int getAnnual_production() {
		return annual_production;
	}

	public void setAnnual_production(int annual_production) {
		this.annual_production = annual_production;
	}

	public int getWater_con() {
		return water_con;
	}

	public void setWater_con(int water_con) {
		this.water_con = water_con;
	}

	public int getFat_con() {
		return fat_con;
	}

	public void setFat_con(int fat_con) {
		this.fat_con = fat_con;
	}

	public int getDryMatter_con() {
		return dryMatter_con;
	}

	public void setDryMatter_con(int dryMatter_con) {
		this.dryMatter_con = dryMatter_con;
	}

	public int getInfeed_temp() {
		return infeed_temp;
	}

	public void setInfeed_temp(int infeed_temp) {
		this.infeed_temp = infeed_temp;
	}

	public int getOutfeed_temp() {
		return outfeed_temp;
	}

	public void setOutfeed_temp(int outfeed_temp) {
		this.outfeed_temp = outfeed_temp;
	}

	public int getTemp_diff() {
		return temp_diff;
	}

	public void setTemp_diff(int temp_diff) {
		this.temp_diff = temp_diff;
	}

	public int getProduct_length() {
		return product_length;
	}

	public void setProduct_length(int product_length) {
		this.product_length = product_length;
	}

	public int getClearance_length() {
		return clearance_length;
	}

	public void setClearance_length(int clearance_length) {
		this.clearance_length = clearance_length;
	}

	public int getProduct_width() {
		return product_width;
	}

	public void setProduct_width(int product_width) {
		this.product_width = product_width;
	}

	public int getClearance_width() {
		return clearance_width;
	}

	public void setClearance_width(int clearance_width) {
		this.clearance_width = clearance_width;
	}

	public int getProduct_height() {
		return product_height;
	}

	public void setProduct_height(int product_height) {
		this.product_height = product_height;
	}

	public int getProduct_weight() {
		return product_weight;
	}

	public void setProduct_weight(int product_weight) {
		this.product_weight = product_weight;
	}

	public int getEst_ret_time() {
		return est_ret_time;
	}

	public void setEst_ret_time(int est_ret_time) {
		this.est_ret_time = est_ret_time;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", company_name=" + company_name + ", company_address=" + company_address
				+ ", product_name=" + product_name + ", production_kg_per_h=" + production_kg_per_h
				+ ", production_hours_per_day=" + production_hours_per_day + ", production_days_per_year="
				+ production_days_per_year + ", startups_per_year=" + startups_per_year + ", annual_production="
				+ annual_production + ", water_con=" + water_con + ", fat_con=" + fat_con + ", dryMatter_con="
				+ dryMatter_con + ", infeed_temp=" + infeed_temp + ", outfeed_temp=" + outfeed_temp + ", temp_diff="
				+ temp_diff + ", product_length=" + product_length + ", clearance_length=" + clearance_length
				+ ", product_width=" + product_width + ", clearance_width=" + clearance_width + ", product_height="
				+ product_height + ", product_weight=" + product_weight + ", est_ret_time=" + est_ret_time
				+ ", theo_lin_cons=" + theo_lin_cons + ", startup_cons=" + startup_cons + ", idling_cons=" + idling_cons
				+ ", total_lin_kg=" + total_lin_kg + ", total_lin_year=" + total_lin_year + "]";
	}

	

	
	
	
	
}
