package com.plot.CoreAPI.entity;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="SELLER_REGISTRATION")
public class SellerRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sellerId;
	private String name;
	private String email;
	private String phone;
	private String currentAdrs;
	private String permanentAdrs;
	private LocalDate dob;
	private String userID;
	private String password;
	private boolean isPinSet;
	private LocalDate pinSetOn;
	private boolean isLoginOn;
	private boolean status;
	private String categoryCode;
	private String role;
	private String securityQuestion;
	private String securityAnswer;
	private String businessAccId;
	private String integrationGatewayId;
	private String profileVerify;
	private String profileImgUrl;
	private String lastService;
	private String jobProfile;
	private String annualIncome;
	private String aadharNo;
	private String penCardNo;
	private int totalPlotNo;
	private LocalDate createdOn;
	private String remark;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "sellerPortfolios" ,cascade = CascadeType.ALL)
	private Set<SellerPortfolio> sellerPortfoliosList;
	
	
	
	
	
	

}
