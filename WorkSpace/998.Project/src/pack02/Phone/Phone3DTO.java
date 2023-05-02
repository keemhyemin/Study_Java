package pack02.Phone;

public class Phone3DTO extends Phone2DTO{
	
	private String internetState;
	private String webtoonApp;

	public Phone3DTO(String color, String model, String state, String callState, String dmbState, String channelInfo, String internetState, String webtoonApp) {
		super(color, model, state, callState, dmbState, channelInfo);
		this.internetState = internetState;
		this.webtoonApp = webtoonApp;

	}

	public String getInternetState() {
		return internetState;
	}

	public void setInternetState(String internetState) {
		this.internetState = internetState;
	}

	public String getWebtoonApp() {
		return webtoonApp;
	}

	public void setWebtoonApp(String webtoonApp) {
		this.webtoonApp = webtoonApp;
	}

	
}
