package grailspetstore

class User {
	String username
	String fullname
	String email
	String password
	Integer point
	Date recordDate
    static constraints = {
    }
	
	@Override
	public String toString() {
		return '$username'
	}
}
