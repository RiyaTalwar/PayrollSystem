
public class Einfo {
	private String empID;
	private String empName;
	private int _class;
	private int present=0;
	private int absent=0;
	private int penalty=0;
	public int getPenalty() {
		return penalty;
	}
	private int med_want_to_take=0;
	private int cas_want_to_take=0;
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int get_class() {
		return _class;
	}
	public void set_class(int _class) {
		this._class = _class;
	}
	public int getPresent() {
		return present;
	}
	public void setPresent(int p) {
		if(p==0)
			this.present=0;
		else
			++this.present;
	}
	public int getAbsent() {
		return absent;
	}
	public void setAbsent(int a) {
		if(a==0)
			this.absent=0;
		else
		++this.absent;
	}
	public int getMed_want_to_take() {
		return med_want_to_take;
	}
	public void setMed_want_to_take(int m) {
		if(m==0)
			med_want_to_take=0;
		else
		++this.med_want_to_take;
	}
	public int getCas_want_to_take() {
		return cas_want_to_take;
	}
	public void setCas_want_to_take(int c) {
		if(c==0)
			cas_want_to_take=0;
		else
		++this.cas_want_to_take;
	}
	
	void salary()
	{
		System.out.println("Employee "+empName+" belongs to class "+_class);
		switch(_class)
		{
			case 1:{int reg_salary=50000;
					int penalty_day=500;
					int sal_day=1666;
					int tot_salary=0;
					int tot_leaves_granted=0;
					int tot_absent=0;
					int tot_present=0;
					int m=0,c=0,am=0,ac=0;				//m=medical leaves taken , c=casual leaves taken
					int med_avai=6,cas_avai=6;
					if(med_want_to_take<=med_avai)
						m=med_want_to_take;
					else if(med_want_to_take>med_avai)
							{
								m=med_avai;
								am=med_want_to_take-med_avai;
							}
					if(cas_want_to_take<=cas_avai)
						c=cas_want_to_take;
					else if(cas_want_to_take>cas_avai)
							{
								c=cas_avai;
								ac=cas_want_to_take-cas_avai;
							}
					tot_leaves_granted=m+c;
					tot_absent=absent+am+ac;
					tot_present=30-tot_absent-tot_leaves_granted;
					penalty=tot_absent*penalty_day;
					tot_salary=(sal_day*tot_present)-penalty;
					System.out.println("Regular payable salary: "+reg_salary);
					System.out.println("Leaves granted: "+tot_leaves_granted);
					System.out.println("Penalty amount: "+penalty);
					System.out.println("Net Payable salary: "+tot_salary);
					System.out.println("Absent: "+tot_absent);
					System.out.println("Present: "+tot_present);
					System.out.println("Remaining leave status: ");
					System.out.println("Medical leaves available: "+med_avai);
					System.out.println("Medical leaves taken(granted): "+m);
					System.out.println("Remaining medical leaves: "+(med_avai-m));
					System.out.println("Casual leaves available: "+cas_avai);
					System.out.println("Casual leaves taken(granted): "+c);
					System.out.println("Remaining casual leaves: "+(cas_avai-c));
					}
					break;
				
			case 2:{int reg_salary=60000;
					int penalty_day=600;
					int sal_day=2000;
					int tot_salary=0;
					int tot_leaves_granted=0;
					int tot_absent=0;
					int tot_present=0;
					int m=0,c=0,am=0,ac=0;				//m=medical leaves taken , c=casual leaves taken
					int med_avai=5,cas_avai=5;
					if(med_want_to_take<=med_avai)
						m=med_want_to_take;
					else if(med_want_to_take>med_avai)
							{
								m=med_avai;
								am=med_want_to_take-med_avai;
							}
					if(cas_want_to_take<=cas_avai)
						c=cas_want_to_take;
					else if(cas_want_to_take>cas_avai)
							{
								c=cas_avai;
								ac=cas_want_to_take-cas_avai;
							}
					tot_leaves_granted=m+c;
					tot_absent=absent+am+ac;
					tot_present=30-tot_absent-tot_leaves_granted;
					penalty=tot_absent*penalty_day;
					tot_salary=(sal_day*tot_present)-penalty;
					System.out.println("Regular payable salary: "+reg_salary);
					System.out.println("Leaves granted: "+tot_leaves_granted);
					System.out.println("Penalty amount: "+penalty);
					System.out.println("Net Payable salary: "+tot_salary);
					System.out.println("Absent: "+tot_absent);
					System.out.println("Present: "+tot_present);
					System.out.println("Remaining leave status: ");
					System.out.println("Medical leaves available: "+med_avai);
					System.out.println("Medical leaves taken(granted): "+m);
					System.out.println("Remaining medical leaves: "+(med_avai-m));
					System.out.println("Casual leaves available: "+cas_avai);
					System.out.println("Casual leaves taken(granted): "+c);
					System.out.println("Remaining casual leaves: "+(cas_avai-c));
					}
					break;
					
			case 3:	{
				int reg_salary=70000;
				int penalty_day=700;
				int sal_day=2333;
				int tot_salary=0;
				int tot_leaves_granted=0;
				int tot_absent=0;
				int tot_present=0;
				int m=0,c=0,am=0,ac=0;				//m=medical leaves taken , c=casual leaves taken
				int med_avai=3,cas_avai=3;
				if(med_want_to_take<=med_avai)
					m=med_want_to_take;
				else if(med_want_to_take>med_avai)
						{
							m=med_avai;
							am=med_want_to_take-med_avai;
						}
				if(cas_want_to_take<=cas_avai)
					c=cas_want_to_take;
				else if(cas_want_to_take>cas_avai)
						{
							c=cas_avai;
							ac=cas_want_to_take-cas_avai;
						}
				tot_leaves_granted=m+c;
				
				tot_absent=absent+am+ac;
				tot_present=30-tot_absent-tot_leaves_granted;
				penalty=tot_absent*penalty_day;
				tot_salary=(sal_day*tot_present)-penalty;
				System.out.println("Regular payable salary: "+reg_salary);
				System.out.println("Leaves granted: "+tot_leaves_granted);
				System.out.println("Penalty amount: "+penalty);
				System.out.println("Net Payable salary: "+tot_salary);
				System.out.println("Absent: "+tot_absent);
				System.out.println("Present: "+tot_present);
				System.out.println("Remaining leave status: ");
				System.out.println("Medical leaves available: "+med_avai);
				System.out.println("Medical leaves taken(granted): "+m);
				System.out.println("Remaining medical leaves: "+(med_avai-m));
				System.out.println("Casual leaves available: "+cas_avai);
				System.out.println("Casual leaves taken(granted): "+c);
				System.out.println("Remaining casual leaves: "+(cas_avai-c));
				}
				break;
						
		}
	}
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	

}
