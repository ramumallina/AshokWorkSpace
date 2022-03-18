package in.ashokit.request;

public class PassengerRequest {

	private String dob;
	private String doj;
	private String from;
	private String gender;
	private String name;
	private String to;
	private String trainNo;

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	@Override
	public String toString() {
		return "PassengerRequest [dob=" + dob + ", doj=" + doj + ", from=" + from + ", gender=" + gender + ", name="
				+ name + ", to=" + to + ", trainNo=" + trainNo + "]";
	}

}
