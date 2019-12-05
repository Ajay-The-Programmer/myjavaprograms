

package ass2pro1;

public class StudentInfo {
	private String name;
	private int rollNo;
	private String cls;
	private double percentage;
	public StudentInfo(String name,int rollNo, String cls, double percentage) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.cls = cls;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", rollNo=" + rollNo + ", cls=" + cls + ", percentage=" + percentage + "]";
	}
	
	
	

}
