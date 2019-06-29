package ac.ke.egerton.egerton.model.enumerated;

public enum Status {
	PENDING("PENDING"),
	REJECTED("REJECTED"),
	ACCEPTED("ACCEPTED");

	private final String status;

	Status(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}
