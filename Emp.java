import java.io.*;
public class Emp implements Serializable {
	private Integer empno;
	private String ename;
	private String eage;
	private String hibenate;
	private Double sal;
	private Double comm;
	private Emp mgr;
	public String toString() {
		return "一位雇员"
	}
}