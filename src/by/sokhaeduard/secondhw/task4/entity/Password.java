package by.sokhaeduard.secondhw.task4.entity;

public class Password {
	private final String PASSW1= "222";
	private String passw2;

	public Password() {
	}

	public String getPassw2() {
		return passw2;
	}

	public void setPassw2(String passw2) {
		this.passw2 = passw2;
	}

	public String getPassw1() {
		return PASSW1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((passw2 == null) ? 0 : passw2.hashCode());
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
		Password other = (Password) obj;
		if (passw2 == null) {
			if (other.passw2 != null)
				return false;
		} else if (!passw2.equals(other.passw2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Password [passw2=" + passw2 + "]";
	}
	
}
