/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author Shweta Shivraj Mangrule
 *
 */
public class Statement {
	private Date date;
	private String content;
	/**
	 * @param date
	 * @param content
	 */
	public Statement(Date date, String content) {
		super();
		this.date = date;
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Statement [content=" + content + "]";
	}
	

}
