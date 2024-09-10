package com.plot.CoreAPI.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="BUYER_PORTFOLIO")
public class BuyerPortfolio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer buyerPortfolioId;
	private String country;
	private String state;
	private String areaDivision;
	private String area;
	private String searchLocation;
	private int allowNoOfUsers;
	private LocalDate createdOn;
	private String minRangAmt;
	private String maxRangAmt;
	private String lumsumAmt;
	private String plotSize;
	private String plotRegistName;
	private String plotRegistRelationShip;
	private String plotResitStatus;
	private LocalDate plotRegistOn;
	private String plotCategory;
	private int plotId;
	private LocalDate plotSelectedOn;
	private int tokentAmt;
	private LocalDate tokentAmtOn;
	private String payAmt;
	private String remarks;
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "buyer_Id")
	private BuyerRegistration buyerRegistration;

}
