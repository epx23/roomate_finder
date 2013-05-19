package org.apache.struts.register.model;

public class usr
{
	private String fname, lname, email, username, password;
	private String major;
	private boolean nightowl, job, smoke, pets;
	private int clean, studytime, age, outgoing, noise, company;
	
	
	//empty constructor
	public usr()
	{
		fname = lname = email = username = password = major = "";
		nightowl = job = smoke = pets = false;
		clean = studytime = age = outgoing = noise = company = 0;
	}//end usr
	
	public usr(Person other)
	{
		nightowl = job = smoke = pets = false;
		clean = studytime = age = outgoing = noise = company = 0;
	}//end usr
	
	//full constructor
	public usr(String fname, 
				String lname, 
				String email, 
				String username, 
				String password,
				String major,
				boolean nightowl, 
				boolean job, 
				boolean smoke, 
				boolean pets,
				int clean, 
				int studytime, 
				int age,
				int outgoing,
				int noise,
				int company)
	{
		this.fname = fname; this.lname = lname;
		this.email = email;
		this.username = username;
		this.password = password;
		
		this.major = major;
		this.nightowl = nightowl;
		this.job = job;
		this.smoke = smoke;
		this.pets = pets;
		this.clean = clean;
		this.studytime = studytime;
		this.age = age;
		this.outgoing = outgoing;
		this.noise = noise;
		this.company = company;
	}//end usr
	
	public usr(usr other)
	{
		this.fname = other.getFname(); this.lname = other.getLname();
		this.email = other.getEmail();
		this.username = other.getUsername();
		this.password = other.getPassword();
		
		this.major = other.getMajor();
		this.nightowl = other.getNightowl();
		this.job = other.getJob();
		this.smoke = other.getSmoke();
		this.pets = other.getPets();
		this.clean = other.getClean();
		this.studytime = other.getStudytime();
		this.age = other.getAge();
		this.outgoing = other.getOutgoing();
		this.noise = other.getNoise();
		this.company = other.getCompany();
	}//end usr
	
	//gets
	public String getFname(){return this.fname;}
	public String getLname(){return this.lname;}
	public String getEmail(){return this.email;}
	public String getUsername(){return this.username;}
	public String getPassword(){return this.password;}
	
	public String getMajor(){return this.major;}
	public boolean getNightowl(){return this.nightowl;}
	public boolean getJob(){return this.job;}
	public boolean getSmoke(){return this.smoke;}
	public boolean getPets(){return this.pets;}
	public int getClean(){return this.clean;}
	public int getStudytime(){return this.studytime;}
	public int getAge(){return this.age;}
	public int getOutgoing(){return this.outgoing;}
	public int getNoise(){return this.noise;}
	public int getCompany(){return this.company;}
	
	//sets
	public void setFname(String in){this.fname = in;}
	public void setLname(String in){this.lname = in;}
	public void setEmail(String in){this.email = in;}
	public void setUsername(String in){this.username = in;}
	public void setPassword(String in){this.password = in;}
	
	public void setMajor(String in){this.major = in;}
	public void setNightowl(boolean in){this.nightowl = in;}
	public void setJob(boolean in){this.job = in;}
	public void setSmoke(boolean in){this.smoke = in;}
	public void setPets(boolean in){this.pets = in;}
	public void setClean(int in){this.clean = in;}
	public void setStudytime(int in){this.studytime = in;}
	public void setAge(int in){this.age = in;}
	public void setOutgoing(int in){this.outgoing = in;}
	public void setNoise(int in){this.noise = in;}
	public void setCompany(int in){this.company = in;}
	
	//compare
	public int compare(usr other)
	{
	
		/**
			score base 0-10 where 10 is best fit
			each successful compatablility (with range) 
			adds one to out (compatablility rating) 
		**/
		
		int out = 0;
		//nightowl
		if(this.nightowl && other.nightowl)out++;
		//job
		if(this.job && other.job)out++;
		//smoke
		if(this.smoke && other.smoke)out++;
		//pets
		if(this.pets && other.pets)out++;
		//clean
		if(this.clean == other.clean)out++;
		else if (this.clean == other.clean - 1)out++;
		else if (this.clean == other.clean + 1)out++;
		//studytime
		if(this.studytime == other.studytime)out++;
		else if (this.studytime == other.clean - 1)out++;
		else if (this.studytime == other.clean + 1)out++;
		//age
		if(this.age == other.age)out++;
		else if (this.age == other.age - 1)out++;
		else if (this.age == other.age + 1)out++;
		//outgoing
		if(this.outgoing == other.outgoing)out++;
		else if (this.outgoing == other.outgoing - 1)out++;
		else if (this.outgoing == other.outgoing + 1)out++;
		//noise
		if(this.noise == other.noise)out++;
		else if (this.noise == other.noise - 1)out++;
		else if (this.noise == other.noise + 1)out++;
		//company
		if(this.company == other.company)out++;
		else if (this.company == other.company - 1)out++;
		else if (this.company == other.company + 1)out++;
		
		return out;
	}//end compare
	
	//quick compare
	public boolean isCompatable(usr other){
          return (this.compare(other) >= 8); 
        }
	
/*	public apartment[] apartments(apartment apartments[])
	{
		apartment out[] = null;
		int count = 0;
		
		for(int i=0; i<apartments.length; i++)
			if(apartments[i].getUsername().compareTo(this.username) == 0)
				count++;
				
		if(count != 0)
		{
			out = new apartment[count];
			count = 0;
			for(int i=0; i<apartments.length; i++)
				if(apartments[i].getUsername().compareTo(this.username) == 0)
					{out[count] = new apartment(apartments[i]);count++;}
		}//end if
		
		return out[]; //non initialized = non found
	}//end apartments
*/
}//end usr class