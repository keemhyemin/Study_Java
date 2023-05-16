package pack03.Board;

public class BoardDTO {

	private int member_age, text_number;
	private String member_id, member_pw, member_name, membercall, title, contents, write_date;
	private String loginState;

	public BoardDTO(String loginState) {
		this.loginState = loginState;
	}

	public int getMember_age() {
		return member_age;
	}

	public void setMember_age(int member_age) {
		this.member_age = member_age;
	}

	public int getText_number() {
		return text_number;
	}

	public void setText_number(int text_number) {
		this.text_number = text_number;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMembercall() {
		return membercall;
	}

	public void setMembercall(String membercall) {
		this.membercall = membercall;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWrite_date() {
		return write_date;
	}

	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}

	public String getLoginState() {
		return loginState;
	}

	public void setLoginState(String loginState) {
		this.loginState = loginState;
	}

}