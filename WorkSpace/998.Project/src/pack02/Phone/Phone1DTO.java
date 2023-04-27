package pack02.Phone;


public class Phone1DTO {
	private String color;
	private String model;
	private String state;
	private String callState;

	

	public Phone1DTO(String color, String model, String state , String callState) {
		this.color = color;
		this.model = model;
		this.state = state;
		this.callState = callState;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCallState() {
		return callState;
	}

	public void setCallState(String callState) {
		this.callState = callState;
	}

	
}
