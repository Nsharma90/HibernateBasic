package com.org.pojos;


public class User {
	
	private String usrName;
	private int usrId;
	
	
	public String getUsrName() {
		return usrName;
	}
	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}
	public int getUsrId() {
		return usrId;
	}
	public void setUsrId(int usrId) {
		this.usrId = usrId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + usrId;
		result = prime * result + ((usrName == null) ? 0 : usrName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (usrId != other.usrId)
			return false;
		if (usrName == null) {
			if (other.usrName != null)
				return false;
		} else if (!usrName.equals(other.usrName))
			return false;
		return true;
	}
	
	

}
