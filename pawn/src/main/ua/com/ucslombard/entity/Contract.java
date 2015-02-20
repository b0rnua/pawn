package ua.com.ucslombard.entity;

import java.util.Date;
import java.util.List;

public class Contract {
	
	public Long id;
	public String number;
	public Contract parent;
	public Date dateOfTheContracat;
	public Date completionDateOfTheContract;
	public Date actualClosingDate;
	public List<Property> propertyList;
	public List<Operation> operations;
	public Client customer;
	
}
