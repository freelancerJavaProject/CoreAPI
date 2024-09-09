package com.plot.CoreAPI.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShailerPortfolio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shailerPortfolioId;
	private String country;
	private String state;
	private String area;
	private String plotLocation;
	private LocalDate createdOn;
	private String minAmt;
	private String maxAmt;
	private String plotSize;
	private String lenghtWidth;
	private String pastPlotRegistName;
	private String pastPlotRegistRelationShip;
	private LocalDate previousPlotRegistOn;
	private String plotCategory;
	private int plotId;
	private String currentPlotOwnerName;
	private String plotBasicInfo;
	private String uploadPlotDocs;
	private String verifyPlotStatus;
	private String uploadVerifyGovPlotDocs;
	private String uploadPlotImages;
	private String noOfplotImageRequired;
	private String approver1;
	private String approver1Remarks;
	private String approver2;
	private String approver2Remarks;
	private boolean isAggrimentWithOwner;
	private String uploadAggrimentDoc;
	private String couponCode;
	private boolean isCouponCodeApplicable;
	private int noOfBuyerAllow;
	private String remarks;
	
	
}
