/**
 * 
 */
package model;

/**
 * @author trainee
 *
 */
public class CustomerContact {
	private int phoneNumber;
	private int mobileNumber;
	private String email;
	/**
	 * @param phoneNumber
	 * @param mobileNumber
	 * @param email
	 */
	public CustomerContact(int phoneNumber, int mobileNumber, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the mobileNumber
	 */
	public int getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerContact [phoneNumber=" + phoneNumber + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ "]";
	}
	
	
}
