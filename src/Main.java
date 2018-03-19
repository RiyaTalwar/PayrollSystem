import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException
	{
		
		Scanner a=new Scanner(new File("/Users/Riya/Desktop/java workspace/payroll system/src/EmployeeInfo.txt"));
		Scanner b=new Scanner(new File("/Users/Riya/Desktop/java workspace/payroll system/src/Employee Attendance Log Month 1.txt"));
		Scanner c=new Scanner(new File("/Users/Riya/Desktop/java workspace/payroll system/src/Employee Attendance Log Month 2.txt"));
		int noe=a.nextInt();
		a.nextLine();
		Einfo ei[]=new Einfo[noe];
		int n=noe*30;
		Eatten ea[]=new Eatten[n];
		for(int i=0;i<noe;i++)
		{
			ei[i]=new Einfo();
			String p[]=a.nextLine().split(",");
			ei[i].setEmpID(p[0]);
			ei[i].setEmpName(p[1]);
			String q[]=a.nextLine().split(",");
			ei[i].set_class(Integer.parseInt(q[1]));
			a.nextLine();
			a.nextLine();
			
		}
		//TASK A
		System.out.println("TASK A");
		for(int i=0;i<n;i++)
		{
			ea[i]=new Eatten();
			String p[]=b.nextLine().split(",");
			ea[i].setDate(p[0]);
			ea[i].setAttendance_status(p[1]);
			ea[i].setEmpid(p[2]);
			for(int j=0;j<noe;j++)
			{
				if(ei[j].getEmpID().equals(p[2]))
				{
					if(p[1].equals("P"))
						ei[j].setPresent(1);
					else if(p[1].equals("A"))
						ei[j].setAbsent(1);
					else if(p[1].equals("M"))
						ei[j].setMed_want_to_take(1);
					else if(p[1].equals("C"))
						ei[j].setCas_want_to_take(1);
					else if(p[1].equals("L"))
						ei[j].setAbsent(1);
				}
			}
		}
		for(int i=0;i<noe;i++)
		{
			ei[i].salary();
			System.out.println();
			System.out.println();
		}
		//TASK B
		System.out.println("TASK B");
		for(int i=0;i<noe;i++)
		{
			if(ei[i].getPenalty()>=1000)
			{
				if(ei[i].get_class()==1)
					ei[i].set_class(2);
				else if(ei[i].get_class()==2)
					ei[i].set_class(3);
				else if(ei[i].get_class()==3)
					ei[i].set_class(0);
			}
			else if(ei[i].getPenalty()<=500)
			{
				if(ei[i].get_class()==2)
					ei[i].set_class(1);
				else if(ei[i].get_class()==3)
					ei[i].set_class(2);
			}
		}
		FileWriter f=new FileWriter("/Users/Riya/Desktop/java workspace/payroll system/src/new.txt");
        for(int j=0;j<noe;j++)
        {
           // f.write(ei[j].getEmpID()+","+ei[j].getEmpName()+"\n");
            if(ei[j].get_class()==0)
            {
            //f.write("Class,Removed"+"\n");
            for(int i=j;i<noe-1;i++)
            	ei[i]=ei[i+1];
            noe=noe-1;
            j=j-1;
            }
            else
            {
            	f.write(ei[j].getEmpID()+","+ei[j].getEmpName()+"\n");
            f.write("Class,"+ei[j].get_class()+"\n");}
         //   f.write("Medical,"+ei[j].get+"\n");
         //   f.write("Casual,"+ei[j].cleave+"\n");
        }
        f.close();
		for(int j=0;j<noe;j++)
		{
			ei[j].setPresent(0);
			ei[j].setAbsent(0);
			ei[j].setPenalty(0);
			ei[j].setCas_want_to_take(0);
			ei[j].setMed_want_to_take(0);
		}
		for(int i=0;i<n;i++)
		{
			String p[]=c.nextLine().split(",");
			ea[i].setDate(p[0]);
			ea[i].setAttendance_status(p[1]);
			ea[i].setEmpid(p[2]);
			for(int j=0;j<noe;j++)
			{
				if(ei[j].getEmpID().equals(p[2]))
				{
					if(p[1].equals("P"))
						ei[j].setPresent(1);
					else if(p[1].equals("A"))
						ei[j].setAbsent(1);
					else if(p[1].equals("M"))
						ei[j].setMed_want_to_take(1);
					else if(p[1].equals("C"))
						ei[j].setCas_want_to_take(1);
					else if(p[1].equals("L"))
						ei[j].setAbsent(1);
				}
			}
		}
		for(int i=0;i<noe;i++)
		{
			if(ei[i].get_class()==0)
				System.out.println(ei[i].getEmpName()+" is fired");
			else
				ei[i].salary();
			System.out.println();
			System.out.println();
		}
	
		a.close();
		b.close();
		c.close();
	}

}
