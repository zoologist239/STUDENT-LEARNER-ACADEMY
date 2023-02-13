package servlet.jdbc.student.copy;

public class StudentEntity {

	private int id;
	private String name, contact, email, course, batch;

	public StudentEntity() {
		super();
	}

	public StudentEntity(String name, String contact, String email, String course, String batch) {
		super();
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.course = course;
		this.batch = batch;
	}

	public StudentEntity(int id, String name, String contact, String email, String course, String batch) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.course = course;
		this.batch = batch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + ", course="
				+ course + ", batch=" + batch + "]";
	}
}
