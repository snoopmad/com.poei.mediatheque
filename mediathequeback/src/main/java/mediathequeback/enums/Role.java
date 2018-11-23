package mediathequeback.enums;

public enum Role {

	USER("USER"), ADMIN("ADMIN");

	private final String nomRole;

	Role(String role) {
		this.nomRole = role;
	}

	public String getNomRole() {
		return nomRole;
	}
}
