package pack02.Phone;

public class Phone2DTO extends Phone1DTO {

	private String dmbState;
	private int channel;

	public Phone2DTO(String color, String model, String state, String callState) {
		super(color, model, state, callState);

	}

	public String getDmbState() {
		return dmbState;
	}

	public void setDmbState(String dmbState) {
		this.dmbState = dmbState;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

}