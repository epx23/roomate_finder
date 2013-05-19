public class Apartment {
	
	private String username;
	private String town;
	private String state;
	private String street;
	private int capacity;
	private int currentCapacity;
	private String description;
	private boolean petsAllowed;
	private boolean smokingAllowed;
	
	//Empty Constructor
	public Apartment() {
		username = "";
		town = "";
		state = "";
		street = "";
		capacity = 0;
		currentCapacity = 0;
		description = "";
		petsAllowed = false;
		smokingAllowed = false;
	}
	
	//Full Constructor
	public Apartment(String owner, String state, String town, String street, int capacity, int currentCapacity, String description, boolean petsAllowed, boolean smokingAllowed){
		
		this.username = owner;
		this.state = state;
		this.town = town;
		this.street = street;
		this.capacity = capacity;
		this.currentCapacity = currentCapacity;
		this.description = description;
		this.petsAllowed = petsAllowed;
		this.smokingAllowed = smokingAllowed;
	}
	
	//Constructor from another apartment
	public Apartment(Apartment apt){
		
		this.username = apt.getUsername();
		this.state = apt.getState();
		this.town = apt.getTown();
		this.street = apt.getStreet();
		this.capacity = apt.getCapacity();
		this.currentCapacity = apt.getCurrentCapacity();
		this.description = apt.getDescription();
		this.petsAllowed = apt.isPetsAllowed();
		this.smokingAllowed = apt.isSmokingAllowed();
	}
	
	
	//Get and Set methods for each variable 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getCurrentCapacity() {
		return currentCapacity;
	}
	public void setCurrentCapacity(int currentCapacity) {
		this.currentCapacity = currentCapacity;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isPetsAllowed() {
		return petsAllowed;
	}
	public void setPetsAllowed(boolean petsAllowed) {
		this.petsAllowed = petsAllowed;
	}
	
	public boolean isSmokingAllowed() {
		return smokingAllowed;
	}
	public void setSmokingAllowed(boolean smokingAllowed) {
		this.smokingAllowed = smokingAllowed;
	}
	
	

}