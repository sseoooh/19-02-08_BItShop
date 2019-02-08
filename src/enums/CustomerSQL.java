package enums;

public enum CustomerSQL {
	SIGNUP, SIGNIN;
	@Override
	public String toString() {
		StringBuffer query= new StringBuffer();		
	
		switch (this) {
		case SIGNUP:
			System.out.println("CustomerSQL에서 SIGNUP을 탐");
			query.append("INSERT INTO CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, PASSWORD, ADDRESS, CITY, POSTALCODE, SSN)"
					+ " VALUES("
					+ " ?, ?, ?, ?, ?, ?, ?)");
					break;
					
		case SIGNIN:
			System.out.println("CustomerSQL에서 SIGNIN을 탐");
			query.append("SELECT * FROM CUSTOMERS\n"
					+ " WHERE CUSTOMER_ID LIKE ? AND PASSWORD LIKE ?");
					break;
					
		default:
			break;
		}
		return query.toString();
	}
}




