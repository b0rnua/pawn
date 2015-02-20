package ua.com.ucslombard.entity;

import java.util.Date;
import java.util.List;

public class Client {
	
	public Long id;
	public String name;
	public List<Contract> contracts;
	public Date dateOfRegistration;
	public List<ContactClient> contacts;

}
